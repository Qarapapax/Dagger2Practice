package com.example.depinjection.example2.data.datasource

import com.example.depinjection.example2.data.network.ExampleApiService

class ExampleRemoteDataSourceImpl(private val apiService: ExampleApiService): ExampleRemoteDataSource  {

    override fun method() {
        apiService.method()
    }
}