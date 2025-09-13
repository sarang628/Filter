package com.sarang.torang.compose

import androidx.compose.foundation.basicMarquee
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MultiChoiceSegmentedButtonRow
import androidx.compose.material3.SegmentedButton
import androidx.compose.material3.SegmentedButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview(showBackground = true)
@Composable
fun FoodFilter(foodType: List<String> = listOf<String>(), onFoodType: (String) -> Unit = {}) {
    Column {
        Row(horizontalArrangement = Arrangement.SpaceEvenly, modifier = Modifier.fillMaxWidth()) {
            FilterButton(text = "Korean", modifier = Modifier.weight(1f), onClick = { onFoodType.invoke("Korean") }, isSelected = foodType.contains("Korean"))
            Spacer(modifier = Modifier.width(3.dp))
            FilterButton(text = "Japanese", modifier = Modifier.weight(1f), onClick = { onFoodType.invoke("Japanese") }, isSelected = foodType.contains("Japanese"))
            Spacer(modifier = Modifier.width(3.dp))
            FilterButton(text = "Chinese", modifier = Modifier.weight(1f), onClick = { onFoodType.invoke("Chinese") }, isSelected = foodType.contains("Chinese"))
            Spacer(modifier = Modifier.width(3.dp))
            FilterButton(text = "American", modifier = Modifier.weight(1f), onClick = { onFoodType.invoke("American") }, isSelected = foodType.contains("American"))
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
            FilterButton(text = "Cafe", modifier = Modifier.weight(1f), onClick = {
                onFoodType.invoke("Cafe")
            }, isSelected = foodType.contains("Cafe"))
            Spacer(modifier = Modifier.width(3.dp))
        }
    }
}

@Preview(showBackground = true)
@Composable
fun FoodFilter1(foodType: List<String> = listOf<String>(), onFoodType: (String) -> Unit = {}) {
    Column {
        MultiChoiceSegmentedButtonRow(Modifier.fillMaxWidth()) {
            SegmentedButton(checked = foodType.contains("Korean"), shape = SegmentedButtonDefaults.itemShape(index = 0, count = 4), onCheckedChange = {onFoodType.invoke("Korean")}) {
                Text(text = "Korean", maxLines = 1, modifier = Modifier.basicMarquee())
            }
            SegmentedButton(checked = foodType.contains("Japanese"), shape = SegmentedButtonDefaults.itemShape(index = 1, count = 4), onCheckedChange = {onFoodType.invoke("Japanese")}) {
                Text(text = "Japanese", maxLines = 1, modifier = Modifier.basicMarquee())
            }
            SegmentedButton(checked = foodType.contains("Chinese"), shape = SegmentedButtonDefaults.itemShape(index = 2, count = 4), onCheckedChange = {onFoodType.invoke("Chinese")}) {
                Text(text = "Chinese", maxLines = 1, modifier = Modifier.basicMarquee())
            }
            SegmentedButton(checked = foodType.contains("American"), shape = SegmentedButtonDefaults.itemShape(index = 3, count = 4), onCheckedChange = {onFoodType.invoke("American")}) {
                Text(text = "American", maxLines = 1, modifier = Modifier.basicMarquee())
            }
        }
        MultiChoiceSegmentedButtonRow(Modifier.fillMaxWidth()) {
            SegmentedButton(checked = foodType.contains("Vietnam"), shape = SegmentedButtonDefaults.itemShape(index = 0, count = 4), onCheckedChange = {onFoodType.invoke("Vietnam")}) {
                Text(text = "Vietnam", maxLines = 1, modifier = Modifier.basicMarquee())
            }
            SegmentedButton(checked = foodType.contains("Italian"), shape = SegmentedButtonDefaults.itemShape(index = 1, count = 4), onCheckedChange = {onFoodType.invoke("Italian")}) {
                Text(text = "Italian", maxLines = 1, modifier = Modifier.basicMarquee())
            }
            SegmentedButton(checked = foodType.contains("Spanish"), shape = SegmentedButtonDefaults.itemShape(index = 2, count = 4), onCheckedChange = {onFoodType.invoke("Spanish")}) {
                Text(text = "Spanish", maxLines = 1, modifier = Modifier.basicMarquee())
            }
            SegmentedButton(checked = foodType.contains("Cafe"), shape = SegmentedButtonDefaults.itemShape(index = 3, count = 4), onCheckedChange = {onFoodType.invoke("Cafe")}) {
                Text(text = "Cafe", maxLines = 1, modifier = Modifier.basicMarquee())
            }
        }
    }
}