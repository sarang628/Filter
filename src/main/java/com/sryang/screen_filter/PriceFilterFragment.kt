package com.sryang.screen_filter

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import com.sryang.screen_filter.databinding.FragmentPriceFilterBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class PriceFilterFragment : Fragment() {
    lateinit var fragmentPriceFilterBinding: FragmentPriceFilterBinding
    val filterViewModel: FilterViewModel by activityViewModels()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        fragmentPriceFilterBinding =
            FragmentPriceFilterBinding.inflate(layoutInflater, container, false)
        fragmentPriceFilterBinding.lifecycleOwner = this
        fragmentPriceFilterBinding.vm = filterViewModel

        fragmentPriceFilterBinding.tvPrice.setOnClickListener {
            requireActivity().onBackPressed()
        }
        return fragmentPriceFilterBinding.root
    }
}