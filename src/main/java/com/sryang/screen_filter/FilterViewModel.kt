package com.sryang.screen_filter

import android.text.TextUtils
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.torang_core.data.model.*
import com.example.torang_core.repository.FilterRepository
import com.example.torang_core.repository.FindRepository
import com.example.torang_core.repository.MapRepository
import com.example.torang_core.util.Event
import com.example.torang_core.util.Logger
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.update
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

    val food = MutableLiveData<String>()
    val ratings = MutableLiveData<String>()

    /** 거리 필터 */
    val selectedDistances = MutableLiveData<Distances>()

    /** 가격 필터 */
    val selectedPrice = MutableLiveData<Prices>()

    /** 평점필터 */
    val selectedRatings = MutableLiveData<ArrayList<Ratings>>()

    /** 거리 필터 클릭 */
    private val _clickDistance = MutableLiveData<Event<Unit>>()
    val clickDistance: LiveData<Event<Unit>> = _clickDistance

    /** 가격 필터 클릭 */
    private val _clickPrice = MutableLiveData<Event<Unit>>()
    val clickPrice: LiveData<Event<Unit>> = _clickPrice

    /** 평점 필터 클릭 */
    private val _clickRating = MutableLiveData<Event<Unit>>()
    val clickRating: LiveData<Event<Unit>> = _clickRating

    /** 음식 필터 클릭 */
    private val _clickFood = MutableLiveData<Event<Unit>>()
    val clickFood: LiveData<Event<Unit>> = _clickFood


    /** 내 위치 */
    var latitudeMyLocation: Double = 0.0
    var longitudeMyLocation: Double = 0.0

    /** 이 지역 위치 */
    var northEastLatitude: Double = 0.0
    var northEastLongitude: Double = 0.0
    var southWestLatitude: Double = 0.0
    var southWestLongitude: Double = 0.0

    val clickMap = mapRepository.getClickMap()

    private val isShow = MutableLiveData<Boolean>()


    /**
     * 음식 종류 선택
     */
    fun setFood(food: RestaurantType) {
        viewModelScope.launch {
            filterRepository.selectRestaurantTyoe(food)
        }
    }

    fun setSelectedPrice(price: Prices) {
        if (selectedPrice.value == price) selectedPrice.setValue(Prices.NONE) else selectedPrice.setValue(
            price
        )
    }

    fun setSelectRatings(ratings: Ratings) {
        val ratingsArrayList = selectedRatings.value!!
        if (ratingsArrayList.contains(ratings)) {
            ratingsArrayList.remove(ratings)
        } else {
            ratingsArrayList.add(ratings)
        }
        val arr = ArrayList<String?>()
        for (rating in ratingsArrayList) {
            arr.add(rating.toName)
        }
        selectedRatings.value = ratingsArrayList
        this.ratings.value = if (ratingsArrayList.size == 0) "평점" else TextUtils.join(",", arr)
    }

    fun setSelectedDistances(distances: Distances) {
        if (selectedDistances.value == distances) selectedDistances.setValue(Distances.NONE) else selectedDistances.setValue(
            distances
        )
    }

    init {
        food.value = "음식종류"
        ratings.value = "평점"
        selectedPrice.value = Prices.NONE
        selectedDistances.value = Distances.NONE
        selectedRatings.value = ArrayList()
        isShow.value = false

        viewModelScope.launch {
            filterRepository.getCurrentFilter().collect { a ->
                Logger.d(a)
                _uiState.update {
                    it.copy(a)
                }
            }
        }
    }

    fun clickDistance() {
        _clickDistance.value = Event(Unit)
    }

    fun clickFood() {
        _clickFood.value = Event(Unit)
    }

    fun clickPrice() {
        _clickPrice.value = Event(Unit)
    }

    fun clickRating() {
        _clickRating.value = Event(Unit)
    }

    fun searchFilterRestaurant() {

    }

    fun searchBoundRestaurant() {
    }

}