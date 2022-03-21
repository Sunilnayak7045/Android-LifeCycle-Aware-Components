package com.example.lifecycleawarecomponent

import android.arch.lifecycle.Lifecycle
import android.arch.lifecycle.LifecycleObserver
import android.arch.lifecycle.OnLifecycleEvent
import android.util.Log

class Observer: LifecycleObserver {

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    fun onCreate(){
        Log.d("Main","Observer On-Create")

    }
    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    fun ONPAUSE(){
        Log.d("Main","Observer ON-PAUSE")

    }
    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    fun ONRESUME(){
        Log.d("Main","Observer ON-RESUME")

    }
    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    fun ONDESTROY(){
        Log.d("Main","Observer ON-DESTROY")

    }
    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    fun ONSTOP(){
        Log.d("Main","Observer  ON-STOP")

    }
}