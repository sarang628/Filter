package com.sarang.torang.ui

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
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.SearchBar
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.platform.LocalSoftwareKeyboardController
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import com.sarang.torang.compose.CityFilter
import com.sarang.torang.compose.CityRowFilter
import com.sarang.torang.compose.FilterButton
import com.sarang.torang.compose.FilterImageButton
import com.sarang.torang.compose.NationFilter
import com.sarang.torang.data.City
import com.sarang.torang.data.Nation

/**
 * @param filterViewModel   filter 뷰모델
 * @param onFilter          필터 검색 클릭
 * @param onThisArea        이 지역 검색 클릭
 * @param visible           필터 표시 여부
 * @param onCity            도시 선택
 * @param onNation          국가 선택
 * @param onSearch          검색 선택
 */
@Composable
fun FilterScreen(filterViewModel: FilterViewModel = hiltViewModel(), onFilter: (FilterUiState) -> Unit = {}, onThisArea: (FilterUiState) -> Unit = {}, visible: Boolean = false, onCity: (City) -> Unit = {}, onNation: (Nation) -> Unit = {}, onSearch: (FilterUiState) -> Unit = {}, image: (@Composable (Modifier, String, Dp?, Dp?, ContentScale?, ) -> Unit)? = { _,_,_,_,_-> }, topPadding : Dp = 0.dp) {
    val uiState = filterViewModel.uiState
    Filter(
        uiState = uiState,
        visible = visible,
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
        onFilterCity = { filterViewModel.onCity(it);onCity.invoke(it) },
        onFilterNation = { filterViewModel.onNation(it);onNation.invoke(it) },
        onSearch = { onSearch.invoke(uiState) },
        onQueryChange = { filterViewModel.setQuery(it) },
        image = image,
        topPadding = topPadding
    )
}

@Composable
private fun Filter(uiState: FilterUiState, visible: Boolean = false, onFoodType: () -> Unit = {}, onPrice: () -> Unit = {}, onRating: () -> Unit = {}, onDistance: () -> Unit = {}, onNation: () -> Unit = {}, onThisArea: () -> Unit = {}, onFilter: () -> Unit = {}, onFilterFoodType: (String) -> Unit = {}, onFilterPrice: (String) -> Unit = {}, onFilterRating: (String) -> Unit = {}, onFilterDistance: (String) -> Unit = {}, onFilterCity: (City) -> Unit = {}, onFilterNation: (Nation) -> Unit = {}, onSearch: () -> Unit = {}, onQueryChange: (String) -> Unit = {}, image: (@Composable (Modifier, String, Dp?, Dp?, ContentScale?, ) -> Unit)? = null, topPadding: Dp = 0.dp) {
    val density = LocalDensity.current

    AnimatedVisibility(visible = visible, enter = slideInVertically { with(density) { -100.dp.roundToPx() } }, exit = slideOutVertically { with(density) { -100.dp.roundToPx() } }) {
        Column(Modifier.padding(start = 8.dp, end = 8.dp, top = topPadding)) {
            Row(horizontalArrangement = Arrangement.End, modifier = Modifier.fillMaxWidth().background(Color.Transparent)) {
                _SearchBar(keyword = uiState.keyword, onQueryChange = onQueryChange, onSearch = onSearch)
            }
            Spacer(Modifier.height(8.dp))
            CustomFilterRow(footTypeLabel = uiState.footTypeLabel, priceLabel = uiState.priceLabel, ratingLabel = uiState.ratingLabel, distanceLabel = uiState.distanceLabel, onFoodType = onFoodType, onPrice = onPrice, onRating = onRating, onDistance = onDistance)

            if (uiState.type == "FoodType")
                FoodFilter(foodType = uiState.foodType, onFoodType = onFilterFoodType)
            if (uiState.type == "Price")
                PriceFilter(price = uiState.price, onPrice = onFilterPrice)
            if (uiState.type == "Rating")
                RatingFilter(rating = uiState.rating, onRating = onFilterRating)
            if (uiState.type == "Distance")
                DistanceFilter(distance = uiState.distance, onDistance = onFilterDistance)
            Box(Modifier.fillMaxWidth()) {
                FilterImageButton(text = uiState.selectedNationOrCityName, onClick = onNation)
                FilterButton(modifier = Modifier.align(Alignment.Center), text = "이 지역 검색", onClick = onThisArea)
                FilterButton(modifier = Modifier.align(Alignment.CenterEnd), text = "필터적용", onClick = onFilter)
            }

            if (uiState.showCityFilter) {
                NationFilter(list = uiState.nations, selectedNation = uiState.selectedNation, image = image, onClick = onFilterNation)
                CityRowFilter(list = uiState.filteredCities, selectedCity = uiState.selectedCity, onNation = onFilterCity, image = image)
                Spacer(modifier = Modifier.height(10.dp))
                HorizontalDivider()
                Spacer(modifier = Modifier.height(10.dp))
                Text(text = "recommand cities", color = Color.DarkGray, fontWeight = FontWeight.Bold)
                CityFilter(onNation = onFilterCity, list = uiState.cities, image = image)
            }
        }
    }
}

@Composable
private fun CustomFilterRow(footTypeLabel: String, priceLabel: String, ratingLabel: String, distanceLabel: String, onFoodType: () -> Unit = {}, onPrice: () -> Unit = {}, onRating: () -> Unit = {}, onDistance: () -> Unit = {}) {
    Row(horizontalArrangement = Arrangement.SpaceEvenly, modifier = Modifier.fillMaxWidth()) {
        FilterButton(modifier = Modifier.weight(1f), text = footTypeLabel, onClick = onFoodType)
        Spacer(modifier = Modifier.width(3.dp))
        FilterButton(modifier = Modifier.weight(1f), text = priceLabel, onClick = onPrice)
        Spacer(modifier = Modifier.width(3.dp))
        FilterButton(modifier = Modifier.weight(1f), text = ratingLabel, onClick = onRating)
        Spacer(modifier = Modifier.width(3.dp))
        FilterButton(modifier = Modifier.weight(1f), text = distanceLabel, onClick = onDistance)
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
private fun _SearchBar(keyword: String, onQueryChange: (String) -> Unit, onSearch: () -> Unit) {
    val keyboardController = LocalSoftwareKeyboardController.current
    SearchBar(
        query = keyword,
        onQueryChange = onQueryChange,
        placeholder = { Text("search") },
        onSearch = { keyboardController?.hide(); onSearch.invoke() },
        active = false,
        onActiveChange = {},
        leadingIcon = { Icon(imageVector = Icons.Default.Search, contentDescription = null) },
        trailingIcon = { Icon(imageVector = Icons.Default.AccountCircle, contentDescription = "") },
        modifier = Modifier.fillMaxWidth(),
        content = {}
    )
}

@Preview
@Composable
fun FilterScreenPreview() {
    Filter(/*Preview*/
        uiState = FilterUiState(type = "", foodType = listOf(), price = listOf(), rating = listOf(), distance = "",),
        visible = true,
    )
}
