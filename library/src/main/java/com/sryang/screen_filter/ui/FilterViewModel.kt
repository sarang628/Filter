package com.sryang.screen_filter.ui

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject
import kotlin.streams.toList


@HiltViewModel
class FilterViewModel @Inject constructor() : ViewModel() {
    private val _uiState = MutableStateFlow(
        FilterUiState(
            type = "",
            foodType = ArrayList(),
            price = ArrayList(),
            rating = ArrayList(),
            distance = ""
        )
    )
    val uiState = _uiState.asStateFlow()

    private val selectedFilter = _uiState

    fun setType(s: String) {
        viewModelScope.launch {
            _uiState.emit(
                uiState.value.copy(
                    type = if (uiState.value.type == s) "" else s
                )
            )
        }
    }

    fun setFoodType(foodType: String) {
        viewModelScope.launch {
            _uiState.emit(
                uiState.value.copy(
                    foodType = if (uiState.value.foodType.contains(foodType))
                        ArrayList(uiState.value.foodType.stream().filter { it != foodType }
                            .toList())
                    else ArrayList(uiState.value.foodType).apply { add(foodType) }
                )
            )
        }
    }

    fun setPrice(price: String) {
        viewModelScope.launch {
            _uiState.emit(
                uiState.value.copy(
                    price = if (uiState.value.price.contains(price))
                        ArrayList(uiState.value.price.stream().filter { it != price }.toList())
                    else ArrayList(uiState.value.price).apply { add(price) }
                )
            )
        }
    }

    fun setRating(rating: String) {
        viewModelScope.launch {
            _uiState.emit(
                uiState.value.copy(
                    rating = if (uiState.value.rating.contains(rating))
                        ArrayList(uiState.value.rating.stream().filter { it != rating }.toList())
                    else ArrayList(uiState.value.rating).apply { add(rating) }
                )
            )
        }
    }

    fun setDistance(distance: String) {
        viewModelScope.launch {
            _uiState.emit(
                uiState.value.copy(
                    distance = if (uiState.value.distance == distance) "" else distance
                )
            )
        }
    }
}