package com.example.tourpic.view.ui.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.example.tourpic.R

class LoginActivity : AppCompatActivity() {

    lateinit var btnIngresar: Button
    lateinit var btnRegistrar: Button
    lateinit var btnRecuperar: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        btnIngresar = findViewById(R.id.btnIngresar)
        btnRegistrar = findViewById(R.id.btnRegistrar)
        btnRecuperar = findViewById(R.id.btnRecuperar)

        btnIngresar.setOnClickListener {
            startActivity(Intent(this, HomeActivity::class.java))
        }

        btnRegistrar.setOnClickListener {
            startActivity(Intent(this, RegistroActivity::class.java))
        }

        btnRecuperar.setOnClickListener {
            startActivity(Intent(this, RecuperarContrasenaActivity::class.java))
        }
    }
}