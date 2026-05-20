package com.gillhad.domain.repositories

import com.gillhad.domain.models.Pokemon

interface PokemonRepository{
    suspend fun getPokemonList(): Result<List<Pokemon>>
}