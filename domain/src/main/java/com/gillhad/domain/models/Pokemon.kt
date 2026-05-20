package com.gillhad.domain.models

data class Pokemon(
    val id: Int,
    val name: String,
    val baseExp: Double,
    val isDefault: Boolean,
    val weight: Double,
    val cries: Cries,
    val types: List<PokemonTypeEntry>,
    val stats: List<PokemonStatEntry>,
    val sprites: Sprites,
    val moves: List<PokemonMoves>
)


data class Cries(
    val latest: String,
    val legacy: String
)


data class Sprites(
    val backDefault: String,
    val backFemale: String?,
    val backShiny: String?,
    val backShinyFemale: String?,
    val frontDefault: String,
    val frontDefaultFemale: String?,
    val frontShiny: String?,
    val frontShinyFemale: String?,
)
