package com.example.assignmentcal

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {

    private val _mainViewStateLiveData = MutableLiveData("")
    val mainViewStateLiveData: LiveData<String> = _mainViewStateLiveData


    fun plusLiveData(number1 : String, number2 : String){

       _mainViewStateLiveData.value = (number1.toDouble() + number2.toDouble()).toString()

    }

    fun minusLiveData(number1 : String, number2 : String){
        _mainViewStateLiveData.value = (number1.toDouble() - number2.toDouble()).toString()

    }

    fun multiplyLiveData(number1 : String, number2 : String){
        _mainViewStateLiveData.value = (number1.toDouble() * number2.toDouble()).toString()

    }

    fun divideLiveData(number1 : String, number2 : String){
        _mainViewStateLiveData.value = (number1.toDouble() / number2.toDouble()).toString()

    }

}