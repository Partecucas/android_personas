package com.example.splash

import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.annotation.RequiresApi
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
import java.util.*

class actividad3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_actividad3)

        val btn1: Button =findViewById<Button>(R.id.btnactividad2)
        btn1.setOnClickListener {
            val intent: Intent = Intent(this,actividad2::class.java)
            startActivity(intent)
        }

        fun main() {
            val timer = Timer()

            val task = object : TimerTask() {
                @RequiresApi(Build.VERSION_CODES.O)
                override fun run() {
                    val currentDateTime = LocalDateTime.now()
                    val formattedDateTime = currentDateTime.format(DateTimeFormatter.ofPattern("HH:mm:ss"))
                    println("Hora actual: $formattedDateTime")
                }
            }

            timer.scheduleAtFixedRate(task, 0, 1000)
        }


    }

}