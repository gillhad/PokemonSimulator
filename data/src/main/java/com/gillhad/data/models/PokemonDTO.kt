package com.gillhad.data.models

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class PokemonDTO(
    val id: Int,
    val name: String,
    @SerialName("base_experience")
    val baseExp: Double,
    @SerialName("is_default")
    val isDefault: Boolean,
    val weight: Double,
    val cries: CriesDTO,
    val types: List<PokemonTypeEntryDTO>,
    val stats: List<PokemonStatEntryDTO>,
    val sprites: SpritesDTO,
    val moves: List<MoveDTO>
)


@Serializable
data class CriesDTO(
    val latest: String,
    val legacy: String
)


@Serializable
data class SpritesDTO(
    @SerialName("back_default")
    val backDefault: String,
    @SerialName("back_female")
    val backFemale: String?,
    @SerialName("back_shiny")
    val backShiny: String?,
    @SerialName("back_shiny_female")
    val backShinyFemale: String?,
    @SerialName("front_default")
    val frontDefault: String,
    @SerialName("front_default_female")
    val frontDefaultFemale: String?,
    @SerialName("front_shiny")
    val frontShiny: String?,
    @SerialName("front_shiny_female")
    val frontShinyFemale: String?,
)

