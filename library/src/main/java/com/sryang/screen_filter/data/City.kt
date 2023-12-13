package com.sryang.screen_filter.data

import com.sryang.screen_filter.R

enum class City {
    PARIS,
    CEBU,
    TEL_AVIV,
    BANGKOK,
    CHIANG_MAI,
    AZORES,
    ZAGREB,
    PENANG,
    KUALA_LUMPUR,
    SPLIT
}

data class CityLatLng(val lat: Double, val lng: Double)

fun City.lanLng(): CityLatLng {
    return when (this) {
        City.PARIS -> CityLatLng(48.85767724143707, 2.3422247835207024)
        City.CEBU -> CityLatLng(10.319202463330717, 123.89808359424146)
        City.TEL_AVIV -> CityLatLng(32.08276135597435, 34.78261101232903)
        City.BANGKOK -> CityLatLng(13.752878668013308, 100.50264017429713)
        else -> CityLatLng(0.0, 0.0)

    }
}

fun City.zoom(): Float {
    return when (this) {
        City.PARIS -> 13f
        City.CEBU -> 14f
        City.TEL_AVIV -> 13f
        City.BANGKOK -> 15f
        else -> 10f
    }
}

fun City.toResource(): Int {
    return when (this) {
        City.PARIS -> R.drawable.ic_paris
        City.CEBU -> R.drawable.ic_cebu
        City.TEL_AVIV -> R.drawable.ic_tel_aviv
        City.BANGKOK -> R.drawable.ic_bangkok

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