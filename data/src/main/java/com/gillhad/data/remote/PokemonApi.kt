package com.gillhad.data.remote

import com.gillhad.data.models.PokemonDTO
import retrofit2.http.GET

interface PokemonApi {

@GET("pokemon")
suspend fun getPokemon():List<PokemonDTO>
}