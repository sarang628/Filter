package com.sryang.screen_filter.compose

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.basicMarquee
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.sryang.screen_filter.data.City

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun FilterButton(
    text: String,
    modifier: Modifier = Modifier,
    onClick: () -> Unit,
    isSelected: Boolean = false,
    leftImage: City? = null,
    image: (@Composable (
        Modifier,
        String,
        Dp?,
        Dp?,
        ContentScale?,
    ) -> Unit)? = null,
) {
    OutlinedButton(
        modifier = modifier,
        onClick = onClick,
        colors = ButtonDefaults.buttonColors(
            containerColor = if (!isSelected) Color.White else MaterialTheme.colorScheme.primary
        )
    ) {
        leftImage?.let {
            image?.invoke(
                Modifier
                    .clip(CircleShape)
                    .size(20.dp),
                it.url, 10.dp, 10.dp, null
            )
            Spacer(modifier = Modifier.width(5.dp))
        }
        Text(
            text = text,
            maxLines = 1,
            modifier = Modifier.basicMarquee(),
            color = if (!isSelected) MaterialTheme.colorScheme.primary else Color.White
        )
    }
}

@Preview
@Composable
fun PreviewFilterButton() {
    FilterButton(text = "paris", onClick = {}, leftImage = null)
}

@Preview
@Composable
fun PreviewFilterButton1() {
    FilterButton(text = "Restaurant", onClick = {})
}