package com.sryang.screen_filter.data

data class City(
    val nation: Int,
    val latitude: Double,
    val longitude: Double,
    val zoom: Float = 0f,
    val name: String,
    val url: String,
)
