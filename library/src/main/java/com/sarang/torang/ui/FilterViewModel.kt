package com.sarang.torang.ui

import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.sarang.torang.data.City
import com.sarang.torang.data.Nation
import com.sarang.torang.usecase.GetCitiesByNationIdUseCase
import com.sarang.torang.usecase.GetCitiesUseCase
import com.sarang.torang.usecase.GetNationsUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject


@HiltViewModel
class FilterViewModel @Inject constructor(
    getCitiesUseCase: GetCitiesUseCase,
    private val getCitiesByNationIdUseCase: GetCitiesByNationIdUseCase,
    getNationUseCase: GetNationsUseCase,
) : ViewModel() {
    var uiState by mutableStateOf(FilterUiState())
        private set

    init {
        viewModelScope.launch {
            try {
                uiState = uiState.copy(cities = getCitiesUseCase.invoke())
                uiState = uiState.copy(nations = getNationUseCase.invoke())
            } catch (e: Exception) {

            }
        }

    }

    fun setType(s: String) {
        viewModelScope.launch {
            uiState = uiState.copy(
                type = if (uiState.type == s) "" else s
            )
        }
    }

    fun setFoodType(foodType: String) {
        viewModelScope.launch {
            uiState = uiState.copy(
                foodType = if (uiState.foodType.contains(foodType))
                    ArrayList(uiState.foodType.filter { it != foodType }.toList())
                else ArrayList(uiState.foodType).apply { add(foodType) }
            )
        }
    }

    fun setPrice(price: String) {
        viewModelScope.launch {
            uiState = uiState.copy(
                price = if (uiState.price.contains(price))
                    ArrayList(uiState.price.filter { it != price }.toList())
                else ArrayList(uiState.price).apply { add(price) }
            )
        }
    }

    fun setRating(rating: String) {
        viewModelScope.launch {
            uiState = uiState.copy(
                rating = if (uiState.rating.contains(rating))
                    ArrayList(uiState.rating.filter { it != rating }.toList())
                else ArrayList(uiState.rating).apply { add(rating) }
            )
        }
    }


    fun setDistance(distance: String) {
        viewModelScope.launch {
            uiState = uiState.copy(
                distance = if (uiState.distance == distance) "" else distance
            )
        }
    }

    fun onCity(city: City? = null) {
        viewModelScope.launch {
            if (city == null) {
                uiState = uiState.copy(showCityFilter = !uiState.showCityFilter)

            } else {
                val nation = uiState.nations.find { it.id == city.nation }
                uiState = uiState.copy(
                    selectedNation = nation,
                    selectedCity = city,
                    filteredCities = if (nation == null) arrayListOf() else getCitiesByNationIdUseCase.invoke(
                        nation.id
                    ),
                    showCityFilter = false
                )
            }
        }
    }

    fun onNation(nation: Nation? = null) {
        viewModelScope.launch {
            if (nation == null) {
                uiState = uiState.copy(showCityFilter = !uiState.showCityFilter)

            } else {
                viewModelScope.launch {
                    uiState = uiState.copy(
                        selectedNation = nation,
                        selectedCity = null,
                        filteredCities = getCitiesByNationIdUseCase.invoke(nation.id)
                    )
                }
            }
        }
    }

    fun setQuery(keyword: String) {
        uiState = uiState.copy(keyword = keyword)
    }
}