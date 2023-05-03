package com.sryang.screen_filter.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import androidx.fragment.app.Fragment
import com.sryang.screen_filter.R
import com.sryang.screen_filter.databinding.FragmentFilterParentBinding
import dagger.hilt.android.AndroidEntryPoint

/**
 * [FragmentFilterParentBinding]
 * [FilterViewModel]
 */
@AndroidEntryPoint
class FilterParentFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val binding = FragmentFilterParentBinding.inflate(layoutInflater, container, false).apply {
            lifecycleOwner = viewLifecycleOwner
        }

        return binding.root
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