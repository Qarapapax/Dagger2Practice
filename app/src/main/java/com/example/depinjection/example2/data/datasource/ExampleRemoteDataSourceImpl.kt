package com.example.depinjection.example2.data.datasource

import com.example.depinjection.example2.data.network.ExampleApiService
import javax.inject.Inject

class ExampleRemoteDataSourceImpl @Inject constructor(private val apiService: ExampleApiService) :
    ExampleRemoteDataSource {

    override fun method() {
        apiService.method()
    }
}