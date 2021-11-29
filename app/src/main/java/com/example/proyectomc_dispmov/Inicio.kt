package com.example.proyectomc_dispmov

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class Inicio : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_inicio)

        val imagenclick = findViewById<ImageView>(R.id.armaa)
        imagenclick.setOnClickListener {
            val intent = Intent(this, Armapc::class.java)
            startActivity(intent)
        }



    }
}