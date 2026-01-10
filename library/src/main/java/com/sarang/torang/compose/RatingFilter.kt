package com.sarang.torang.compose

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.sharp.Star
import androidx.compose.material3.Icon
import androidx.compose.material3.MultiChoiceSegmentedButtonRow
import androidx.compose.material3.SegmentedButton
import androidx.compose.material3.SegmentedButtonDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

val iconSize = 10

@Preview
@Composable
fun RatingFilter(rating: List<String> = listOf<String>(), onRating: (String) -> Unit = {}) {
    MultiChoiceSegmentedButtonRow(Modifier.fillMaxWidth()) {
        SegmentedButton(checked = rating.contains("*"), shape = SegmentedButtonDefaults.itemShape(index = 0, count = 5), onCheckedChange = {onRating.invoke("*")}) {
            Icon(modifier = Modifier.size(iconSize.dp),
                 imageVector = Icons.Sharp.Star,
                 contentDescription = null)
        }
        SegmentedButton(checked = rating.contains("**"), shape = SegmentedButtonDefaults.itemShape(index = 1, count = 5), onCheckedChange = {onRating.invoke("**")}) {
            Row {
                for(i in 0..1){
                    Icon(modifier = Modifier.size(iconSize.dp),
                        imageVector = Icons.Sharp.Star,
                        contentDescription = null)
                }
            }
        }
        SegmentedButton(checked = rating.contains("***"), shape = SegmentedButtonDefaults.itemShape(index = 2, count = 5), onCheckedChange = {onRating.invoke("***")}) {
            Row {
                for(i in 0..2){
                    Icon(modifier = Modifier.size(iconSize.dp),
                        imageVector = Icons.Sharp.Star,
                        contentDescription = null)
                }
            }
        }
        SegmentedButton(checked = rating.contains("****"), shape = SegmentedButtonDefaults.itemShape(index = 3, count = 5), onCheckedChange = {onRating.invoke("****")}) {
            Row {
                for(i in 0..3){
                    Icon(modifier = Modifier.size(iconSize.dp),
                        imageVector = Icons.Sharp.Star,
                        contentDescription = null)
                }
            }
        }
        SegmentedButton(checked = rating.contains("*****"),
                        shape = SegmentedButtonDefaults.itemShape(index = 4, count = 5),
                        onCheckedChange = {onRating.invoke("*****")}) {
            Row {
                for(i in 0..4){
                    Icon(modifier = Modifier.size(iconSize.dp),
                        imageVector = Icons.Sharp.Star,
                        contentDescription = null)
                }
            }
        }
    }
}