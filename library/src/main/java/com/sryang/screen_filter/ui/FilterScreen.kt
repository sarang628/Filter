package com.sryang.screen_filter.ui

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.slideInVertically
import androidx.compose.animation.slideOutVertically
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.SearchBar
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import com.sryang.screen_filter.compose.FilterButton
import com.sryang.screen_filter.compose.NationFilter
import com.sryang.screen_filter.data.City

@Composable
fun FilterScreen(
    filterViewModel: FilterViewModel = hiltViewModel(),       // filter 뷰모델
    onFilter: (FilterUiState) -> Unit,      // 필터 검색 클릭 이벤트
    onThisArea: (FilterUiState) -> Unit,    // 이 지역 검색 클릭 이벤트
    visible: Boolean,                       // 필터 표시 여부
    onNation: (City) -> Unit,                // 도시 클릭 이벤트
    image: (@Composable (
        Modifier,
        String,
        Dp?,
        Dp?,
        ContentScale?,
    ) -> Unit)? = null,
) {
    val uiState: FilterUiState by filterViewModel.uiState.collectAsState()
    val cities: List<City> by filterViewModel.cities.collectAsState()

    _FilterScreen(
        uiState = uiState,
        visible = visible,
        cities = cities,
        onFoodType = { filterViewModel.setType("FoodType") },
        onPrice = { filterViewModel.setType("Price") },
        onDistance = { filterViewModel.setType("Distance") },
        onRating = { filterViewModel.setType("Rating") },
        onFilterFoodType = { filterViewModel.setFoodType(it) },
        onFilterPrice = { filterViewModel.setPrice(it) },
        onFilterDistance = { filterViewModel.setDistance(it) },
        onFilterRating = { filterViewModel.setRating(it) },
        onNation = { filterViewModel.onNation() },
        onThisArea = { onThisArea.invoke(uiState) },
        onFilter = { onFilter.invoke(uiState) },
        onFilterNation = {
            filterViewModel.onNation(it)
            onNation.invoke(it)
        },
        image = image
    )

}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
private fun _FilterScreen(
    uiState: FilterUiState,
    visible: Boolean,                       // 필터 표시 여부,
    cities: List<City>,
    onFoodType: () -> Unit,
    onPrice: () -> Unit,
    onRating: () -> Unit,
    onDistance: () -> Unit,
    onNation: () -> Unit,
    onThisArea: () -> Unit,
    onFilter: () -> Unit,
    onFilterFoodType: (String) -> Unit,
    onFilterPrice: (String) -> Unit,
    onFilterRating: (String) -> Unit,
    onFilterDistance: (String) -> Unit,
    onFilterNation: (City) -> Unit,
    image: (@Composable (
        Modifier,
        String,
        Dp?,
        Dp?,
        ContentScale?,
    ) -> Unit)? = null,
) {
    val density = LocalDensity.current

    AnimatedVisibility(
        visible = visible,
        enter = slideInVertically { with(density) { -100.dp.roundToPx() } },
        exit = slideOutVertically { with(density) { -100.dp.roundToPx() } }
    ) {
        Column(Modifier.padding(start = 8.dp, end = 8.dp)) {

            Row(
                horizontalArrangement = Arrangement.End,
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Color.Transparent)
                    .padding(end = 8.dp, top = 8.dp, bottom = 8.dp)
            ) {
                SearchBar(
                    query = "",
                    onQueryChange = {},
                    placeholder = {
                        Text("search")
                    },
                    onSearch = {},
                    active = false,
                    onActiveChange = {},
                    leadingIcon = {
                        Icon(
                            imageVector = Icons.Default.Search,
                            contentDescription = null
                        )
                    },
                    trailingIcon = {
                        Icon(
                            imageVector = Icons.Default.AccountCircle,
                            contentDescription = ""
                        )
                    },
                    modifier = Modifier.fillMaxWidth(),
                    content = {}
                )
            }

            Row(
                horizontalArrangement = Arrangement.SpaceEvenly,
                modifier = Modifier.fillMaxWidth()
            ) {
                FilterButton(
                    modifier = Modifier.weight(1f),
                    text = uiState.footTypeLabel,
                    onClick = onFoodType
                )
                Spacer(modifier = Modifier.width(3.dp))
                FilterButton(
                    modifier = Modifier.weight(1f),
                    text = uiState.priceLabel,
                    onClick = onPrice
                )
                Spacer(modifier = Modifier.width(3.dp))
                FilterButton(
                    modifier = Modifier.weight(1f),
                    text = uiState.ratingLabel,
                    onClick = onRating
                )
                Spacer(modifier = Modifier.width(3.dp))
                FilterButton(
                    modifier = Modifier.weight(1f),
                    text = uiState.distanceLabel,
                    onClick = onDistance
                )
            }
            if (uiState.type == "FoodType") FoodFilter(
                foodType = uiState.foodType,
                onFoodType = onFilterFoodType
            )
            if (uiState.type == "Price") PriceFilter(
                price = uiState.price,
                onPrice = onFilterPrice
            )
            if (uiState.type == "Rating") RatingFilter(
                rating = uiState.rating,
                onRating = onFilterRating
            )
            if (uiState.type == "Distance") DistanceFilter(
                distance = uiState.distance,
                onDistance = onFilterDistance
            )

            Box(Modifier.fillMaxWidth()) {
                FilterButton(
                    leftImage = uiState.city,
                    text = uiState.city.name,
                    onClick = onNation
                )
                FilterButton(
                    modifier = Modifier.align(Alignment.Center),
                    text = "이 지역 검색",
                    onClick = onThisArea
                )
                FilterButton(
                    modifier = Modifier.align(Alignment.CenterEnd),
                    text = "필터적용",
                    onClick = onFilter
                )
            }

            if (uiState.showNationFilter) NationFilter(
                onNation = onFilterNation, list = cities,
                image = image
            )
        }
    }
}

@Preview
@Composable
fun FilterScreenPreview() {
    _FilterScreen(
        uiState = FilterUiState(
            type = "",
            foodType = listOf(),
            price = listOf(),
            rating = listOf(),
            distance = "",
        ),
        visible = true,
        cities = listOf(
        ), onFilter = {},
        onNation = {}, onThisArea = {}, onFilterFoodType = {},
        onFilterPrice = {}, onFilterRating = {}, onFilterDistance = {},
        onFoodType = {}, onPrice = {}, onRating = {}, onDistance = {},
        onFilterNation = {}
    )
}
