package com.sryang.screen_filter.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.findNavController
import com.sryang.screen_filter.R
import com.sryang.screen_filter.databinding.FragmentFilterBinding
import com.sryang.screen_filter.uistate.FilterUiState
import com.sryang.screen_filter.uistate.testFilterUiState
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch

/**
 * [FilterViewModel]
 */
@AndroidEntryPoint
class FilterFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val binding = FragmentFilterBinding.inflate(layoutInflater, container, false)
        binding.lifecycleOwner = this

        // 음식 필터 선택
        binding.tvFood.setOnClickListener {
            findNavController().navigate(R.id.action_filterFragment_to_foodFilterFragment)
        }

        // 반경 필터 선택
        binding.tvDistance.setOnClickListener {
            findNavController()
                .navigate(R.id.action_filterFragment_to_distanceFilterFragment)
        }

        // 평점 필터 선택
        binding.tvRating.setOnClickListener {
            findNavController()
                .navigate(R.id.action_filterFragment_to_ratingFilterFragment)
        }

        // 가격 필터 선택
        binding.tvPrice.setOnClickListener {
            findNavController()
                .navigate(R.id.action_filterFragment_to_priceFilterFragment)
        }

        subScribeUiState(testFilterUiState(), binding)

        return binding.root
    }

    private fun subScribeUiState(uiState : StateFlow<FilterUiState>, binding : FragmentFilterBinding) {
        lifecycleScope.launch {
            uiState.collect{
                binding.tvFood.text = it.foodType
                binding.tvRating.text = it.rating
                binding.tvPrice.text = it.price
                binding.tvDistance.text = it.distance
            }
        }
    }
}