package com.sryang.screen_filter.ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview
@Composable
fun FoodFilter() {
    val foodType = remember { mutableStateListOf<String>() }
    Column {
        Row(horizontalArrangement = Arrangement.SpaceEvenly, modifier = Modifier.fillMaxWidth()) {
            FilterButton(text = "Korean", modifier = Modifier.weight(1f), onClick = {
                if (foodType.contains("Korean")) {
                    foodType.remove("Korean")
                } else {
                    foodType.add("Korean")
                }
            }, isSelected = foodType.contains("Korean"))
            Spacer(modifier = Modifier.width(3.dp))
            FilterButton(text = "Japanese", modifier = Modifier.weight(1f), onClick = {
                if (foodType.contains("Japanese")) {
                    foodType.remove("Japanese")
                } else {
                    foodType.add("Japanese")
                }
            }, isSelected = foodType.contains("Japanese"))
            Spacer(modifier = Modifier.width(3.dp))
            FilterButton(text = "Chinese", modifier = Modifier.weight(1f), onClick = {
                if (foodType.contains("Chinese")) {
                    foodType.remove("Chinese")
                } else {
                    foodType.add("Chinese")
                }
            }, isSelected = foodType.contains("Chinese"))
            Spacer(modifier = Modifier.width(3.dp))
            FilterButton(text = "American", modifier = Modifier.weight(1f), onClick = {
                if (foodType.contains("American")) {
                    foodType.remove("American")
                } else {
                    foodType.add("American")
                }
            }, isSelected = foodType.contains("American"))
            Spacer(modifier = Modifier.width(3.dp))

        }
        Row(horizontalArrangement = Arrangement.SpaceEvenly, modifier = Modifier.fillMaxWidth()) {
            FilterButton(text = "Vietnam", modifier = Modifier.weight(1f), onClick = {
                if (foodType.contains("Vietnam")) {
                    foodType.remove("Vietnam")
                } else {
                    foodType.add("Vietnam")
                }
            }, isSelected = foodType.contains("Vietnam"))
            Spacer(modifier = Modifier.width(3.dp))
            FilterButton(text = "Italian", modifier = Modifier.weight(1f), onClick = {
                if (foodType.contains("Italian")) {
                    foodType.remove("Italian")
                } else {
                    foodType.add("Italian")
                }
            }, isSelected = foodType.contains("Italian"))
            FilterButton(text = "Spanish", modifier = Modifier.weight(1f), onClick = {
                if (foodType.contains("Spanish")) {
                    foodType.remove("Spanish")
                } else {
                    foodType.add("Spanish")
                }
            }, isSelected = foodType.contains("Spanish"))
            Spacer(modifier = Modifier.width(3.dp))
        }
    }

}