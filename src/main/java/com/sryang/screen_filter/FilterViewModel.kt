package com.sryang.screen_filter

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.torang_core.data.NationItem
import com.example.torang_core.data.model.*
import com.example.torang_core.repository.FilterRepository
import com.example.torang_core.repository.FindRepository
import com.example.torang_core.repository.MapRepository
import com.example.torang_core.repository.NationRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.InternalCoroutinesApi
import kotlinx.coroutines.flow.*
import kotlinx.coroutines.launch
import javax.inject.Inject

@OptIn(InternalCoroutinesApi::class)
@HiltViewModel
class FilterViewModel @Inject constructor(
    private val mapRepository: MapRepository,
    private val findRepository: FindRepository,
    private val filterRepository: FilterRepository,
    private val nationRepository: NationRepository
) : ViewModel() {

    private val _uiState = MutableStateFlow(FilterUiState())
    val uiState: StateFlow<FilterUiState> = _uiState
    val selected: StateFlow<NationItem> = nationRepository.getSelectNationItem()
    val showRestaurantCardAndFilter: StateFlow<Boolean> =
        findRepository.showRestaurantCardAndFilter()
    private val isShow = MutableLiveData<Boolean>()


    init {
        isShow.value = false

        viewModelScope.launch {
            filterRepository.getCurrentFilter().collect(FlowCollector { filter ->
                _uiState.update {
                    it.copy(filter = filter)
                }
            })
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
            searchBoundRestaurant(
                mapRepository.getNorthEastLatitude(),
                mapRepository.getNorthEastLongitude(),
                mapRepository.getSouthWestLatitude(),
                mapRepository.getSouthWestLongitude()
            )
        }
    }

    private suspend fun searchBoundRestaurant(
        northEastLatitude: Double,
        northEastLongitude: Double,
        southWestLatitude: Double,
        southWestLongitude: Double
    ) {
        val filter = filterRepository.getFilter()
        findRepository.searchRestaurant(
            distances = filter.distances,
            restaurantType = filter.restaurantTypes,
            prices = filter.prices,
            ratings = filter.ratings,
            northEastLatitude = northEastLatitude,
            northEastLongitude = northEastLongitude,
            southWestLatitude = southWestLatitude,
            southWestLongitude = southWestLongitude,
            searchType = SearchType.BOUND
        )
    }
}