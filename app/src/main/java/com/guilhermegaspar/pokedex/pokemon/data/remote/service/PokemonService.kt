package com.guilhermegaspar.pokedex.pokemon.data.remote.service

import com.guilhermegaspar.pokedex.pokemon.data.remote.response.PokemonResponse
import retrofit2.http.GET
import retrofit2.http.Query

interface PokemonService {
    @GET("pokemon")
    suspend fun getPokemons(@Query("offset") offset: Int, @Query("limit") limit: Int): PokemonResponse
}