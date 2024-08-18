package com.sryang.screen_filter.usecase

import com.sryang.screen_filter.data.Nation

interface GetNationsUseCase {
    suspend fun invoke(): List<Nation>
}