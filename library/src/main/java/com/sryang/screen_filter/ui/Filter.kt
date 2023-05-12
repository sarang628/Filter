package com.sryang.screen_filter.ui

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material.Button
import androidx.compose.material.OutlinedButton
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.sryang.screen_filter.R

@Preview
@Composable
fun Filter() {
    Row(horizontalArrangement = Arrangement.SpaceEvenly, modifier = Modifier.fillMaxWidth()) {
        FilterButton(text = "음식종류")
        Spacer(modifier = Modifier.width(3.dp))
        FilterButton(text = "가격")
        Spacer(modifier = Modifier.width(3.dp))
        FilterButton(text = "평점")
        Spacer(modifier = Modifier.width(3.dp))
        FilterButton(text = "거리")
    }
}

@Composable
fun FilterButton(text: String) {
    OutlinedButton(
        onClick = {},
        border = BorderStroke(1.dp, colorResource(id = R.color.colorPrimary)),
    ) {
        Text(text = text, color = colorResource(id = R.color.colorPrimary))
    }
}

@Preview
@Composable
fun PreviewFilterButton() {
    FilterButton(text = "ds")
}