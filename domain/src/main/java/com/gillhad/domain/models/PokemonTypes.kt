package com.gillhad.domain.models

data class PokemonTypeEntry(
    val slot: Int = 0,
    val type: PokemonType
)


data class PokemonType(
    val name: String?,
    val url: String?
)
