package com.gillhad.data.Impl

import android.util.Log
import com.gillhad.data.mappers.toAppError
import com.gillhad.data.mappers.toDomain
import com.gillhad.data.remote.PokemonApi
import com.gillhad.domain.models.Pokemon
import com.gillhad.domain.repositories.PokemonRepository
import javax.inject.Inject
import kotlin.coroutines.cancellation.CancellationException

class PokemonRepositoryImpl @Inject constructor(
    private val api: PokemonApi
): PokemonRepository{

    override suspend fun getPokemonList(): Result<List<Pokemon>> {
        return try {
            val response = api.getPokemon()
            Result.success(response.toDomain())
        } catch (e: Exception){
            if (e is CancellationException) throw e
            e.message?.let { Log.d("data",it) }
            Result.failure(e.toAppError())
        }
    }
}