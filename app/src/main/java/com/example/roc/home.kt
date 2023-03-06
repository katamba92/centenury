package com.example.roc

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class home : AppCompatActivity() {
    private val SPLASH_TIME_OUT =4000L
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        Handler().postDelayed({
            val i= Intent(this,MainActivity::class.java)
            startActivity(i)
            finish()
        },SPLASH_TIME_OUT)
    }
}