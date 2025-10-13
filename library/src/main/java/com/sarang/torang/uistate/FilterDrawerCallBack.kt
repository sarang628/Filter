package com.sarang.torang.uistate

import com.sarang.torang.data.City
import com.sarang.torang.data.Nation

data class FilterDrawerCallBack(
    val onFilterFoodType   : (String) -> Unit  = {},
    val onFilterPrice      : (String) -> Unit  = {},
    val onFilterRating     : (String) -> Unit  = {},
    val onFilterDistance   : (String) -> Unit  = {},
    val onFilterCity       : (City) -> Unit    = {},
    val onFilterNation     : (Nation) -> Unit  = {},
    val onSearch           : () -> Unit        = {},
    val onQueryChange      : (String) -> Unit  = {},
)