package com.gillhad.data.models

import kotlinx.serialization.Serializable

@Serializable
data class PokemonTypeEntryDTO(
    val slot: Int,
    val type: PokemonTypeDTO
)

@Serializable
data class PokemonTypeDTO(
    val name: String,
    val url: String
)
