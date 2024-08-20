package com.sryang.screen_filter.compose

import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.FlowRow
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.Dp
import com.sryang.screen_filter.data.City

@OptIn(ExperimentalLayoutApi::class)
@Composable
fun CityFilter(
    list: List<City>, onNation: (City) -> Unit,
    image: (@Composable (
        Modifier,
        String,
        Dp?,
        Dp?,
        ContentScale?,
    ) -> Unit)? = null,
) {
    FlowRow {
        for (item in list) {
            FilterImageButton(text = item.name, onClick = {
                onNation.invoke(item)
            }, isSelected = false, image = image)
        }
    }
}

@Composable
fun CityRowFilter(
    list: List<City>, onNation: (City) -> Unit,
    selectedCity: City? = null,
    image: (@Composable (
        Modifier,
        String,
        Dp?,
        Dp?,
        ContentScale?,
    ) -> Unit)? = null,
) {
    LazyRow(content = {
        items(list.size) {
            FilterImageButton(text = list[it].name, onClick = {
                onNation.invoke(list[it])
            }, isSelected = selectedCity?.name == list[it].name, image = image)
        }
    })
}