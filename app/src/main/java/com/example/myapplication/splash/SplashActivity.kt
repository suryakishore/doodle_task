package com.example.myapplication.splash

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.example.myapplication.MainActivity
import com.example.myapplication.R

/**
 * Splash activity it will show only three seconds
 */
class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        initializeViews()
    }

    /**
     * this method is used to put the delay for 3 seconds after we will open the main activity.
     */
    private fun initializeViews() {
        Handler().postDelayed({
            /* Create an Intent that will start the Main-Activity. */
            val mainIntent = Intent(this, MainActivity::class.java)
            startActivity(mainIntent)
            finish()
        }, 3000)
    }
}
