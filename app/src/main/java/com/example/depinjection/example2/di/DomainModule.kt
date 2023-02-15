package com.example.depinjection.example2.di

import com.example.depinjection.example2.data.datasource.ExampleLocalDataSource
import com.example.depinjection.example2.data.datasource.ExampleRemoteDataSource
import com.example.depinjection.example2.data.mapper.ExampleMapper
import com.example.depinjection.example2.data.repository.ExampleRepositoryImpl
import com.example.depinjection.example2.domain.ExampleRepository
import dagger.Binds
import dagger.Provides

@dagger.Module
interface DomainModule {

    @Binds
    fun bindRepository(impl: ExampleRepositoryImpl): ExampleRepository
}