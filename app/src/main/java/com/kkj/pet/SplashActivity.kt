package com.kkj.pet

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

class SplashActivity : AppCompatActivity() {

    private val mHandler = Handler(Looper.getMainLooper())

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.v("Activity", "Start Splash Activity")

        mHandler.postDelayed({
            startActivity(Intent(this@SplashActivity, MainActivity::class.java))
            Log.v("Activity", "Finish Splash Activity")
            finish()
        }, 1500)
    }
}