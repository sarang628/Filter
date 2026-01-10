package com.sarang.torang.compose

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.FlowRow
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.sarang.torang.data.City

@OptIn(ExperimentalLayoutApi::class)
@Composable
fun CityFilter(list: List<City>, onNation: (City) -> Unit) {
    FlowRow(
        horizontalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        for (item in list) {
            FilterImageButton(text = item.name, onClick = { onNation.invoke(item) }, isSelected = false)
        }
    }
}

@Composable
fun CityRowFilter(
    list: List<City> = emptyList(),
    onNation: (City) -> Unit = {},
    selectedCity: City? = null
) {
    LazyRow(
        horizontalArrangement = Arrangement.spacedBy(8.dp),
        content = {
                    items(list) {
                                            FilterImageButton(text = it.name,
                                                              onClick = { onNation.invoke(it) },
                                                              isSelected = selectedCity?.name == it.name)
                                         }
                  }
    )
}

@Preview
@Composable
fun PreviewCityRowFilter(){
    CityRowFilter(
        list = listOf(City(nation = 0,
                           latitude = 0.0,
                           longitude = 0.0,
                           name = "name",
                           url = ""),
                    City(nation = 0,
                        latitude = 0.0,
                        longitude = 0.0,
                        name = "name",
                        url = ""),
                    City(nation = 0,
                        latitude = 0.0,
                        longitude = 0.0,
                        name = "name",
                        url = ""),
                    City(nation = 0,
                        latitude = 0.0,
                        longitude = 0.0,
                        name = "name",
                        url = ""),
                    City(nation = 0,
                        latitude = 0.0,
                        longitude = 0.0,
                        name = "name",
                        url = ""),
                    City(nation = 0,
                        latitude = 0.0,
                        longitude = 0.0,
                        name = "name",
                        url = ""),
                    City(nation = 0,
                        latitude = 0.0,
                        longitude = 0.0,
                        name = "name",
                        url = ""))
    )

}