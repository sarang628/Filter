package com.sarang.torang.compose

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.FlowRow
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.Dp
import com.sarang.torang.data.City

@OptIn(ExperimentalLayoutApi::class)
@Composable
fun CityFilter(list: List<City>, onNation: (City) -> Unit) {
    FlowRow(
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        for (item in list) {
            FilterImageButton(text = item.name, onClick = { onNation.invoke(item) }, isSelected = false)
        }
    }
}

@Composable
fun CityRowFilter(
    list: List<City>, onNation: (City) -> Unit,
    selectedCity: City? = null
) {
    LazyRow(
        content = { items(list.size) { FilterImageButton(text = list[it].name, onClick = { onNation.invoke(list[it]) }, isSelected = selectedCity?.name == list[it].name) } },
        )
}