package com.sryang.screen_filter.compose

import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.Dp
import com.sryang.screen_filter.data.City

@Composable
fun NationFilter(
    list: List<City>, onNation: (City) -> Unit,
    image: (@Composable (
        Modifier,
        String,
        Dp?,
        Dp?,
        ContentScale?,
    ) -> Unit)? = null,
) {
    LazyVerticalGrid(columns = GridCells.Fixed(3), content = {
        items(list.size) {
            FilterButton(text = list[it].name, onClick = {
                onNation.invoke(list[it])
            }, isSelected = false, leftImage = list[it], image = image)
        }
    })
}