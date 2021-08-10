package com.sofudev.viewmodelbasic

import androidx.lifecycle.ViewModel

class ExerciseActivityViewModel(initialVal : Int) : ViewModel() {
    private var result = 0

    init {
        result = initialVal
    }

    fun getResult() : Int {
        return result
    }

    fun setResult(input: Int) {
        result += input
    }
}