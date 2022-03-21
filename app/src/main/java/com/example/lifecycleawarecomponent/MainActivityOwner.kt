package com.example.lifecycleawarecomponent

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivityOwner : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        lifecycle.addObserver(Observer())

        Log.d("Main","Activity On-Create")
    }


    override fun onPause() {
        super.onPause()
        Log.d("Main","Activity ON-PAUSE")
    }

    override fun onResume() {
        super.onResume()
        Log.d("Main","Activity ON-RESUME")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("Main","Activity ON-DESTROY")
    }

    override fun onStop() {
        super.onStop()
        Log.d("Main","Activity  ON-STOP")
    }






}