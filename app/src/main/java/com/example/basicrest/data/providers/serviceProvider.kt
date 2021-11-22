package com.example.basicrest.data.providers

import com.example.basicrest.data.network.typicodeService
import com.example.basicrest.data.responseCommets
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create

class serviceProvider {

    suspend fun getCommets() : responseCommets? {
        return searchCommet()
    }

    private fun objectRetrofit () : Retrofit {
        return Retrofit.Builder().baseUrl( "https://jsonplaceholder.typicode.com/").
        addConverterFactory(GsonConverterFactory.create()).build()

    }

    private suspend fun searchCommet () : responseCommets?{
        val call = objectRetrofit().create(typicodeService::class.java).getCommets()
        var resultado : responseCommets? = call.body()
        return resultado
    }

}