package com.sryang.screen_filter

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.repeatOnLifecycle
import com.sryang.screen_filter.databinding.FragmentDistanceFilterBinding
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch


@AndroidEntryPoint
class DistanceFilterFragment : Fragment() {
    private val viewModel: FilterViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val binding =
            FragmentDistanceFilterBinding.inflate(layoutInflater, container, false)
        binding.apply {
            vm = viewModel
            lifecycleOwner = viewLifecycleOwner
            tvDistance.setOnClickListener {
                requireActivity().onBackPressed()
            }
        }

        lifecycleScope.launch {
            repeatOnLifecycle(Lifecycle.State.RESUMED) {
                viewModel.uiState.collect {
                    binding.distance = it.filter.distances
                }
            }
        }
        return binding.root
    }
}