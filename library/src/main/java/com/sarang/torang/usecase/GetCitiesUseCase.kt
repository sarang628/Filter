package com.sarang.torang.usecase

import com.sarang.torang.data.City

interface GetCitiesUseCase {
    suspend fun invoke(): List<City>
}