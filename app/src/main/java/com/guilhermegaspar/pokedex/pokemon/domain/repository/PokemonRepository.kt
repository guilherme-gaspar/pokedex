package com.guilhermegaspar.pokedex.pokemon.domain.repository

import android.util.Log
import com.guilhermegaspar.pokedex.pokemon.data.remote.service.PokemonService
import com.guilhermegaspar.pokedex.pokemon.domain.PokemonModel

interface PokemonRepository {
    suspend fun getPokemons(offset: Int, limit: Int): List<PokemonModel>
}

class PokemonRepositoryImpl(private val pokemonService: PokemonService) : PokemonRepository {
    override suspend fun getPokemons(offset: Int, limit: Int): List<PokemonModel> {
        val results = pokemonService.getPokemons(offset, limit).results
        Log.i("HTTPTEST", "Results: $results")
        return results
    }
}