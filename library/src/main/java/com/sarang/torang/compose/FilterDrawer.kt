package com.sarang.torang.compose

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.outlined.ExitToApp
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.outlined.Settings
import androidx.compose.material3.DrawerState
import androidx.compose.material3.DrawerValue
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.ModalDrawerSheet
import androidx.compose.material3.ModalNavigationDrawer
import androidx.compose.material3.NavigationDrawerItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.rememberDrawerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import com.sarang.torang.data.City
import com.sarang.torang.data.Nation
import kotlinx.coroutines.launch


@OptIn(ExperimentalMaterial3Api::class)
@Preview
@Composable
fun FilterDrawerScreen(filterViewModel: FilterViewModel = hiltViewModel(), drawerState : DrawerState = rememberDrawerState(initialValue = DrawerValue.Open), content: @Composable () -> Unit = {}) {
    val scope = rememberCoroutineScope()

    val uiState = filterViewModel.uiState

    FilterDrawer(uiState = uiState,
        drawerState         = drawerState,
        onFilterFoodType =  { filterViewModel.setFoodType(it) },
        onFilterPrice =     { filterViewModel.setPrice(it) },
        onFilterDistance =  { filterViewModel.setDistance(it) },
        onFilterRating =    { filterViewModel.setRating(it) },
        onFilterCity =      { filterViewModel.onCity(it) },
        onFilterNation =    { filterViewModel.onNation(it) },
        onQueryChange =     { filterViewModel.setQuery(it) },
        content             = content)
}

@OptIn(ExperimentalMaterial3Api::class)
@Preview
@Composable
fun FilterDrawer(uiState: FilterUiState = FilterUiState(),
                 drawerState : DrawerState = rememberDrawerState(initialValue = DrawerValue.Open),
                 onFilterFoodType : (String) -> Unit  = {},
                 onFilterPrice    : (String) -> Unit  = {},
                 onFilterRating   : (String) -> Unit  = {},
                 onFilterDistance : (String) -> Unit  = {},
                 onFilterCity     : (City) -> Unit    = {},
                 onFilterNation   : (Nation) -> Unit  = {},
                 onSearch         : () -> Unit        = {},
                 onQueryChange    : (String) -> Unit  = {},
                 content: @Composable () -> Unit = {}) {

    ModalNavigationDrawer(drawerContent = { ModalDrawerSheet {
        Column(modifier = Modifier.padding(horizontal = 16.dp).verticalScroll(rememberScrollState())) {
            Spacer(Modifier.height(12.dp))
            Text("Filter", modifier = Modifier.padding(16.dp), style = MaterialTheme.typography.titleLarge)
            HorizontalDivider()
            Text("Food Type", modifier = Modifier.padding(16.dp), style = MaterialTheme.typography.titleMedium)
            FoodFilter1(foodType = uiState.foodType, onFoodType = onFilterFoodType)
            HorizontalDivider(modifier = Modifier.padding(vertical = 8.dp))
            Text("Price, Rating, Distance", modifier = Modifier.padding(16.dp), style = MaterialTheme.typography.titleMedium)
            PriceFilter1(price = uiState.price, onPrice = onFilterPrice)
            RatingFilter1(rating = uiState.rating, onRating = onFilterRating)
            DistanceFilter1(distance = uiState.distance, onDistance = onFilterDistance)
            HorizontalDivider(modifier = Modifier.padding(vertical = 8.dp))
            Text("Region", modifier = Modifier.padding(16.dp), style = MaterialTheme.typography.titleMedium)
            NationFilter(list = uiState.nations, selectedNation = uiState.selectedNation, onClick = onFilterNation)
            CityRowFilter(list = uiState.filteredCities, selectedCity = uiState.selectedCity, onNation = onFilterCity)
            Spacer(modifier = Modifier.height(10.dp))
            HorizontalDivider()
            Spacer(modifier = Modifier.height(10.dp))
            Text(text = "recommand cities", color = Color.DarkGray, fontWeight = FontWeight.Bold)
            CityFilter(onNation = onFilterCity, list = uiState.cities)
            Spacer(Modifier.height(12.dp))
    } } }, drawerState = drawerState) {
        content.invoke()
    }
}