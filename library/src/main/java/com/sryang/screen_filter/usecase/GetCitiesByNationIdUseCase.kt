package com.sryang.screen_filter.usecase

import com.sryang.screen_filter.data.City

interface GetCitiesByNationIdUseCase {
    suspend fun invoke(nationId : Int): List<City>
}