package com.sryang.screen_filter.compose

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.sryang.screen_filter.data.City

@Composable
fun NationFilter(onNation: (City) -> Unit) {
    Column {
        Row(horizontalArrangement = Arrangement.SpaceEvenly, modifier = Modifier.fillMaxWidth()) {
            FilterButton(text = "paris", modifier = Modifier.weight(1f), onClick = {
                onNation.invoke(City.PARIS)
            }, isSelected = false, City.PARIS)
            Spacer(modifier = Modifier.width(3.dp))
            FilterButton(text = "cebu", modifier = Modifier.weight(1f), onClick = {
                onNation.invoke(City.CEBU)
            }, isSelected = false, leftImage = City.CEBU)
            Spacer(modifier = Modifier.width(3.dp))
            FilterButton(text = "tel aviv", modifier = Modifier.weight(1f), onClick = {
                onNation.invoke(City.TEL_AVIV)
            }, isSelected = false, leftImage = City.TEL_AVIV)
        }
    }
}