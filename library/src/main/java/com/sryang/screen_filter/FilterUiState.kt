package com.sryang.screen_filter

import com.sryang.torang_core.data.entity.*

data class FilterUiState(val filter: Filter = FilterUiStateUtil.createEmptyValue())

object FilterUiStateUtil{
    fun createEmptyValue() : Filter{
        return Filter(
            searchType = SearchType.BOUND,
            keyword = "",
            distances = Distances.NONE,
            prices = Prices.NONE,
            restaurantTypes = ArrayList(),
            ratings = ArrayList(),
            lat = 0.0,
            lon = 0.0,
            northEastLatitude = 0.0,
            northEastLongitude = 0.0,
            southWestLatitude = 0.0,
            southWestLongitude = 0.0
        )
    }
}

val FilterUiState.foodType: String get() = filter.restaurantTypes.name