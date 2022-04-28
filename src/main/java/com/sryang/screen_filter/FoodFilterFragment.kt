package com.sryang.screen_filter

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import com.sryang.screen_filter.databinding.FragmentFoodFilterBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class FoodFilterFragment : Fragment() {
    private val mViewModel: FilterViewModel by activityViewModels()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val binding =
            FragmentFoodFilterBinding.inflate(layoutInflater, container, false)
        binding.lifecycleOwner = this
        binding.vm = mViewModel

        binding.tvFood.setOnClickListener {
            requireActivity().onBackPressed()
        }
        return binding.root
    }
}