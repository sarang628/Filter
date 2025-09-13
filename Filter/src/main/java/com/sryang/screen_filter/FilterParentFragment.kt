package com.sryang.screen_filter

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.fragment.app.viewModels
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.repeatOnLifecycle
import com.example.travelmode.SelectNationFragment
import com.example.travelmode.SelectNationViewModel
import com.sryang.screen_filter.databinding.FragmentFilterParentBinding
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.InternalCoroutinesApi
import kotlinx.coroutines.flow.FlowCollector
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch
import kotlinx.coroutines.newSingleThreadContext

/**
 * [FragmentFilterParentBinding]
 * [FilterViewModel]
 */
@AndroidEntryPoint
class FilterParentFragment : Fragment() {
    private val viewModel: FilterViewModel by viewModels()
    private val nationFragment = SelectNationFragment();

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val binding = FragmentFilterParentBinding.inflate(layoutInflater, container, false).apply {
            filterViewModel = viewModel
            lifecycleOwner = viewLifecycleOwner
        }
        initEvent(binding)
        subScribeUI(binding)

        return binding.root
    }

    private fun initEvent(binding: FragmentFilterParentBinding) {
        binding.constraintLayout2.setOnClickListener {
            nationFragment.show(childFragmentManager, "")
        }
    }

    /**
     * UI 구독
     */
    private fun subScribeUI(binding: FragmentFilterParentBinding) {
        lifecycleScope.launch {
            viewModel.selected.collect {
                if (nationFragment.isVisible)
                    nationFragment.dismiss()
            }
        }
        // 검색 선택

        // 맵의 빈 공간 클릭 시
        lifecycleScope.launch {
            repeatOnLifecycle(Lifecycle.State.RESUMED) {
                viewModel.showRestaurantCardAndFilter.collect {
                    showFilter(it, binding.clFilterParent)
                }
            }
        }

        lifecycleScope.launch {
            repeatOnLifecycle(Lifecycle.State.RESUMED) {
                viewModel.uiState.collect {
                }
            }
        }

    }

    /**
     * 맵 클릭 시 필터 보여주는 애니메이션
     */
    private fun showFilter(b: Boolean, view: View) {
        val animation = AnimationUtils.loadAnimation(
            requireContext(), if (b) R.anim.slide_down else R.anim.slide_up
        )

        view.startAnimation(animation)

        animation.setAnimationListener(object : Animation.AnimationListener {
            override fun onAnimationStart(animation: Animation) {
                if (b) view.visibility = View.VISIBLE
            }

            override fun onAnimationEnd(animation: Animation) {
                if (!b) view.visibility = View.GONE
            }

            override fun onAnimationRepeat(animation: Animation) {}
        })
        view.visibility = if (!b) View.INVISIBLE else View.VISIBLE
    }
}