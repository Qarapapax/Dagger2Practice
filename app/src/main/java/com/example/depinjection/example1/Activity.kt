package com.example.depinjection.example1

import kotlinx.coroutines.Job

class Activity {

    val monitor = Monitor()
    val keyboard = Keyboard()
    val mouse = Mouse()
    val computerTower = ComputerTower(
        Storage(),
        Memory(),
        Processor()
    )

    val computer = Computer(monitor, computerTower, keyboard, mouse)
}