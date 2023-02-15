package com.example.depinjection.example2.data.repository

import com.example.depinjection.example2.data.datasource.ExampleLocalDataSource
import com.example.depinjection.example2.data.datasource.ExampleRemoteDataSource
import com.example.depinjection.example2.data.mapper.ExampleMapper
import com.example.depinjection.example2.domain.ExampleRepository
import javax.inject.Inject

class ExampleRepositoryImpl @Inject constructor(
    private val localDataSource: ExampleLocalDataSource,
    private val remoteDataSource: ExampleRemoteDataSource,
    private val mapper: ExampleMapper
) : ExampleRepository {
    override fun method() {
        localDataSource.method()
        remoteDataSource.method()
        mapper.map()
    }

}