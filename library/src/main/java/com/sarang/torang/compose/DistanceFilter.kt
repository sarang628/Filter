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
fun DistanceFilter(distance: String = "", onDistance: (String) -> Unit = {}) {
    Column {
        Row(horizontalArrangement = Arrangement.SpaceEvenly, modifier = Modifier.fillMaxWidth()) {
            FilterButton(text = "100m", modifier = Modifier.weight(1f), onClick = { onDistance.invoke("100m") }, isSelected = distance == "100m")
            Spacer(modifier = Modifier.width(3.dp))
            FilterButton(text = "300m", modifier = Modifier.weight(1f), onClick = { onDistance.invoke("300m") }, isSelected = distance == "300m")
            Spacer(modifier = Modifier.width(3.dp))
            FilterButton(text = "500m", modifier = Modifier.weight(1f), onClick = { onDistance.invoke("500m") }, isSelected = distance == "500m")
            Spacer(modifier = Modifier.width(3.dp))
            FilterButton(text = "1km", modifier = Modifier.weight(1f), onClick = { onDistance.invoke("1km") }, isSelected = distance == "1km")
            Spacer(modifier = Modifier.width(3.dp))
            FilterButton(text = "3km", modifier = Modifier.weight(1f), onClick = { onDistance.invoke("3km") }, isSelected = distance == "3km")
        }
    }
}

@Preview
@Composable
fun DistanceFilter1(distance: String = "", onDistance: (String) -> Unit = {}) {
    MultiChoiceSegmentedButtonRow(Modifier.fillMaxWidth()) {
        SegmentedButton(checked = distance == "100m", shape = SegmentedButtonDefaults.itemShape(index = 0, count = 5), onCheckedChange = {onDistance.invoke("100m")}) {
            Text(text = "100m", maxLines = 1, modifier = Modifier.basicMarquee())
        }
        SegmentedButton(checked = distance == "300m", shape = SegmentedButtonDefaults.itemShape(index = 1, count = 5), onCheckedChange = {onDistance.invoke("300m")}) {
            Text(text = "300m", maxLines = 1, modifier = Modifier.basicMarquee())
        }
        SegmentedButton(checked = distance == "500m", shape = SegmentedButtonDefaults.itemShape(index = 2, count = 5), onCheckedChange = {onDistance.invoke("500m")}) {
            Text(text = "500m", maxLines = 1, modifier = Modifier.basicMarquee())
        }
        SegmentedButton(checked = distance == "1km", shape = SegmentedButtonDefaults.itemShape(index = 3, count = 5), onCheckedChange = {onDistance.invoke("1km")}) {
            Text(text = "1km", maxLines = 1, modifier = Modifier.basicMarquee())
        }
        SegmentedButton(checked = distance == "3km", shape = SegmentedButtonDefaults.itemShape(index = 4, count = 5), onCheckedChange = {onDistance.invoke("3km")}) {
            Text(text = "3km", maxLines = 1, modifier = Modifier.basicMarquee())
        }
    }
}
