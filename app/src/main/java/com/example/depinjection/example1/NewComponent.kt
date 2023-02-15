package com.example.depinjection.example1

@dagger.Component
interface NewComponent {

   fun inject(activity: Activity)

}