package com.example.poke

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.lifecycle.ViewModel
import androidx.lifecycle.get

class BeerFragment : Fragment() {


    private lateinit var factory: BeerViewModelFactory
    private val viewModel: BeerViewModel2 by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_beer, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        val api = IBeerList()
        val repository = BeerRepository(api)
        factory = BeerViewModelFactory(repository)
        viewModel = ViewModelProvider.(this).get(BeerViewModel2::class.java)
    }

}