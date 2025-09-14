package com.sarang.torang.compose

import android.util.Log
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.basicMarquee
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.AssistChip
import androidx.compose.material3.AssistChipDefaults
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.sarang.torang.R

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun FilterImageButton(
    text: String? = null,
    modifier: Modifier = Modifier,
    onClick: () -> Unit,
    isSelected: Boolean = false,
    leftImage: String? = null
) {
    AssistChip(
        modifier = modifier,
        onClick = onClick,
        colors = AssistChipDefaults.assistChipColors(containerColor = if (!isSelected) Color.White else MaterialTheme.colorScheme.primary),
        label = {
            leftImage?.let {
                LocalFilterImageLoader.current.invoke(Modifier.clip(CircleShape).size(20.dp), it, 10.dp, 10.dp, null)
                Spacer(modifier = Modifier.width(5.dp))
            }
            text?.let {
                Text(
                    text = it,
                    maxLines = 1,
                    modifier = Modifier.basicMarquee(),
                    color = if (!isSelected) MaterialTheme.colorScheme.primary else Color.White
                )
            }
        }
    )
}

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun FilterIconButton(
    modifier: Modifier = Modifier,
    text: String? = null,
    onClick: () -> Unit,
    isSelected: Boolean = false,
    leftImage: Int? = null,
) {
    IconButton(
        modifier = modifier
            .clip(CircleShape)
            .background(if (!isSelected) Color.White else MaterialTheme.colorScheme.primary),
        onClick = onClick,

        /*colors = ButtonDefaults.buttonColors(
            containerColor = if (!isSelected) Color.White else MaterialTheme.colorScheme.primary
        )*/
    ) {
        leftImage?.let {
            Image(
                painter = painterResource(id = it), contentDescription = "",
                Modifier
                    .clip(
                        CircleShape
                    )
                    .size(25.dp)
            )
            Spacer(modifier = Modifier.width(5.dp))
        }
        text?.let {
            Text(
                text = it,
                maxLines = 1,
                modifier = Modifier.basicMarquee(),
                color = if (!isSelected) MaterialTheme.colorScheme.primary else Color.White
            )
        }
    }
}

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun FilterIconButton(
    modifier: Modifier = Modifier,
    text: String? = null,
    onClick: () -> Unit,
    isSelected: Boolean = false,
    url: String? = null
) {
    IconButton(
        modifier = modifier
            .clip(CircleShape)
            .background(if (!isSelected) Color.White else MaterialTheme.colorScheme.primary),
        onClick = onClick,
    ) {
        url?.let {
            Log.d("__FilterIconButton", "FilterIconButton: $url")
            LocalFilterImageLoader.current.invoke(Modifier.clip(CircleShape).size(40.dp), url, 10.dp, 10.dp, null)
            Spacer(modifier = Modifier.width(5.dp))
        }
        text?.let {
            Text(
                text = it,
                maxLines = 1,
                modifier = Modifier.basicMarquee(),
                color = if (!isSelected) MaterialTheme.colorScheme.primary else Color.White
            )
        }
    }
}

@Preview
@Composable
fun PreviewFilterCityButton() {
    FilterImageButton(text = "paris", onClick = {})
}

@Preview
@Composable
fun PreviewFilterCityButton1() {
    FilterImageButton(text = "Restaurant", onClick = {})
}

@Preview
@Composable
fun PreviewFilterCityButton2() {
    FilterIconButton(onClick = {}, leftImage = R.drawable.ic_us)
}