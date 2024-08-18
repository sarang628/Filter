package com.sryang.screen_filter.ui

import android.text.TextUtils
import com.sryang.screen_filter.data.City
import com.sryang.screen_filter.data.Nation

data class FilterUiState(
    val type: String = "",
    val foodType: List<String> = arrayListOf(),
    val price: List<String> = arrayListOf(),
    val rating: List<String> = arrayListOf(),
    val distance: String = "",
    val showCityFilter: Boolean = false,
    val keyword: String = "",
    val city: City = City(0.0, 0.0, 0f, "city", url = ""),
    val nation: Nation = Nation(0, 0.0, 0.0, 0f, "city", url = ""),
    val cities: List<City> = arrayListOf(),
    val filteredCities: List<City> = arrayListOf(),
    val nations: List<Nation> = arrayListOf(),
)

val FilterUiState.distanceLabel: String
    get() {
        return if (distance.isEmpty()) "Distance" else distance
    }

val FilterUiState.ratingLabel: String
    get() {
        return if (rating.isEmpty()) "Rating" else TextUtils.join(",", rating)
    }

val FilterUiState.priceLabel: String
    get() {
        return if (price.isEmpty()) "Price" else TextUtils.join(",", price)
    }

val FilterUiState.footTypeLabel: String
    get() {
        return if (foodType.isEmpty()) "FoodType" else TextUtils.join(",", foodType)
    }