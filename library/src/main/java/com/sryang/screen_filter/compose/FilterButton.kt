package com.sryang.screen_filter.compose

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
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
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.sryang.screen_filter.data.City
import com.sryang.screen_filter.data.toResource

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun FilterButton(
    text: String,
    modifier: Modifier = Modifier,
    onClick: () -> Unit,
    isSelected: Boolean = false,
    leftImage: City? = null
) {
    OutlinedButton(
        modifier = modifier,
        onClick = onClick,
        colors = ButtonDefaults.buttonColors(
            containerColor = if (!isSelected) Color.White else MaterialTheme.colorScheme.primary
        )
    ) {
        leftImage?.let {
            Image(
                painter = painterResource(id = leftImage.toResource()),
                contentDescription = "",
                Modifier
                    .clip(CircleShape)
                    .size(20.dp)
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
    FilterButton(text = "paris", onClick = {}, leftImage = City.PARIS)
}

@Preview
@Composable
fun PreviewFilterButton1() {
    FilterButton(text = "Restaurant", onClick = {})
}