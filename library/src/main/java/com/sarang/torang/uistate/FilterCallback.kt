package com.sarang.torang.uistate

import com.sarang.torang.data.City
import com.sarang.torang.data.Nation

data class FilterCallback(
    val onThisArea       : () -> Unit        = {},
    val onFilter         : () -> Unit        = {},
    val onFilterCity     : (City) -> Unit    = {},
    val onFilterNation   : (Nation) -> Unit  = {},
    val onSearch         : () -> Unit        = {},
    val onQueryChange    : (String) -> Unit  = {},
)