package com.garonebewealthy.app

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

@SuppressLint("CustomSplashScreen")
class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Thread{
            Thread.sleep(2000)
            runOnUiThread {
                startActivity(Intent(this,MainScreenGarone::class.java))
            }
        }.start()
    }
}