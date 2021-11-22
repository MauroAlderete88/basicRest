package com.example.basicrest.ui

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.basicrest.data.responseCommets
import com.example.basicrest.domain.UseCaseMainActivity
import kotlinx.coroutines.launch

class MainActivityViewModel : ViewModel() {

    private val useCase = UseCaseMainActivity()

    val resultResponse = MutableLiveData<responseCommets>()

    fun search(){
        viewModelScope.launch {
           resultResponse.postValue(useCase.searchCommet())
        }
    }

}