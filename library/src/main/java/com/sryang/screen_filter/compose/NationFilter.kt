package com.sryang.screen_filter.compose

import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import com.sryang.screen_filter.R
import com.sryang.screen_filter.data.Nation

@Composable
fun NationFilter(
    list: List<Nation>,
    image: (@Composable (
        Modifier,
        String,
        Dp?,
        Dp?,
        ContentScale?,
    ) -> Unit)? = null,
    onClick: (Nation) -> Unit,
) {
    LazyRow {
        items(list.size) {
            FilterIconButton(
                onClick = { onClick.invoke(list[it]) },
                url = list[it].url,
                image = image
            )
        }
    }
}