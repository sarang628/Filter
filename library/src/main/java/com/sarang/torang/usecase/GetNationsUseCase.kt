package com.sarang.torang.usecase

import com.sarang.torang.data.Nation

interface GetNationsUseCase {
    suspend fun invoke(): List<Nation>
}