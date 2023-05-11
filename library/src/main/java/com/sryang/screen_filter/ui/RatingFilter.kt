package com.sryang.screen_filter.ui

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview
@Composable
fun RatingFilter() {
    Row {
        Button(onClick = {}, Modifier.weight(1f).height(40.dp)) { Text(text = "평점") }
        Spacer(modifier = Modifier.width(3.dp))
        Button(onClick = {}, Modifier.weight(1f).height(40.dp)) { Text(text = "1점대") }
        Spacer(modifier = Modifier.width(3.dp))
        Button(onClick = {}, Modifier.weight(1f).height(40.dp)) { Text(text = "2점대") }
        Spacer(modifier = Modifier.width(3.dp))
        Button(onClick = {}, Modifier.weight(1f).height(40.dp)) { Text(text = "3점대") }
        Spacer(modifier = Modifier.width(3.dp))
        Button(onClick = {}, Modifier.weight(1f).height(40.dp)) { Text(text = "4점대") }
        Spacer(modifier = Modifier.width(3.dp))
        Button(onClick = {}, Modifier.weight(1f).height(40.dp)) { Text(text = "5점대") }
    }
}