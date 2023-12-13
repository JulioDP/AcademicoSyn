package com.example.academicosync

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val iniciarSesion: Button = findViewById(R.id.btnIniciar)

        iniciarSesion.setOnClickListener {

            val intent = Intent(this, navegacion_principal::class.java)
            startActivity(intent)
        }
    }
}