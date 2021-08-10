package com.sofudev.viewmodelbasic

import androidx.lifecycle.ViewModel

class MainActivityViewModel(initialval : Int) :  ViewModel() {
    private var count = 0

    init {
        count = initialval
    }

    fun getCounter() : Int {
        return count
    }

    fun setCounter() {
        count++
    }
}