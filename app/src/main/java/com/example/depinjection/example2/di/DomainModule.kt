package com.example.depinjection.example2.di

import com.example.depinjection.example2.data.repository.ExampleRepositoryImpl
import com.example.depinjection.example2.domain.ExampleRepository
import dagger.Binds

@dagger.Module
interface DomainModule {

    @Binds
    fun bindRepository(impl: ExampleRepositoryImpl): ExampleRepository
}