package com.sryang.screen_filter.data

data class City(
    val latitude: Double,
    val longitude: Double,
    val zoom: Float = 0f,
    val name: String,
    val url: String
) {
    /*PARIS(cityLatLng = CityLatLng(48.85767724143707, 2.3422247835207024), zoom = 13f),
    CEBU(CityLatLng(10.319202463330717, 123.89808359424146), 14f),
    TEL_AVIV(CityLatLng(32.08276135597435, 34.78261101232903), 13f),
    BANGKOK(CityLatLng(13.752878668013308, 100.50264017429713), 13f),
    chiang_mai,
    azores,
    zagreb,
    penang,
    kuala_lumpur,
    split*/
}
