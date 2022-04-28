package com.sryang.screen_filter

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import com.sryang.screen_filter.databinding.FragmentRatingFilterBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class RatingFilterFragment : Fragment() {
    private lateinit var fragmentRatingFilterBinding: FragmentRatingFilterBinding
    private val filterViewModel: FilterViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        fragmentRatingFilterBinding =
            FragmentRatingFilterBinding.inflate(layoutInflater, container, false)
        fragmentRatingFilterBinding.lifecycleOwner = this
        fragmentRatingFilterBinding.vm = filterViewModel

        fragmentRatingFilterBinding.tvPrice.setOnClickListener {
            requireActivity().onBackPressed()
        }
        return fragmentRatingFilterBinding.root
    }
}