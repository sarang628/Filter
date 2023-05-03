package com.sryang.screen_filter.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.repeatOnLifecycle
import com.sryang.screen_filter.databinding.FragmentFoodFilterBinding
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch

@AndroidEntryPoint
class FoodFilterFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val binding =
            FragmentFoodFilterBinding.inflate(layoutInflater, container, false)
        binding.lifecycleOwner = this

        binding.tvFood.setOnClickListener {
            requireActivity().onBackPressed()
        }

        return binding.root
    }
}