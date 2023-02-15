package com.example.depinjection.example2.di

import com.example.depinjection.example2.data.datasource.ExampleLocalDataSource
import com.example.depinjection.example2.data.datasource.ExampleLocalDataSourceImpl
import com.example.depinjection.example2.data.datasource.ExampleRemoteDataSource
import com.example.depinjection.example2.data.datasource.ExampleRemoteDataSourceImpl
import dagger.Binds
import dagger.Provides

@dagger.Module
interface DataModule {

    @Binds
    fun bindExampleLocalDataSource(impl: ExampleLocalDataSourceImpl): ExampleLocalDataSource

    @Binds
    fun bindRemoteLocalDataSource(impl: ExampleRemoteDataSourceImpl): ExampleRemoteDataSource
}