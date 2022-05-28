package com.sryang.screen_filter

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.torang_core.data.model.*
import com.example.torang_core.repository.FilterRepository
import com.example.torang_core.repository.FindRepository
import com.example.torang_core.repository.MapRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.*
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class FilterViewModel @Inject constructor(
    private val mapRepository: MapRepository,
    private val findRepository: FindRepository,
    private val filterRepository: FilterRepository
) : ViewModel() {

    private val _uiState = MutableStateFlow(FilterUiState())
    val uiState: StateFlow<FilterUiState> = _uiState

    /** 내 위치 */
    var latitudeMyLocation: Double = 0.0
    var longitudeMyLocation: Double = 0.0

    /** 이 지역 위치 */
    var northEastLatitude: Double = 0.0
    var northEastLongitude: Double = 0.0
    var southWestLatitude: Double = 0.0
    var southWestLongitude: Double = 0.0

    val showRestaurantCardAndFilter = findRepository.showRestaurantCardAndFilter()

    private val isShow = MutableLiveData<Boolean>()

    init {
        isShow.value = false

        viewModelScope.launch {
            filterRepository.getCurrentFilter().collect { filter ->
                _uiState.update {
                    it.copy(filter = filter)
                }
            }
        }
    }

    /**
     * 음식 종류 선택
     */
    fun setFood(food: RestaurantType) {
        viewModelScope.launch {
            filterRepository.selectRestaurantType(food)
        }
    }

    fun setSelectedPrice(price: Prices) {
        viewModelScope.launch {
            filterRepository.selectPrice(price)
        }
    }

    fun setSelectRatings(ratings: Ratings) {
        viewModelScope.launch {
            filterRepository.selectRatings(ratings)
        }
    }

    fun setSelectedDistances(distances: Distances) {
        viewModelScope.launch {
            filterRepository.selectDistance(distances)
        }
    }

    fun searchFilterRestaurant() {

    }

    fun searchBoundRestaurant() {
        viewModelScope.launch {
            findRepository.searchBoundRestaurant()
        }
    }
}