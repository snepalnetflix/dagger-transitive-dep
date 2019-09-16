package com.example.root

import com.example.home.HomeActivity
import com.example.home.HomeInjector
import dagger.Component

@Component(modules = [SingletonModule::class])
interface SingletonComponent: HomeInjector {
}