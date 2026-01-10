package com.sarang.torang.compose

import androidx.compose.foundation.basicMarquee
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.MultiChoiceSegmentedButtonRow
import androidx.compose.material3.SegmentedButton
import androidx.compose.material3.SegmentedButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Preview
@Composable
fun DistanceFilter(distance: String = "", onDistance: (String) -> Unit = {}) {
    MultiChoiceSegmentedButtonRow(Modifier.fillMaxWidth()) {
        SegmentedButton(checked             = distance == "100m",
                        shape              = SegmentedButtonDefaults.itemShape(index = 0, count = 5),
                        onCheckedChange    = {onDistance.invoke("100m")}) {
            DistanceText(value              = "100m")
        }
        SegmentedButton(checked             = distance == "300m",
                        shape              = SegmentedButtonDefaults.itemShape(index = 1, count = 5),
                        onCheckedChange    = {onDistance.invoke("300m")}) {
            DistanceText(value              = "300m")
        }
        SegmentedButton(checked             = distance == "500m",
                        shape              = SegmentedButtonDefaults.itemShape(index = 2, count = 5),
                        onCheckedChange    = {onDistance.invoke("500m")}) {
            DistanceText(value              = "500m")
        }
        SegmentedButton(checked             = distance == "1km",
                        shape               = SegmentedButtonDefaults.itemShape(index = 3, count = 5),
                        onCheckedChange     = {onDistance.invoke("1km")}) {
            DistanceText(value              = "1km")
        }
        SegmentedButton(checked             = distance == "3km",
                        shape               = SegmentedButtonDefaults.itemShape(index = 4, count = 5),
                        onCheckedChange     = {onDistance.invoke("3km")}) {
            DistanceText(value              = "3km")
        }
    }
}

@Composable
private fun DistanceText(value : String = ""){
    Text(
        text = value,
        maxLines = 1,
        modifier = Modifier.basicMarquee()
    )
}
