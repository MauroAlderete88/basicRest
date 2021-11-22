package com.example.basicrest.data

import com.example.basicrest.data.providers.serviceProvider

class RepositoryImp : repository {

    private val serviceProvider = serviceProvider()

    override suspend fun getRandomCommets(): responseCommets {
        return serviceProvider.getCommets()?:
        responseCommets("-","-","-","-","-")
    }

}