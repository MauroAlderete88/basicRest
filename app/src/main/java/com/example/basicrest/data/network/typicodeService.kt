package com.example.basicrest.data.network

import com.example.basicrest.data.responseCommets
import retrofit2.Response
import retrofit2.http.GET

interface typicodeService {
    @GET("commets")
    suspend fun getCommets():Response<responseCommets>
}