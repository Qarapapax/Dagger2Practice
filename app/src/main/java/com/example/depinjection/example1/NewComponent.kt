package com.example.depinjection.example1

@dagger.Component(modules = [ComputerModule::class])
interface NewComponent {
    fun inject(activity: Activity)

}