package com.sryang.screen_filter.data

import com.sryang.screen_filter.R

enum class City {
    PARIS,
    CEBU,
    TEL_AVIV
}

data class CityLatLng(val lat: Double, val lng: Double)

fun City.lanLng(): CityLatLng {
    return when (this) {
        City.PARIS -> CityLatLng(48.85767724143707, 2.3422247835207024)
        City.CEBU -> CityLatLng(10.319202463330717, 123.89808359424146)
        City.TEL_AVIV -> CityLatLng(32.08276135597435, 34.78261101232903)
        else -> CityLatLng(0.0, 0.0)
    }
}

fun City.toResource(): Int {
    return when (this) {
        City.PARIS -> R.drawable.ic_paris
        City.CEBU -> R.drawable.ic_cebu
        City.TEL_AVIV -> R.drawable.ic_tel_aviv

        else -> R.drawable.ic_paris
    }
}

fun City.toName(): String {
    return when (this) {
        City.PARIS -> "paris"
        City.CEBU -> "cebu"
        City.TEL_AVIV -> "tel aviv"

        else -> ""
    }
}