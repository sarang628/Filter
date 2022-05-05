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
import androidx.lifecycle.ViewModel
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.repeatOnLifecycle
import androidx.navigation.fragment.NavHostFragment
import com.example.torang_core.data.model.Filter
import com.example.torang_core.util.EventObserver
import com.example.torang_core.util.Logger
import com.example.travelmode.SelectNationFragment
import com.example.travelmode.SelectNationViewModel
import com.sryang.screen_filter.databinding.FragmentFilterParentBinding
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch

/**
 * [FragmentFilterParentBinding]
 * [FilterViewModel]
 */
@AndroidEntryPoint
class FilterParentFragment : Fragment() {
    private val viewModel: FilterViewModel by viewModels()
    private val nationFragment = SelectNationFragment();
    private val selectNationViewModel: SelectNationViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val binding = FragmentFilterParentBinding.inflate(layoutInflater, container, false)
        binding.filterViewModel = viewModel
        binding.selectNationViewModel = selectNationViewModel
        binding.lifecycleOwner = viewLifecycleOwner
        subScribeUI(binding)

        return binding.root
    }

    /**
     * UI 구독
     */
    private fun subScribeUI(binding: FragmentFilterParentBinding) {
        selectNationViewModel.selected.observe(viewLifecycleOwner) {
            if (nationFragment.isVisible)
                nationFragment.dismiss()
        }
        // 검색 선택

        // 맵의 빈 공간 클릭 시
        lifecycleScope.launch {
            repeatOnLifecycle(Lifecycle.State.RESUMED) {
                viewModel.clickMap.collect {
                    Logger.d(it.toString())
                    showFilter(it, binding.clFilterParent)
                }
            }
        }

        lifecycleScope.launch {
            repeatOnLifecycle(Lifecycle.State.RESUMED) {
                viewModel.uiState.collect {
                    Logger.d(it.toString())
                }
            }
        }

    }

    /**
     * 맵 클릭 시 필터 보여주는 애니메이션
     */
    private fun showFilter(b: Boolean, view: View) {
        Logger.d("showFilter:$b")
        val animation = AnimationUtils.loadAnimation(
            requireContext(), if (b) R.anim.slide_up else R.anim.slide_down
        )

        view.startAnimation(animation)

        animation.setAnimationListener(object : Animation.AnimationListener {
            override fun onAnimationStart(animation: Animation) {
                if (!b) view.visibility = View.VISIBLE
            }

            override fun onAnimationEnd(animation: Animation) {
                if (b) view.visibility = View.GONE
            }

            override fun onAnimationRepeat(animation: Animation) {}
        })
        view.visibility = if (b) View.INVISIBLE else View.VISIBLE
    }
}