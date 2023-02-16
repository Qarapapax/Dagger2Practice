package com.example.depinjection.example2.di

import android.content.Context
import com.example.depinjection.example2.data.database.ExampleDatabase
import com.example.depinjection.example2.data.network.ExampleApiService
import com.example.depinjection.example2.presentation.ExampleViewModel
import com.example.depinjection.example2.presentation.MainActivity
import dagger.Binds
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [DataModule::class, DomainModule::class])
interface ApplicationComponent {

    fun getViewModel(): ExampleViewModel

    fun getDataBase(): ExampleDatabase

    fun getApiService(): ExampleApiService

    fun inject(activity: MainActivity)

    @Component.Factory
    interface ApplicationComponentFactory {
        fun create(
            @BindsInstance context: Context,
            @BindsInstance timeMillis: Long
        ): ApplicationComponent
    }
}