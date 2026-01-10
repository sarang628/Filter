package com.sarang.torang.compose

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.sarang.torang.data.City
import com.sarang.torang.data.Nation
import com.sarang.torang.usecase.FindFilterUseCase
import com.sarang.torang.usecase.FindThisAreaUseCase
import com.sarang.torang.usecase.GetCitiesByNationIdUseCase
import com.sarang.torang.usecase.GetCitiesUseCase
import com.sarang.torang.usecase.GetFiltersUseCase
import com.sarang.torang.usecase.GetNationsUseCase
import com.sarang.torang.usecase.SetFilterUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class FilterViewModel @Inject constructor(
    val getCitiesUseCase: GetCitiesUseCase,
    val getCitiesByNationIdUseCase: GetCitiesByNationIdUseCase,
    val getNationUseCase: GetNationsUseCase,
    val findFilterUseCase: FindFilterUseCase,
    val findThisAreaUseCase: FindThisAreaUseCase,
    val setFilterUseCase: SetFilterUseCase,
    val getFilterUseCase: GetFiltersUseCase
) : ViewModel() {
    var uiState by mutableStateOf(FilterUiState()); private set

    init {
        viewModelScope.launch {
            try {
                uiState = uiState.copy(cities = getCitiesUseCase.invoke())
                uiState = uiState.copy(nations = getNationUseCase.invoke())
            } catch (e: Exception) {

            }
        }

        viewModelScope.launch {
            launch { getFilterUseCase.getPrice()
                                     .collect { uiState = uiState.copy(price = it) } }
            launch { getFilterUseCase.getRating()
                                     .collect { uiState = uiState.copy(rating = it) } }
            launch { getFilterUseCase.getDistance(viewModelScope)
                                     .collect { uiState = uiState.copy(distance = it) } }
            launch { getFilterUseCase.getFoodType()
                                     .collect { uiState = uiState.copy(foodType = it) } }
        }
    }

    fun setQuery(keyword: String) { uiState = uiState.copy(keyword = keyword) }
    fun onThisArea() { viewModelScope.launch { findThisAreaUseCase.invoke() } }
    fun onFilter() { viewModelScope.launch { findFilterUseCase.invoke() } }
    fun setType(s: String) { viewModelScope.launch { uiState = uiState.copy(type = if (uiState.type == s) "" else s) } }
    fun setFoodType(foodType: String) { viewModelScope.launch { setFilterUseCase.setFoodType(foodType) } }
    fun setPrice(price: String) { viewModelScope.launch { setFilterUseCase.setPrice(price) } }
    fun setRating(rating: String) { viewModelScope.launch { setFilterUseCase.setRating(rating) } }
    fun setDistance(distance: String) { viewModelScope.launch { setFilterUseCase.setDistance(distance) } }

    fun onCity(city: City? = null) {
        viewModelScope.launch {
            if (city == null) { uiState = uiState.copy(showCityFilter = !uiState.showCityFilter) }
            else { val nation = uiState.nations.find { it.id == city.nation }
                uiState = uiState.copy(selectedNation = nation, selectedCity = city, filteredCities = if (nation == null) arrayListOf() else getCitiesByNationIdUseCase.invoke(nation.id), showCityFilter = false) }
        }
    }

    fun onNation(nation: Nation? = null) {
        viewModelScope.launch {
            if (nation == null) { uiState = uiState.copy(showCityFilter = !uiState.showCityFilter) }
            else { viewModelScope.launch { uiState = uiState.copy(selectedNation = nation, selectedCity = null, filteredCities = getCitiesByNationIdUseCase.invoke(nation.id)) } }
        }
    }
}