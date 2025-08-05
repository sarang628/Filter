package com.sarang.torang.ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.sarang.torang.compose.FilterButton

@Composable
fun PriceFilter(price: List<String>, onPrice: (String) -> Unit) {
    Column {
        Row(horizontalArrangement = Arrangement.SpaceEvenly, modifier = Modifier.fillMaxWidth()) {
            FilterButton(text = "$", modifier = Modifier.weight(1f), onClick = {
                onPrice.invoke("$")
            }, isSelected = price.contains("$"))
            Spacer(modifier = Modifier.width(3.dp))
            FilterButton(text = "$$", modifier = Modifier.weight(1f), onClick = {
                onPrice.invoke("$$")
            }, isSelected = price.contains("$$"))
            Spacer(modifier = Modifier.width(3.dp))
            FilterButton(text = "$$$", modifier = Modifier.weight(1f), onClick = {
                onPrice.invoke("$$$")
            }, isSelected = price.contains("$$$"))
            Spacer(modifier = Modifier.width(3.dp))
            FilterButton(text = "$$$$", modifier = Modifier.weight(1f), onClick = {
                onPrice.invoke("$$$$")
            }, isSelected = price.contains("$$$$"))
            Spacer(modifier = Modifier.width(3.dp))
            FilterButton(text = "$$$$$", modifier = Modifier.weight(1f), onClick = {
                onPrice.invoke("$$$$$")
            }, isSelected = price.contains("$$$$$"))

        }
    }
}
