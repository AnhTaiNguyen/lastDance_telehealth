package com.works.lastdance.introduction

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.works.lastdance.MainActivity
import com.works.lastdance.R
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

@SuppressLint("CustomSplashScreen")
class Splashscreen : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splashscreen)

        supportActionBar?.hide()

        // Using coroutines to introduce a delay before moving to MainActivity
        CoroutineScope(Dispatchers.Main).launch {
            delay(2000L) // Adjust the delay duration as needed
            navigateToMainActivity()
        }
    }

    private fun navigateToMainActivity() {
        val mainIntent = Intent(this@Splashscreen, MainActivity::class.java)
        startActivity(mainIntent)
        finish()
    }
}
