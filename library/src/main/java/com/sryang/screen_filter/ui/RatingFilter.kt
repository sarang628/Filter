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
import com.sryang.screen_filter.compose.FilterButton

@Composable
fun RatingFilter(rating: List<String>, onRating: (String) -> Unit) {
    Column {
        Row(horizontalArrangement = Arrangement.SpaceEvenly, modifier = Modifier.fillMaxWidth()) {
            FilterButton(text = "*", modifier = Modifier.weight(1f), onClick = {
                onRating.invoke("*")
            }, isSelected = rating.contains("*"))
            Spacer(modifier = Modifier.width(3.dp))
            FilterButton(text = "**", modifier = Modifier.weight(1f), onClick = {
                onRating.invoke("**")
            }, isSelected = rating.contains("**"))
            Spacer(modifier = Modifier.width(3.dp))
            FilterButton(text = "***", modifier = Modifier.weight(1f), onClick = {
                onRating.invoke("***")
            }, isSelected = rating.contains("***"))
            Spacer(modifier = Modifier.width(3.dp))
            FilterButton(text = "****", modifier = Modifier.weight(1f), onClick = {
                onRating.invoke("****")
            }, isSelected = rating.contains("****"))
            Spacer(modifier = Modifier.width(3.dp))
            FilterButton(text = "*****", modifier = Modifier.weight(1f), onClick = {
                onRating.invoke("*****")
            }, isSelected = rating.contains("*****"))

        }
    }
}