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

@Preview
@Composable
fun RatingFilter(rating: List<String> = listOf<String>(), onRating: (String) -> Unit = {}) {
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

@Preview
@Composable
fun RatingFilter1(rating: List<String> = listOf<String>(), onRating: (String) -> Unit = {}) {
    MultiChoiceSegmentedButtonRow(Modifier.fillMaxWidth()) {
        SegmentedButton(checked = rating.contains("*"), shape = SegmentedButtonDefaults.itemShape(index = 0, count = 5), onCheckedChange = {onRating.invoke("*")}) {
            Text(text = "*", maxLines = 1, modifier = Modifier.basicMarquee())
        }
        SegmentedButton(checked = rating.contains("**"), shape = SegmentedButtonDefaults.itemShape(index = 1, count = 5), onCheckedChange = {onRating.invoke("**")}) {
            Text(text = "**", maxLines = 1, modifier = Modifier.basicMarquee())
        }
        SegmentedButton(checked = rating.contains("***"), shape = SegmentedButtonDefaults.itemShape(index = 2, count = 5), onCheckedChange = {onRating.invoke("***")}) {
            Text(text = "***", maxLines = 1, modifier = Modifier.basicMarquee())
        }
        SegmentedButton(checked = rating.contains("****"), shape = SegmentedButtonDefaults.itemShape(index = 3, count = 5), onCheckedChange = {onRating.invoke("****")}) {
            Text(text = "****", maxLines = 1, modifier = Modifier.basicMarquee())
        }
        SegmentedButton(checked = rating.contains("*****"), shape = SegmentedButtonDefaults.itemShape(index = 4, count = 5), onCheckedChange = {onRating.invoke("*****")}) {
            Text(text = "*****", maxLines = 1, modifier = Modifier.basicMarquee())
        }
    }
}