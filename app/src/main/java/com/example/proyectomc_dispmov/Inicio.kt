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
        val imagenclick2 = findViewById<ImageView>(R.id.agrega1)
        imagenclick2.setOnClickListener {
            val intent = Intent(this, Agrega0::class.java)
            startActivity(intent)
        }
        val imagenclick3 = findViewById<ImageView>(R.id.agrega2)
        imagenclick3.setOnClickListener {
            val intent = Intent(this, Agrega0::class.java)
            startActivity(intent)
        }





    }
}