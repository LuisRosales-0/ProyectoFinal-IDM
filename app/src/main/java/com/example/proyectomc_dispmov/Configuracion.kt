package com.example.proyectomc_dispmov

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_configuracion.*

class Configuracion : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_configuracion)
        ayuda.setOnClickListener {
            val intent: Intent = Intent(this, Ayuda::class.java)
            startActivity(intent)
        }
        Sugerencias.setOnClickListener {
            val intent: Intent = Intent(this, Sugerencias1::class.java)
            startActivity(intent)
        }
    }
}