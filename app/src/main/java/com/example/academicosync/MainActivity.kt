package com.example.academicosync

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val iniciarSesion: Button = findViewById(R.id.btnIniciar)
        val registro: TextView = findViewById(R.id.crearCuenta)

        iniciarSesion.setOnClickListener {

            val intent = Intent(this, navegacion_principal::class.java)
            startActivity(intent)
        }

        registro.setOnClickListener {
            val intent = Intent(this, registro_usuario::class.java)
            startActivity(intent)
        }
    }
}