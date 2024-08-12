package com.guilhermegaspar.pokedex.pokemon.data.remote.response

import com.google.gson.annotations.SerializedName
import com.guilhermegaspar.pokedex.pokemon.domain.PokemonModel

data class PokemonResponse(
    @SerializedName("count")
    val count: Int,
    @SerializedName("results")
    val results: List<PokemonModel>
)
