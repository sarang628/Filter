package com.sryang.screen_filter.ui

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.basicMarquee
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.OutlinedButton
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.sryang.screen_filter.R

@Composable
fun Filter(filterViewModel: FilterViewModel) {
    val uiState : FilterUiState by filterViewModel.uiState.collectAsState()
    Column(Modifier.padding(start = 8.dp, end = 8.dp)) {
        Row(horizontalArrangement = Arrangement.SpaceEvenly, modifier = Modifier.fillMaxWidth()) {
            FilterButton(text = "FoodType", onClick = {
                filterViewModel.setType("FoodType")
            })
            Spacer(modifier = Modifier.width(3.dp))
            FilterButton(text = "Price", onClick = {
                filterViewModel.setType("Price")
            })
            Spacer(modifier = Modifier.width(3.dp))
            FilterButton(text = "Rating", onClick = {
                filterViewModel.setType("Rating")
            })
            Spacer(modifier = Modifier.width(3.dp))
            FilterButton(text = "Distance", onClick = {
                filterViewModel.setType("Distance")
            })
        }
        if (uiState.type == "FoodType") FoodFilter()
        if (uiState.type == "Price") PriceFilter()
        if (uiState.type == "Rating") RatingFilter()
        if (uiState.type == "Distance") DistanceFilter()
    }

}


@OptIn(ExperimentalFoundationApi::class)
@Composable
fun FilterButton(
    text: String,
    modifier: Modifier = Modifier,
    onClick: () -> Unit,
    isSelected: Boolean = false
) {
    OutlinedButton(
        modifier = modifier,
        onClick = onClick,
        border = BorderStroke(1.dp, colorResource(id = R.color.colorPrimary)),
        colors = ButtonDefaults.buttonColors(
            backgroundColor = if (!isSelected) Color.White else Color.Green
        )
    ) {
        Text(
            text = text,
            color = colorResource(id = R.color.colorPrimary),
            maxLines = 1,
            modifier = Modifier.basicMarquee()
        )
    }
}

@Preview
@Composable
fun PreviewFilterButton() {
    FilterButton(text = "ds", onClick = {})
}