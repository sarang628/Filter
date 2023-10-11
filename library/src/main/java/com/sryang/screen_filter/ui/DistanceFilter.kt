package com.sryang.screen_filter.ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun DistanceFilter(distance: String, onDistance: (String) -> Unit) {
    Column {
        Row(horizontalArrangement = Arrangement.SpaceEvenly, modifier = Modifier.fillMaxWidth()) {
            FilterButton(text = "100m", modifier = Modifier.weight(1f), onClick = {
                onDistance.invoke("100m")
            }, isSelected = distance == "100m")
            Spacer(modifier = Modifier.width(3.dp))
            FilterButton(text = "200m", modifier = Modifier.weight(1f), onClick = {
                onDistance.invoke("200m")
            }, isSelected = distance == "200m")
            Spacer(modifier = Modifier.width(3.dp))
            FilterButton(text = "300m", modifier = Modifier.weight(1f), onClick = {
                onDistance.invoke("300m")
            }, isSelected = distance == "300m")
            Spacer(modifier = Modifier.width(3.dp))
            FilterButton(text = "1km", modifier = Modifier.weight(1f), onClick = {
                onDistance.invoke("1km")
            }, isSelected = distance == "1km")
            Spacer(modifier = Modifier.width(3.dp))
            FilterButton(text = "2km", modifier = Modifier.weight(1f), onClick = {
                onDistance.invoke("2km")
            }, isSelected = distance == "2km")

        }
    }
}