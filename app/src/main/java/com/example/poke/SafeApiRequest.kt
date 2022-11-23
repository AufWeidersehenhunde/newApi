package com.example.poke

import retrofit2.Response
import java.io.IOException

open class SafeApiRequest {

    suspend fun <T:Any> apiRequest(call:suspend () -> Response<T>):T {
        val response = call.invoke()
        if (response.isSuccessful) {
            return response.body()!!
        } else
        //exception
            throw ApiException(response.code().toString())
    }
    }


    class ApiException(message:String):IOException(message)

