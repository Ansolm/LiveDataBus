package com.ansolm.livedatabus.example

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import com.ansolm.livedatabus.LiveDataBus
import com.ansolm.livedatabus.annotation.*

@UseLiveDataBus
class MainKtActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val tvCenter: TextView = findViewById(R.id.tvCenter)
        LiveDataBus.post("IMG form LiveDataBus")
//        LiveDataBus.post("dzq", "IMG form STR")
//        LiveDataBus.post("dzq", "IMG form -------------")
        tvCenter.postDelayed({
            LiveDataBus.post("dzq", "IMG form ============")
        }, 2000)
    }

    @Observe(dispatcher = Dispatcher.Background)
    fun live(name: String) {
        Log.v("dzq", "live:${name}")
    }

    @ObserveSticky
    fun liveSticky(name: String) {
        Log.v("dzq", "liveSticky:${name}")
    }

    @ObserveForever
    fun liveForever(name: String) {
        Log.v("dzq", "liveForever:${name}")
    }

    @ObserveForeverSticky
    fun liveForeverSticky(name: String) {
        Log.v("dzq", "liveForeverSticky:${name}")
    }

    @Observe("dzq")
    fun liveStr(name: String) {
        Log.v("dzq", "liveStr:${name}")
    }

    @ObserveSticky("dzq")
    fun liveStrSticky(name: String) {
        Log.v("dzq", "liveStrSticky:${name}")
    }

    @ObserveForever("dzq", dispatcher = Dispatcher.Background)
    fun liveStrForever(name: String) {
        Log.v("dzq", "liveStrForever:${name}")
    }


    @ObserveForeverSticky("dzq")
    fun liveStrForeverSticky(name: String) {
        Log.v("dzq", "liveStrForeverSticky:${name}")
    }
}