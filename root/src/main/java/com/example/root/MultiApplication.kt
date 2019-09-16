package com.example.root

import android.app.Application
import com.example.home.ComponentAccessor

class MultiApplication : Application(), ComponentAccessor {
    private lateinit var component: SingletonComponent

    @Override
    override fun onCreate() {
        val module = SingletonModule(this)
        component = DaggerSingletonComponent.builder().singletonModule(module).build()

        super.onCreate()
    }

    override fun getComponent(): Any {
        return component
    }
}
