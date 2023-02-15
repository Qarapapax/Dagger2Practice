package com.example.depinjection.example1

import kotlinx.coroutines.Job

class Activity {

    lateinit var computer: Computer
    lateinit var keyboard: Keyboard

    init {
        Component().inject(this)
    }


}