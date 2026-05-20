package com.gillhad.domain.models


data class PokemonStatEntry(
    val baseStat: Int,
    val effort: Int,
    val stat: PokemonStat
)

data class PokemonStat(
    val name: String?,
    val url: String?
)
