package com.sryang.screen_filter

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.fragment.app.viewModels
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.repeatOnLifecycle
import androidx.navigation.fragment.findNavController
import com.example.torang_core.data.model.name
import com.example.torang_core.util.EventObserver
import com.sryang.screen_filter.databinding.FragmentFilterBinding
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch

/**
 * [FilterViewModel]
 */
@AndroidEntryPoint
class FilterFragment : Fragment() {
    private val viewModel: FilterViewModel by viewModels()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val binding = FragmentFilterBinding.inflate(layoutInflater, container, false)
        binding.lifecycleOwner = this
        binding.vm = viewModel

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

        lifecycleScope.launch {
            repeatOnLifecycle(Lifecycle.State.RESUMED) {
                viewModel.uiState.collect {
                    binding.tvFood.text = it.filter.restaurantTypes.name
                    binding.tvPrice.text = it.filter.prices.toName
                    binding.tvRating.text = it.filter.ratings.name
                    binding.tvDistance.text = it.filter.distances.toName
                }
            }
        }

        return binding.root
    }
}