package com.sofudev.viewmodelbasic

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import java.lang.IllegalArgumentException

@Suppress("UNCHECKED_CAST")
class ExerciseActivityViewModelFactory(private val initialVal : Int) : ViewModelProvider.Factory {

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(ExerciseActivityViewModel::class.java)) {
            return ExerciseActivityViewModel(initialVal) as T
        }

        throw IllegalArgumentException("View Model tidak ditemukan")
    }
}