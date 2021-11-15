package com.utsman.mvvmbinar

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {
    private val repository: MainRepository = MainRepositoryImpl()
    val resultLiveData: LiveData<Int> = repository.resultLiveData

    fun plus() {
        repository.plus()
    }
    fun min() {
        repository.min()
    }
}