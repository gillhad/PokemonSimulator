package com.gillhad.data.mappers

import com.gillhad.data.models.CriesDTO
import com.gillhad.data.models.MoveDTO
import com.gillhad.data.models.PokemonDTO
import com.gillhad.data.models.PokemonStatDTO
import com.gillhad.data.models.PokemonStatEntryDTO
import com.gillhad.data.models.PokemonTypeDTO
import com.gillhad.data.models.PokemonTypeEntryDTO
import com.gillhad.data.models.SpritesDTO
import com.gillhad.domain.models.Cries
import com.gillhad.domain.models.Pokemon
import com.gillhad.domain.models.PokemonMoves
import com.gillhad.domain.models.PokemonStat
import com.gillhad.domain.models.PokemonStatEntry
import com.gillhad.domain.models.PokemonType
import com.gillhad.domain.models.PokemonTypeEntry
import com.gillhad.domain.models.Sprites

fun List<PokemonDTO>.toDomain(): List<Pokemon>{
    return this.map { it.toDomain() }
}

fun PokemonDTO.toDomain(): Pokemon {
    return Pokemon(
        id = this.id,
        name = this.name,
        baseExp = this.baseExp,
        isDefault = this.isDefault,
        weight = this.weight,
        cries = this.cries.toDomain(),
        types = this.types.toDomain(),
        stats = this.stats.toDomain(),
        sprites = this.sprites.toDomain(),
        moves = this.moves.toDomain()
    )
}

fun CriesDTO.toDomain(): Cries {
    return Cries(
        latest = this.latest,
        legacy = this.legacy
    )
}

fun List<PokemonTypeEntryDTO>.toDomain(): List<PokemonTypeEntry>{
   return this.map { it.toDomain() }
}

fun PokemonTypeEntryDTO.toDomain(): PokemonTypeEntry {
    return PokemonTypeEntry(
        slot = this.slot,
        type = this.type.toDomain()
    )
}

fun PokemonTypeDTO.toDomain(): PokemonType {
    return PokemonType(
        name = this.name,
        url = this.url
    )
}

fun List<PokemonStatEntryDTO>.toDomain(): List<PokemonStatEntry>{
    return this.map { it.toDomain() }
}

fun PokemonStatEntryDTO.toDomain(): PokemonStatEntry {
    return PokemonStatEntry(
        baseStat = this.baseStat,
        effort = this.effort,
        stat = this.stat.toDomain()
    )
}

fun PokemonStatDTO.toDomain(): PokemonStat {
    return PokemonStat(
        name = this.name,
        url = this.url
    )
}

fun SpritesDTO.toDomain(): Sprites {
    return Sprites(
        backDefault = this.backDefault,
        backFemale = this.backFemale,
        backShiny = this.backShiny,
        backShinyFemale = this.backShinyFemale,
        frontDefault = this.frontDefault,
        frontDefaultFemale = this.frontDefaultFemale,
        frontShiny = this.frontShiny,
        frontShinyFemale = this.frontShinyFemale
    )
}

fun List<MoveDTO>.toDomain(): List<PokemonMoves>{
    return this.map { it.toDomain() }
}

fun MoveDTO.toDomain(): PokemonMoves {
    return PokemonMoves(
        name = this.name,
        url = this.url
    )
}