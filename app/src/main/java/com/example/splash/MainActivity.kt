package com.example.splash

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.util.Log
import android.widget.Button
import java.security.Principal

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        starTime()
    }
        fun starTime() {
            object : CountDownTimer(3000, 1000) {
                override fun onTick(p0: Long) {

                }

                override fun onFinish() {
                 val intent=Intent(applicationContext, actividad2::class.java).apply {}
                    startActivity(intent)
                }

            }.start()
        }
    }

