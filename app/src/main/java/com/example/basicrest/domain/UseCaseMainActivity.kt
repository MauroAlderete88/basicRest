package com.example.basicrest.domain

import com.example.basicrest.data.RepositoryImp
import com.example.basicrest.data.responseCommets

class UseCaseMainActivity () {

    val repositoryImp = RepositoryImp()

    suspend fun searchCommet () : responseCommets ?{
      return repositoryImp.getRandomCommets()
    }

}