package com.example.proyectomc_dispmov

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_olvdiarcontrasena2.*

class Olvdiarcontrasena2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_olvdiarcontrasena2)

        ok.setOnClickListener {
            val intent = Intent(this, Autentificacion::class.java)
            startActivity(intent)
            finish()
        }
    }
}