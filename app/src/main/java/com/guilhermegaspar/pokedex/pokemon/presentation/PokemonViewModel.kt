package com.guilhermegaspar.pokedex.pokemon.presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.guilhermegaspar.pokedex.pokemon.domain.PokemonModel
import com.guilhermegaspar.pokedex.pokemon.domain.repository.PokemonRepository
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

class PokemonViewModel(private val pokemonRepository: PokemonRepository) : ViewModel() {

    private val _uiState = MutableStateFlow<List<PokemonModel>>(emptyList())
    val uiState: StateFlow<List<PokemonModel>> = _uiState

    init {
        viewModelScope.launch {
            val result = pokemonRepository.getPokemons(0, 151)
            _uiState.value = result
        }
    }
}