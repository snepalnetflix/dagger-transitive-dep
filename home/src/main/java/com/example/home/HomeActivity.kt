package com.example.home

import android.content.Context
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.feature.SingletonFeatureObject
import javax.inject.Inject

class HomeActivity : AppCompatActivity() {
    @Inject
    lateinit var singletonFeatureObject: SingletonFeatureObject

    override fun onCreate(savedInstanceState: Bundle?) {
        val componentAccessor = applicationContext as ComponentAccessor
        val component = componentAccessor.getComponent()
        val injector = component as HomeInjector
        injector.inject(this)

        super.onCreate(savedInstanceState)
        setContentView(R.layout.home_activity)

        findViewById<Button>(R.id.start_button).setOnClickListener { onStartClicked() }
    }

    private fun onStartClicked() {
        singletonFeatureObject.print()
    }
}
