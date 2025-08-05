package com.sarang.torang.ui

import android.text.TextUtils
import com.sarang.torang.data.City
import com.sarang.torang.data.Nation

data class FilterUiState(
    val type: String = "",
    val foodType: List<String> = arrayListOf(),
    val price: List<String> = arrayListOf(),
    val rating: List<String> = arrayListOf(),
    val distance: String = "",
    val showCityFilter: Boolean = false,
    val keyword: String = "",
    val selectedCity: City? = null,
    val selectedNation: Nation? = null,
    val cities: List<City> = arrayListOf(),
    val filteredCities: List<City> = arrayListOf(),
    val nations: List<Nation> = arrayListOf(),
)

val FilterUiState.selectedNationOrCityName: String
    get() {
        return selectedCity?.name ?: selectedNation?.name ?: "place"
    }

val FilterUiState.distanceLabel: String
    get() {
        return distance.ifEmpty { "Distance" }
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