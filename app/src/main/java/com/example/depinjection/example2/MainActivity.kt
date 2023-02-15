package com.example.depinjection.example2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.depinjection.R
import com.example.depinjection.example1.Activity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val activity = Activity()
        activity.computer.toString()
    }
}