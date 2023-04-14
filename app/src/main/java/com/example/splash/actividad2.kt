package com.example.splash

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class actividad2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_actividad2)

        val btn1: Button =findViewById<Button>(R.id.btnactividad4)
        btn1.setOnClickListener {
            val intent: Intent = Intent(this,asistencia::class.java)
            startActivity(intent)
        }
        val btn2: Button =findViewById<Button>(R.id.btnactividad5)
        btn2.setOnClickListener {
            val intent: Intent = Intent(this,actividad5::class.java)
            startActivity(intent)
        }
    }
}