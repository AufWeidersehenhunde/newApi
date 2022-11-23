package com.example.poke

class BeerRepository (
    private val api:IBeerList
        ) :SafeApiRequest()
{
suspend fun getBeers() = apiRequest { api.getIBeerList() }
}