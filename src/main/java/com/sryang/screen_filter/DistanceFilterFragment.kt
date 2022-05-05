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
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch


class DistanceFilterFragment : Fragment() {
    private val viewModel: FilterViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding =
            FragmentDistanceFilterBinding.inflate(layoutInflater, container, false)
        binding.vm = viewModel
        binding.tvDistance.setOnClickListener {
            requireActivity().onBackPressed()
        }
        binding.lifecycleOwner = viewLifecycleOwner

        lifecycleScope.launch {
            repeatOnLifecycle(Lifecycle.State.RESUMED) {
                viewModel.uiState.collect {
                    //TODO
                }
            }
        }
        return binding.root
    }
}