package com.example.depinjection.example2.presentation

import android.util.Log
import androidx.lifecycle.ViewModel
import com.example.depinjection.example2.di.ApplicationScope
import com.example.depinjection.example2.domain.ExampleRepository
import com.example.depinjection.example2.domain.ExampleUseCase
import javax.inject.Inject
import javax.inject.Singleton

class ExampleViewModel2 @Inject constructor(private val repository: ExampleRepository) :
    ViewModel() {

    fun method() {
        repository.method()
        Log.d("ExampleViewModel", "$this")
    }

}