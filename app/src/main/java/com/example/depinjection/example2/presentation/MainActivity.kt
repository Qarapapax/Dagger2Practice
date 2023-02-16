package com.example.depinjection.example2.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.depinjection.R
import com.example.depinjection.example1.Activity
import com.example.depinjection.example2.ExampleApp
import com.example.depinjection.example2.data.database.ExampleDatabase
import com.example.depinjection.example2.data.network.ExampleApiService
import com.example.depinjection.example2.di.DaggerApplicationComponent
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    private val component by lazy {
        (application as ExampleApp).component
    }

    private val viewModel: ExampleViewModel by lazy {
        component.getViewModel()
    }

    private val database: ExampleDatabase by lazy {
        component.getDataBase()
    }

    private val apiService: ExampleApiService by lazy {
        component.getApiService()
    }


    override fun onCreate(savedInstanceState: Bundle?) {
//        component.inject(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val activity = Activity()
        Log.d("MainActivity", "${component.getViewModel()}")
        Log.d("MainActivity", "${component.getViewModel()}")
        Log.d("MainActivity", "${component.getDataBase()}")
        Log.d("MainActivity", "${component.getDataBase()}")
        Log.d("MainActivity", "${component.getApiService()}")
        Log.d("MainActivity", "${component.getApiService()}")
//        viewModel.method()

    }
}