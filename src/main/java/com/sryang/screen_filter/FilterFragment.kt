package com.sryang.screen_filter

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import com.sryang.screen_filter.databinding.FragmentFilterBinding
import dagger.hilt.android.AndroidEntryPoint

/**
 * [FilterViewModel]
 */
@AndroidEntryPoint
class FilterFragment : Fragment() {
    private val mViewModel: FilterViewModel by activityViewModels()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val binding = FragmentFilterBinding.inflate(layoutInflater, container, false)
        binding.lifecycleOwner = this
        binding.vm = mViewModel
        return binding.root
    }
}