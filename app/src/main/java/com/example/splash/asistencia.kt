package com.example.splash

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import java.text.SimpleDateFormat
import java.util.*
import java.sql.Connection
import java.sql.DriverManager
import java.sql.SQLException
import java.sql.Statement

class asistencia : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_actividad4)
        //boton para ir al menu

        val btn1: Button =findViewById<Button>(R.id.btnactividad3)
        btn1.setOnClickListener {
            val intent: Intent = Intent(this,actividad2::class.java)
            startActivity(intent)
        }

        //Reloj
        val textView: TextView = findViewById<TextView>(R.id.texthora)
        val timer = Timer()
        val timerTask = object : TimerTask() {
             override fun run() {
                val currentTime = Calendar.getInstance().time
                val timeText = SimpleDateFormat("HH:mm:ss", Locale.getDefault()).format(currentTime)
                runOnUiThread {
                    textView.text = timeText
                }
            }
        }
        timer.schedule(timerTask, 0, 1000)
    }
}