package com.utsman.mvvmbinar

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData

interface MainRepository {
    val resultLiveData: LiveData<Int>
    fun plus()
    fun min()
}

class MainRepositoryImpl : MainRepository {
    private val _resultLiveData: MutableLiveData<Int> = MutableLiveData(0)

    override val resultLiveData: LiveData<Int>
        get() = _resultLiveData

    override fun plus() {
        val result = _resultLiveData.value ?: 0
        val newResult = result + 1
        _resultLiveData.postValue(newResult)
    }

    override fun min() {
        val result = _resultLiveData.value ?: 0
        val newResult = result - 1
        _resultLiveData.postValue(newResult)
    }
}