package com.gillhad.data.models

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class PokemonStatEntryDTO(
    @SerialName("base_stat")
    val baseStat: Int,
    val effort: Int,
    val stat: PokemonStatDTO
)

@Serializable
data class PokemonStatDTO(
    val name: String,
    val url: String
)
