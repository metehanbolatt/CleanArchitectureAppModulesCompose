package com.metehanbolat.cleanarchitectureappcompose.presentation.coin_list

import com.metehanbolat.data.remote.model.Coin

data class CoinListState(
    val isLoading: Boolean = false,
    val coins: List<Coin> = emptyList(),
    val error: String = ""
)
