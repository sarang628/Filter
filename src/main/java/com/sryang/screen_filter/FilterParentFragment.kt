package com.sryang.screen_filter

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.NavHostFragment
import com.example.torang_core.util.EventObserver
import com.example.torang_core.util.Logger
import com.example.travelmode.SelectNationFragment
import com.sryang.screen_filter.databinding.FragmentFilterParentBinding
import dagger.hilt.android.AndroidEntryPoint

/**
 * [FragmentFilterParentBinding]
 */
@AndroidEntryPoint
class FilterParentFragment : Fragment() {
    private val filterViewModel: FilterViewModel by activityViewModels()
    private val nationFragment = SelectNationFragment();

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val binding = FragmentFilterParentBinding.inflate(layoutInflater, container, false)
        binding.filterViewModel = filterViewModel
        //binding.selectNationViewModel = selectNationViewModel
        binding.lifecycleOwner = viewLifecycleOwner

        binding.constraintLayout2.setOnClickListener {
            //nationFragment.show(childFragmentManager, "dialog")
        }
        subScribeUI(binding)

        return binding.root
    }

    private fun subScribeUI(binding: FragmentFilterParentBinding) {
        /*selectNationViewModel.selected.observe(viewLifecycleOwner) {
            if (nationFragment.isVisible)
                nationFragment.dismiss()
        }*/
        
        filterViewModel.clickDistance.observe(viewLifecycleOwner, EventObserver {
            filterNavigation(binding.filterContainer1.id).navController
                .navigate(R.id.action_filterFragment_to_distanceFilterFragment)
        })

        filterViewModel.clickRating.observe(viewLifecycleOwner, EventObserver {
            filterNavigation(binding.filterContainer1.id).navController
                .navigate(R.id.action_filterFragment_to_ratingFilterFragment)
        })

        filterViewModel.clickPrice.observe(viewLifecycleOwner, EventObserver {
            filterNavigation(binding.filterContainer1.id).navController
                .navigate(R.id.action_filterFragment_to_priceFilterFragment)
        })

        filterViewModel.clickFood.observe(viewLifecycleOwner, EventObserver {
            filterNavigation(binding.filterContainer1.id).navController
                .navigate(R.id.action_filterFragment_to_foodFilterFragment)
        })

        filterViewModel.clickSearch.observe(viewLifecycleOwner, EventObserver {
            /*mapSharedViewModel.searchFilterRestaurant(
                filterViewModel.selectedDistances.value,
                filterViewModel.selectedFoods.value,
                filterViewModel.selectedPrice.value,
                filterViewModel.selectedRatings.value,
                latitude = filterViewModel.latitudeMyLocation,
                longitude = filterViewModel.longitudeMyLocation,
                searchType = Filter.SearchType.AROUND
            )*/
        })

        filterViewModel.clickThisArea.observe(viewLifecycleOwner, EventObserver {
            /*mapSharedViewModel.searchFilterRestaurant(
                filterViewModel.selectedDistances.value,
                filterViewModel.selectedFoods.value,
                filterViewModel.selectedPrice.value,
                filterViewModel.selectedRatings.value,
                northEastLatitude = filterViewModel.northEastLatitude,
                northEastLongitude = filterViewModel.northEastLongitude,
                southWestLatitude = filterViewModel.southWestLatitude,
                southWestLongitude = filterViewModel.southWestLongitude,
                searchType = Filter.SearchType.BOUND
            )*/
        })
    }

    private fun showFilter(b: Boolean, view: View) {
        Logger.d("showFilter:$b")
        val animation = AnimationUtils.loadAnimation(
            requireContext(), if (b) R.anim.slide_up else R.anim.slide_down
        )

        view.startAnimation(animation)

        animation.setAnimationListener(object : Animation.AnimationListener {
            override fun onAnimationStart(animation: Animation) {
                if (!b) view.visibility = View.VISIBLE
            }

            override fun onAnimationEnd(animation: Animation) {
                if (b) view.visibility = View.GONE
            }

            override fun onAnimationRepeat(animation: Animation) {}
        })
        view.visibility = if (b) View.INVISIBLE else View.VISIBLE
    }

    private fun filterNavigation(id: Int): NavHostFragment {
        return (childFragmentManager.findFragmentById(id) as NavHostFragment)
    }
}