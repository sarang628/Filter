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
fun PriceFilter(price: List<String> = listOf<String>(), onPrice: (String) -> Unit = {}) {
    MultiChoiceSegmentedButtonRow(Modifier.fillMaxWidth()) {
        SegmentedButton(checked = price.contains("$"), shape = SegmentedButtonDefaults.itemShape(index = 0, count = 5), onCheckedChange = {onPrice.invoke("$")}) {
            Text(text = "$", maxLines = 1, modifier = Modifier.basicMarquee())
        }
        SegmentedButton(checked = price.contains("$$"), shape = SegmentedButtonDefaults.itemShape(index = 1, count = 5), onCheckedChange = {onPrice.invoke("$$")}) {
            Text(text = "$$", maxLines = 1, modifier = Modifier.basicMarquee())
        }
        SegmentedButton(checked = price.contains("$$$"), shape = SegmentedButtonDefaults.itemShape(index = 2, count = 5), onCheckedChange = {onPrice.invoke("$$$")}) {
            Text(text = "$$$", maxLines = 1, modifier = Modifier.basicMarquee())
        }
        SegmentedButton(checked = price.contains("$$$$"), shape = SegmentedButtonDefaults.itemShape(index = 3, count = 5), onCheckedChange = {onPrice.invoke("$$$$")}) {
            Text(text = "$$$$", maxLines = 1, modifier = Modifier.basicMarquee())
        }
        SegmentedButton(checked = price.contains("$$$$$"), shape = SegmentedButtonDefaults.itemShape(index = 4, count = 5), onCheckedChange = {onPrice.invoke("$$$$$")}) {
            Text(text = "$$$$$", maxLines = 1, modifier = Modifier.basicMarquee())
        }
    }
}

