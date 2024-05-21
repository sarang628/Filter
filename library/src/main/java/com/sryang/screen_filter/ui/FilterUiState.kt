package com.sryang.screen_filter.ui

import android.text.TextUtils
import com.sryang.screen_filter.data.City

data class FilterUiState(
    val type: String,
    val foodType: List<String>,
    val price: List<String>,
    val rating: List<String>,
    val distance: String,
    val showNationFilter: Boolean = false,
    val keyword : String = "",
    val city: City = City(0.0, 0.0, 0f, "city", url = "")
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