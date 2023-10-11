package com.sryang.screen_filter.ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

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
