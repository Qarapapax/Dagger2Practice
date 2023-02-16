package com.example.depinjection.example2.di

import com.example.depinjection.example2.data.datasource.ExampleLocalDataSource
import com.example.depinjection.example2.data.datasource.ExampleLocalDataSourceImpl
import com.example.depinjection.example2.data.datasource.ExampleRemoteDataSource
import com.example.depinjection.example2.data.datasource.ExampleRemoteDataSourceImpl
import dagger.Binds
import dagger.Provides

@dagger.Module
interface DataModule {
    @ApplicationScope
    @Binds
    fun bindExampleLocalDataSource(impl: ExampleLocalDataSourceImpl): ExampleLocalDataSource

    @ApplicationScope
    @Binds
    fun bindRemoteLocalDataSource(impl: ExampleRemoteDataSourceImpl): ExampleRemoteDataSource
}