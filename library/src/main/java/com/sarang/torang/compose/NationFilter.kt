package com.sarang.torang.compose

import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.Dp
import com.sarang.torang.data.Nation

@Composable
fun NationFilter(
    list: List<Nation>,
    selectedNation: Nation? = null,
    onClick: (Nation) -> Unit,
) {
    LazyRow {
        items(list.size) {
            FilterIconButton(
                onClick = { onClick.invoke(list[it]) },
                url = list[it].url,
                isSelected = selectedNation?.name == list[it].name
            )
        }
    }
}