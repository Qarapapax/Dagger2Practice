package com.example.depinjection.example2.presentation

import com.example.depinjection.example2.di.ApplicationScope
import com.example.depinjection.example2.domain.ExampleUseCase
import javax.inject.Inject
import javax.inject.Singleton

@ApplicationScope
class ExampleViewModel @Inject constructor(private val useCase: ExampleUseCase) {

    fun method() {
        useCase()
    }

}