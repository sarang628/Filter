package com.sryang.screen_filter

import com.example.torang_core.data.model.Filter
import com.example.torang_core.data.model.name

data class FilterUiState(val filter: Filter = Filter())

val FilterUiState.foodType: String get() = filter.restaurantTypes.name