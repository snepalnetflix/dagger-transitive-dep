package com.example.feature

import android.content.Context
import javax.inject.Inject

class SingletonFeatureObject @Inject constructor(private val context: Context) {
    fun print() {
        android.util.Log.i("dagger", "SingletonFeatureObject.print, context: $context")
    }
}
