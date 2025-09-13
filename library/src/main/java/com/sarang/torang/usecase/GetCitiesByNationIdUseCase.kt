package com.sarang.torang.usecase

import com.sarang.torang.data.City

interface GetCitiesByNationIdUseCase {
    suspend fun invoke(nationId : Int): List<City>
}