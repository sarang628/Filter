package com.sarang.torang.usecase

import kotlinx.coroutines.flow.StateFlow

interface GetFiltersUseCase {
    fun getFoodType() : StateFlow<List<String>>
    fun getPrice() : StateFlow<List<String>>
    fun getRating() : StateFlow<List<String>>
    fun getDistance() : StateFlow<String>
}