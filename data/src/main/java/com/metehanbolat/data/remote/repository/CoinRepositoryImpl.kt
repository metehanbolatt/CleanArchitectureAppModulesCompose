package com.metehanbolat.data.remote.repository

import com.metehanbolat.data.remote.api.CoinPaprikaApi
import com.metehanbolat.domain.model.CoinDetailDto
import com.metehanbolat.domain.model.CoinDto
import com.metehanbolat.domain.repository.CoinRepository
import javax.inject.Inject

class CoinRepositoryImpl @Inject constructor(
    private val api: CoinPaprikaApi
): CoinRepository {

    override suspend fun getCoins(): List<CoinDto> {
        return api.getCoins()
    }

    override suspend fun getCoinById(coinId: String): CoinDetailDto {
        return api.getCoinById(coinId)
    }
}