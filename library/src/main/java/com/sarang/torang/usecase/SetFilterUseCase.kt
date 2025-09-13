package com.sarang.torang.usecase

interface SetFilterUseCase {
    suspend fun setFoodType(string: String)
    suspend fun setPrice(string: String)
    suspend fun setRating(string: String)
    suspend fun setDistance(string: String)
}