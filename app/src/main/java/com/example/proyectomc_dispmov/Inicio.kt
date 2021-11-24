package com.example.proyectomc_dispmov

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_inicio.*

class Inicio : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_inicio)

        Opcion1.setOnClickListener {
            val intent:Intent = Intent(this, Seleccion2::class.java)
            startActivity(intent)
        }
        Opcion2.setOnClickListener {
            val intent:Intent = Intent(this, Seleccion1::class.java)
            startActivity(intent)
        }
        config.setOnClickListener {
            val intent:Intent = Intent(this, Configuracion::class.java)
            startActivity(intent)
        }
    }
}