package com.sarang.torang.compose

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.DrawerState
import androidx.compose.material3.DrawerValue
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.ModalDrawerSheet
import androidx.compose.material3.ModalNavigationDrawer
import androidx.compose.material3.Text
import androidx.compose.material3.rememberDrawerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import com.sarang.torang.data.City
import com.sarang.torang.data.Nation
import com.sarang.torang.uistate.FilterDrawerCallBack
import kotlinx.coroutines.launch


@OptIn(ExperimentalMaterial3Api::class)
@Preview
@Composable
fun FilterDrawerScreen(filterViewModel  : FilterViewModel = hiltViewModel(),
                       drawerState      : DrawerState = rememberDrawerState(initialValue = DrawerValue.Open),
                       onFilterCity     : (City) -> Unit    = {},
                       onFilterNation   : (Nation) -> Unit  = {},
                       content          : @Composable () -> Unit = {}) {
    val uiState = filterViewModel.uiState
    val scope = rememberCoroutineScope()

    FilterMediumDrawer(uiState              = uiState,
                       drawerState          = drawerState,
                       onFilter             = { filterViewModel.onFilter()
                                                scope.launch {
                                                    drawerState.close()
                                                }
                                              },
                       content              = content,
                       filterDrawerCallBack = FilterDrawerCallBack(
                                                    onFilterFoodType    = { filterViewModel.setFoodType(it) },
                                                    onFilterPrice       = { filterViewModel.setPrice(it) },
                                                    onFilterDistance    = { filterViewModel.setDistance(it) },
                                                    onFilterRating      = { filterViewModel.setRating(it) },
                                                    onFilterCity        = { filterViewModel.onCity(it)
                                                                            onFilterCity.invoke(it) },
                                                    onFilterNation      = { filterViewModel.onNation(it)
                                                                            onFilterNation.invoke(it) },
                                                    onQueryChange       = { filterViewModel.setQuery(it) }
                                                                   )
    )
}

@OptIn(ExperimentalMaterial3Api::class)
@Preview
@Composable
fun FilterMediumDrawer(uiState                : FilterUiState             = FilterUiState(),
                       drawerState            : DrawerState               = rememberDrawerState(initialValue = DrawerValue.Open),
                       filterDrawerCallBack   : FilterDrawerCallBack      = FilterDrawerCallBack(),
                       onFilter               : ()->Unit                  = {},
                       content                : @Composable () -> Unit    = {}) {

    ModalNavigationDrawer(gesturesEnabled   = drawerState.isOpen,
                          drawerContent     = {
                              ModalDrawerSheet {
                                  FilterMediumDrawerSheet(uiState = uiState,
                                                          filterDrawerCallBack = filterDrawerCallBack,
                                                          onFilter = onFilter)
                                               }
                                              },
                          drawerState       = drawerState) {
        content.invoke()
    }
}

@Composable
fun FilterMediumDrawerSheet(
    uiState                : FilterUiState             = FilterUiState(),
    filterDrawerCallBack   : FilterDrawerCallBack      = FilterDrawerCallBack(),
    onFilter               : ()->Unit                  = {},
){
    Box(Modifier.fillMaxHeight()) {
        Column(modifier = Modifier.padding(horizontal = 16.dp)
            .verticalScroll(rememberScrollState())) {
            Spacer(modifier = Modifier.height(12.dp))
            FilterMediumTitle(title = "Filter")
            HorizontalDivider()

            FilterSmall         (title      = "Food Type")
            FoodFilter          (foodType   = uiState.foodType,
                onFoodType  = filterDrawerCallBack.onFilterFoodType)
            HorizontalDivider   (modifier   = Modifier.padding(vertical = 8.dp))

            FilterSmall         (title      = "Price, Rating, Distance")
            PriceFilter         (price      = uiState.price,
                onPrice    = filterDrawerCallBack.onFilterPrice)
            RatingFilter        (rating     = uiState.rating,
                onRating   = filterDrawerCallBack.onFilterRating)
            DistanceFilter      (distance   = uiState.distance,
                onDistance = filterDrawerCallBack.onFilterDistance)
            HorizontalDivider   (modifier   = Modifier.padding(vertical = 8.dp))

            FilterSmall         (title      = "Region")
            NationFilter        (list       = uiState.nations,
                selectedNation = uiState.selectedNation,
                onClick    = filterDrawerCallBack.onFilterNation)
            CityRowFilter       (list       = uiState.filteredCities,
                selectedCity  = uiState.selectedCity,
                onNation   = filterDrawerCallBack.onFilterCity)
            HorizontalDivider   (modifier   = Modifier.padding(vertical = 10.dp))


            Text(text       = "recommended cities",
                color      = Color.DarkGray,
                fontWeight = FontWeight.Bold)
            CityFilter(onNation = filterDrawerCallBack.onFilterCity,
                list = uiState.cities)
            Spacer(Modifier.height(52.dp))
        }
        Button(modifier = Modifier.align(Alignment.BottomCenter)
            .fillMaxWidth(),
            onClick = onFilter,
            shape = RoundedCornerShape(8.dp)
        ) {
            Text("Apply Filter")
        }
    }
}

@Composable
fun FilterMediumTitle(title : String){
    Text(text       = title,
        modifier   = Modifier.padding(16.dp),
        style      = MaterialTheme.typography.titleMedium)
}

@Composable
fun FilterSmall(title : String){
    Text(text       = title,
        modifier   = Modifier.padding(16.dp),
        style      = MaterialTheme.typography.titleSmall)
}