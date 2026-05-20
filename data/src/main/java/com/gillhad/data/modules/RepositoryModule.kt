package com.gillhad.data.modules

import com.gillhad.data.Impl.PokemonRepositoryImpl
import com.gillhad.domain.repositories.PokemonRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import javax.inject.Singleton

@Module
@InstallIn(Singleton::class)
abstract class RepositoryModule{

    @Binds
    @Singleton
    abstract fun bindPokemonRepository(
        impl: PokemonRepositoryImpl
    ): PokemonRepository
}