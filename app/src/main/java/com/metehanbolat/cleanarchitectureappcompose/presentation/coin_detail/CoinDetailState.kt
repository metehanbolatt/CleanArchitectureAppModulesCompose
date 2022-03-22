package com.metehanbolat.cleanarchitectureappcompose.presentation.coin_detail

import com.metehanbolat.data.remote.model.CoinDetail

data class CoinDetailState(
    val isLoading: Boolean = false,
    val coin: CoinDetail? = null,
    val error: String = ""
)
