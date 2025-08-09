package com.sarang.torang.compose

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.basicMarquee
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun FilterButton(text: String, modifier: Modifier = Modifier, onClick: () -> Unit = {}, isSelected: Boolean = false, ) {
    OutlinedButton(modifier = modifier, onClick = onClick, colors = ButtonDefaults.buttonColors(containerColor = if (!isSelected) Color.White else MaterialTheme.colorScheme.primary)) {
        Text(text = text, maxLines = 1, modifier = Modifier.basicMarquee(), color = if (!isSelected) MaterialTheme.colorScheme.primary else Color.White)
    }
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