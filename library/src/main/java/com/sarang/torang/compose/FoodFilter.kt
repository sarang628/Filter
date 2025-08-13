package com.sarang.torang.compose

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
fun FoodFilter(foodType: List<String>, onFoodType: (String) -> Unit) {
    Column {
        Row(horizontalArrangement = Arrangement.SpaceEvenly, modifier = Modifier.fillMaxWidth()) {
            FilterButton(text = "Korean", modifier = Modifier.weight(1f), onClick = {
                onFoodType.invoke("Korean")
            }, isSelected = foodType.contains("Korean"))
            Spacer(modifier = Modifier.width(3.dp))
            FilterButton(text = "Japanese", modifier = Modifier.weight(1f), onClick = {
                onFoodType.invoke("Japanese")
            }, isSelected = foodType.contains("Japanese"))
            Spacer(modifier = Modifier.width(3.dp))
            FilterButton(text = "Chinese", modifier = Modifier.weight(1f), onClick = {
                onFoodType.invoke("Chinese")
            }, isSelected = foodType.contains("Chinese"))
            Spacer(modifier = Modifier.width(3.dp))
            FilterButton(text = "American", modifier = Modifier.weight(1f), onClick = {
                onFoodType.invoke("American")
            }, isSelected = foodType.contains("American"))
            Spacer(modifier = Modifier.width(3.dp))

        }
        Row(horizontalArrangement = Arrangement.SpaceEvenly, modifier = Modifier.fillMaxWidth()) {
            FilterButton(text = "Vietnam", modifier = Modifier.weight(1f), onClick = {
                onFoodType.invoke("Vietnam")
            }, isSelected = foodType.contains("Vietnam"))
            Spacer(modifier = Modifier.width(3.dp))
            FilterButton(text = "Italian", modifier = Modifier.weight(1f), onClick = {
                onFoodType.invoke("Italian")
            }, isSelected = foodType.contains("Italian"))
            FilterButton(text = "Spanish", modifier = Modifier.weight(1f), onClick = {
                onFoodType.invoke("Spanish")
            }, isSelected = foodType.contains("Spanish"))
            Spacer(modifier = Modifier.width(3.dp))
        }
    }

}