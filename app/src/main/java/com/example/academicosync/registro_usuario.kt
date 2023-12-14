package com.example.academicosync

import android.content.ContentValues.TAG
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.google.firebase.Firebase
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.auth

class registro_usuario : AppCompatActivity() {

    private lateinit var auth: FirebaseAuth;

    private lateinit var email: EditText
    private lateinit var password: EditText
    private lateinit var registro: Button
    private lateinit var regresar: Button



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registro_usuario)

        // Initialize Firebase Auth
        auth = Firebase.auth;

        // Inicializar las vistas después de inflar el diseño
        email = findViewById(R.id.nameUser)
        password = findViewById(R.id.contrase)
        registro = findViewById(R.id.btnIniciar)
        regresar = findViewById(R.id.btnRegresar)

        registro.setOnClickListener {
            auth.createUserWithEmailAndPassword(email.text.toString(), password.text.toString())
                .addOnCompleteListener(this) { task ->
                    if (task.isSuccessful) {
                        // Sign in success, update UI with the signed-in user's information
                        Log.d(TAG, "createUserWithEmail:success")
                        Toast.makeText(
                            baseContext,
                            "Registrado con exito.",
                            Toast.LENGTH_SHORT,
                        ).show()
                        val user = auth.currentUser
                        // updateUI(user)
                    } else {
                        // If sign in fails, display a message to the user.
                        Log.w(TAG, "createUserWithEmail:failure", task.exception)
                        Toast.makeText(
                            baseContext,
                            "Authentication failed.",
                            Toast.LENGTH_SHORT,
                        ).show()
                        //updateUI(null)
                    }
                }
        }

        regresar.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }






}