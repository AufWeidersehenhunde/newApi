package com.example.poke

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class BeerViewModel2 (
    //private val repository: BeerRepository
        ): ViewModel() {
    private val _beers = MutableLiveData<List<Beer>>()
    val beers : LiveData<List<Beer>>
    get()= _beers
    suspend fun getBeers()
    {
        val beers = repository.getBeers()
        _beers.value = beers
    }

}