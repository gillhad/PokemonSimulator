package com.gillhad.data

import kotlinx.serialization.json.Json
import retrofit2.Retrofit

private val json = Json { ignoreUnknownKeys = true }
object ApiService {
    const val BASE_URL = "https://pokeapi.co/api/v2/"
    private val retrofit = Retrofit.Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(json.asConverterFactory("application/json".toMediaType()))
        .build()
}