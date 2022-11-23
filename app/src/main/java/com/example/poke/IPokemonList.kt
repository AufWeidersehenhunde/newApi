package com.example.poke

import android.database.Observable
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

interface IBeerList {
    @GET("beers")
    suspend fun getIBeerList():Response<List<Beer>>


    companion object{
        operator fun invoke(): IBeerList {
             Retrofit.Builder()
                    .baseUrl("https://api.punkapi.com/v2/")
                    .addConverterFactory(GsonConverterFactory.create())
                    .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                    .build()
                 .create(BeerFragment::class.java)
                return IBeerList()
            }
        }
    }
