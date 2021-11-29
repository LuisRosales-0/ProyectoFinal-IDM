package com.example.proyectomc_dispmov

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class Inicio : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_inicio)

        val imagenclick1 = findViewById<ImageView>(R.id.armaa)
        imagenclick1.setOnClickListener {
            val intent = Intent(this, Armapc::class.java)
            startActivity(intent)
        }
        val imagenclick2 = findViewById<ImageView>(R.id.guardado)
        imagenclick2.setOnClickListener {
            val intent = Intent(this, Guardado::class.java)
            startActivity(intent)
        }
        val imagenclick3 = findViewById<ImageView>(R.id.agrega1)
        imagenclick3.setOnClickListener {
            val intent = Intent(this, Agrega0::class.java)
            startActivity(intent)
        }
        val imagenclick4 = findViewById<ImageView>(R.id.agrega2)
        imagenclick4.setOnClickListener {
            val intent = Intent(this, Agrega0::class.java)
            startActivity(intent)
        }
        val imagenclick5 = findViewById<ImageView>(R.id.noticias)
        imagenclick5.setOnClickListener {
            val intent = Intent(this, Noticias::class.java)
            startActivity(intent)
        }
        val imagenclick6 = findViewById<ImageView>(R.id.sugerencias)
        imagenclick6.setOnClickListener {
            val intent = Intent(this, Sugerencias1::class.java)
            startActivity(intent)
        }
        val imagenclick7 = findViewById<ImageView>(R.id.configuracion)
        imagenclick7.setOnClickListener {
            val intent = Intent(this, Configuracion::class.java)
            startActivity(intent)
        }
        val imagenclick8 = findViewById<ImageView>(R.id.sobree)
        imagenclick8.setOnClickListener {
            val intent = Intent(this, Acercade::class.java)
            startActivity(intent)
        }
        val imagenclick9 = findViewById<ImageView>(R.id.atribucion)
        imagenclick9.setOnClickListener {
            val intent = Intent(this, Atribuciones::class.java)
            startActivity(intent)
        }


    }
}