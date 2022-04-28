package com.sryang.screen_filter

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import com.sryang.screen_filter.databinding.FragmentDistanceFilterBinding


class DistanceFilterFragment : Fragment() {
    private lateinit var fragmentDistanceFilterBinding: FragmentDistanceFilterBinding
    private val filterViewModel: FilterViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        fragmentDistanceFilterBinding =
            FragmentDistanceFilterBinding.inflate(layoutInflater, container, false)
        fragmentDistanceFilterBinding.vm = filterViewModel
        fragmentDistanceFilterBinding.tvDistance.setOnClickListener {
            requireActivity().onBackPressed()
        }
        fragmentDistanceFilterBinding.lifecycleOwner = this
        return fragmentDistanceFilterBinding.root
    }
}