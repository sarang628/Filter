package com.sarang.torang.compose

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.basicMarquee
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.material3.AssistChip
import androidx.compose.material3.AssistChipDefaults
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.tooling.preview.Preview
import com.google.android.material.chip.Chip

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun FilterButton(text: String,
                 modifier: Modifier = Modifier,
                 onClick: () -> Unit = {},
                 isSelected: Boolean = false,
                 shape: Shape = AssistChipDefaults.shape) {

    // colors = ButtonDefaults.buttonColors(containerColor = if (!isSelected) Color.White else MaterialTheme.colorScheme.primary)
    // color = if (!isSelected) MaterialTheme.colorScheme.primary else Color.White

    AssistChip(modifier = modifier, onClick = onClick, label = { Text(text = text, maxLines = 1, modifier = Modifier.basicMarquee()) },
        leadingIcon = { if (isSelected) Icon(imageVector = Icons.Default.Check, "") })
}

@Preview
@Composable
fun PreviewFilterButton() {
    FilterButton(text = "paris", onClick = {})
}

@Preview
@Composable
fun PreviewFilterButton1() {
    FilterButton(text = "Restaurant", onClick = {})
}