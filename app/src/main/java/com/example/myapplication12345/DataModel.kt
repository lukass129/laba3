package com.example.myapplication12345

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

open class DataModel: ViewModel() {
    val message:MutableLiveData<String> by lazy{
        MutableLiveData<String>()
    }
    val Messageforfrag1:MutableLiveData<String> by lazy{
        MutableLiveData<String>()
    }
    val Messageforfrag2:MutableLiveData<String> by lazy{
        MutableLiveData<String>()
    }
}