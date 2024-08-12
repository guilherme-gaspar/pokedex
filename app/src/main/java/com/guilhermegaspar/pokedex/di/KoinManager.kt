package com.guilhermegaspar.pokedex.di

import com.guilhermegaspar.pokedex.network.networkModule
import com.guilhermegaspar.pokedex.pokemon.domain.repository.PokemonRepositoryImpl
import com.guilhermegaspar.pokedex.pokemon.presentation.PokemonViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.core.module.Module
import org.koin.dsl.module

object KoinManager {
    fun loadAllModules(): List<Module> {
        return listOf(
            networkModule, getMovieModule()
        )
    }
}

fun getMovieModule() = module {
    viewModel {
        PokemonViewModel(pokemonRepository = PokemonRepositoryImpl(get()) )
    }
}
