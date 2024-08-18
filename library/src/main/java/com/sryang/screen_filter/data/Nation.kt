package com.sryang.screen_filter.data

data class Nation(
    val id: Int,
    val latitude: Double,
    val longitude: Double,
    val zoom: Float = 0f,
    val name: String,
    val url: String,
)
