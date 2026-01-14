package com.sarang.torang.compose

import androidx.compose.foundation.BorderStroke
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
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.google.android.material.chip.Chip

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun FilterButton(modifier   : Modifier      = Modifier,
                 text       : String        = "",
                 onClick    : () -> Unit    = {},
                 isSelected : Boolean       = false,
                 shape      : Shape         = AssistChipDefaults.shape) {
    AssistChip(modifier     = modifier,
               onClick      = onClick,
               border = BorderStroke(width = 1.dp,
                                     color = Color.Black),
               label        = { Text(text       = text,
                                     maxLines   = 1,
                                     color      = Color.Black,
                                     modifier   = Modifier.basicMarquee()) },
               leadingIcon  = { if (isSelected) Icon(imageVector        = Icons.Default.Check,
                                                     contentDescription = null) })
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