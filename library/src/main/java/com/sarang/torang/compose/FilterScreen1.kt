package com.sarang.torang.compose

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.slideInVertically
import androidx.compose.animation.slideOutVertically
import androidx.compose.foundation.background
import androidx.compose.foundation.basicMarquee
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
import androidx.compose.material3.MultiChoiceSegmentedButtonRow
import androidx.compose.material3.SearchBar
import androidx.compose.material3.SegmentedButton
import androidx.compose.material3.SegmentedButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.platform.LocalSoftwareKeyboardController
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import com.sarang.torang.data.City
import com.sarang.torang.data.Nation

/**
 * @param filterViewModel   filter 뷰모델
 * @param visible           필터 표시 여부
 * @param onCity            도시 선택
 * @param onNation          국가 선택
 * @param onSearch          검색 선택
 */
//@formatter:off
@Composable
fun FilterScreen1(filterViewModel: FilterViewModel = hiltViewModel(), visible: Boolean = false, onCity: (City) -> Unit = {}, onNation: (Nation) -> Unit = {}, onSearch: (FilterUiState) -> Unit = {}, topPadding : Dp = 0.dp) {
    val uiState = filterViewModel.uiState
    Filter1(
        uiState = uiState,
        visible = visible,
        onFoodType =        { filterViewModel.setType("FoodType") },
        onPrice =           { filterViewModel.setType("Price") },
        onDistance =        { filterViewModel.setType("Distance") },
        onRating =          { filterViewModel.setType("Rating") },
        onFilterFoodType =  { filterViewModel.setFoodType(it) },
        onFilterPrice =     { filterViewModel.setPrice(it) },
        onFilterDistance =  { filterViewModel.setDistance(it) },
        onFilterRating =    { filterViewModel.setRating(it) },
        onNation =          { filterViewModel.onNation() },
        onThisArea =        { filterViewModel.onThisArea() },
        onFilter =          { filterViewModel.onFilter() },
        onFilterCity =      { filterViewModel.onCity(it);onCity.invoke(it) },
        onFilterNation =    { filterViewModel.onNation(it);onNation.invoke(it) },
        onSearch =          { onSearch.invoke(uiState) },
        onQueryChange =     { filterViewModel.setQuery(it) },
        topPadding = topPadding
    )
}
//@formatter:on

@Composable
private fun Filter1(uiState          : FilterUiState     = FilterUiState(),
                   visible          : Boolean           = false,
                   onFoodType       : () -> Unit        = {},
                   onPrice          : () -> Unit        = {},
                   onRating         : () -> Unit        = {},
                   onDistance       : () -> Unit        = {},
                   onNation         : () -> Unit        = {},
                   onThisArea       : () -> Unit        = {},
                   onFilter         : () -> Unit        = {},
                   onFilterFoodType : (String) -> Unit  = {},
                   onFilterPrice    : (String) -> Unit  = {},
                   onFilterRating   : (String) -> Unit  = {},
                   onFilterDistance : (String) -> Unit  = {},
                   onFilterCity     : (City) -> Unit    = {},
                   onFilterNation   : (Nation) -> Unit  = {},
                   onSearch         : () -> Unit        = {},
                   onQueryChange    : (String) -> Unit  = {},
                   topPadding       : Dp = 0.dp) {
    val density = LocalDensity.current

    AnimatedVisibility(visible = visible, enter = slideInVertically { with(density) { -200.dp.roundToPx() } }, exit = slideOutVertically { with(density) { -200.dp.roundToPx() } }) {
        Column(Modifier.padding(start = 8.dp, end = 8.dp, top = topPadding)) {
            Row(horizontalArrangement = Arrangement.End, modifier = Modifier.fillMaxWidth().background(Color.Transparent)) {
                _SearchBar(keyword = uiState.keyword, onQueryChange = onQueryChange, onSearch = onSearch)
            }
            Spacer(Modifier.height(8.dp))

            Box(Modifier.fillMaxWidth()) {
                FilterImageButton(text = uiState.selectedNationOrCityName, onClick = onNation)
                FilterButton(modifier = Modifier.align(Alignment.Center), text = "이 지역 검색", onClick = onThisArea)
                FilterButton(modifier = Modifier.align(Alignment.CenterEnd), text = "필터적용", onClick = onFilter)
            }

            if (uiState.showCityFilter) {
                NationFilter(list = uiState.nations, selectedNation = uiState.selectedNation, onClick = onFilterNation)
                CityRowFilter(list = uiState.filteredCities, selectedCity = uiState.selectedCity, onNation = onFilterCity)
                Spacer(modifier = Modifier.height(10.dp))
                HorizontalDivider()
                Spacer(modifier = Modifier.height(10.dp))
                Text(text = "recommand cities", color = Color.DarkGray, fontWeight = FontWeight.Bold)
                CityFilter(onNation = onFilterCity, list = uiState.cities)
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

@Preview
@Composable
private fun MarqueeText(text : String = ""){
    Text(text = text, maxLines = 1, modifier = Modifier.basicMarquee())
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
fun FilterScreen1Preview() {
    Filter1(/*Preview*/
        uiState = FilterUiState(
            type = "",
            foodType = listOf(),
            price = listOf(),
            rating = listOf(),
            distance = "",
        ),
        visible = true,
    )
}
