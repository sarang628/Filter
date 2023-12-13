package com.sryang.screen_filter.usecase

import com.sryang.screen_filter.data.City

interface GetCitiesUseCase {
    suspend fun invoke(): List<City>
}