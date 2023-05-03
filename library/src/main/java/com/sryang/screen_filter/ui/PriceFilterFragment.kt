package com.sryang.screen_filter.ui

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
import com.sryang.screen_filter.databinding.FragmentPriceFilterBinding
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch

@AndroidEntryPoint
class PriceFilterFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val binging = FragmentPriceFilterBinding.inflate(layoutInflater, container, false)
        binging.lifecycleOwner = viewLifecycleOwner

        binging.tvPrice.setOnClickListener {
            requireActivity().onBackPressed()
        }

        return binging.root
    }
}