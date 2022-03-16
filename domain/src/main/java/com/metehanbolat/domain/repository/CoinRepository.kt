package com.metehanbolat.domain.repository

import com.metehanbolat.domain.model.CoinDetailDto
import com.metehanbolat.domain.model.CoinDto

interface CoinRepository {

    suspend fun getCoins(): List<CoinDto>

    suspend fun getCoinById(coinId: String): CoinDetailDto
}