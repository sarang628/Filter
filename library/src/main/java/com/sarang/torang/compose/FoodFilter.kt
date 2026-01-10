package com.sarang.torang.compose

import androidx.compose.foundation.basicMarquee
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.MultiChoiceSegmentedButtonRow
import androidx.compose.material3.SegmentedButton
import androidx.compose.material3.SegmentedButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Preview(showBackground = true)
@Composable
fun FoodFilter(foodType: List<String> = listOf<String>(), onFoodType: (String) -> Unit = {}) {
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