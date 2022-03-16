package com.metehanbolat.domain.extensions

import com.metehanbolat.domain.model.CoinDetailDto
import com.metehanbolat.domain.model.CoinDto
import com.metehanbolat.domain.model.Coin
import com.metehanbolat.domain.model.CoinDetail

fun CoinDetailDto.toCoinDetail(): CoinDetail {
    return CoinDetail(
        coinId = id,
        name = name,
        description = description,
        symbol = symbol,
        rank = rank,
        isActive = isActive,
        tags = tags.map { it.name },
        team = team
    )
}

fun CoinDto.toCoin(): Coin {
    return Coin(
        id = id,
        isActive = isActive,
        name = name,
        rank = rank,
        symbol = symbol
    )
}