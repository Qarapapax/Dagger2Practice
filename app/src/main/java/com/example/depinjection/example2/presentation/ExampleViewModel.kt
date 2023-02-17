package com.example.depinjection.example2.presentation

import android.util.Log
import androidx.lifecycle.ViewModel
import com.example.depinjection.example2.di.IdQualifier
import com.example.depinjection.example2.di.NameQualifier
import com.example.depinjection.example2.di.ProdQualifier
import com.example.depinjection.example2.di.TestQualifier
import com.example.depinjection.example2.domain.ExampleUseCase
import javax.inject.Inject

class ExampleViewModel @Inject constructor(
    private val useCase: ExampleUseCase,
    @IdQualifier private val id: String,
    @NameQualifier private val name: String
) : ViewModel() {

    fun method() {
        useCase()
        Log.d("ExampleViewModel", "$this $id $name")
    }

}