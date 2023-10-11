package com.sryang.screen_filter.ui

data class FilterUiState(
    val type: String,
    val foodType: List<String>,
    val price: List<String>,
    val rating: List<String>,
    val distance: String
)