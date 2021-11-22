package com.example.basicrest.data

interface repository {

    suspend fun getRandomCommets(): responseCommets

}