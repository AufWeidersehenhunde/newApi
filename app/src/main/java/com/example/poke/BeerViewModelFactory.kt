package com.example.poke

import android.arch.lifecycle.ViewModel
import android.arch.lifecycle.ViewModelProvider
@Suppress("UNCHECKED_CAST")
class BeerViewModelFactory (
    private val repository: BeerRepository

        ):ViewModelProvider.NewInstanceFactory(){
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return BeerViewModel2(repository) as T
    }

}