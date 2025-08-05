package com.sarang.torang.uistate

import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

data class FilterUiState(
    val foodType: String? = null,
    val price: String? = null,
    val rating: String? = null,
    val distance: String? = null,
)

fun testFilterUiState() : StateFlow<FilterUiState>{
    return MutableStateFlow(FilterUiState(
        foodType = "음식종류",
        price = "$$",
        rating = "3.0",
        distance = "100m"
    ))
}