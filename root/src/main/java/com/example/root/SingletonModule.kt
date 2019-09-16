package com.example.root

import android.content.Context
import dagger.Module
import dagger.Provides

@Module
class SingletonModule (private val context: Context) {
    @Provides
    fun provideContext(): Context {
        return context
    }
}