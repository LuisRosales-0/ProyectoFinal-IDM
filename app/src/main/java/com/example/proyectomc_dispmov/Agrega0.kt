package com.example.proyectomc_dispmov

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import kotlinx.android.synthetic.main.activity_agrega0.*

class Agrega0 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_agrega0)
        supportActionBar?.hide()

        val imagenclick1 = findViewById<ImageView>(R.id.back)
        imagenclick1.setOnClickListener {
            val intent = Intent(this, Agrega::class.java)
            startActivity(intent)
        }

        agr1.setOnClickListener {
            val intent = Intent(this, Agrega::class.java)
            startActivity(intent)
        }

        agr2.setOnClickListener {
            val intent = Intent(this, Agrega::class.java)
            startActivity(intent)
        }

        agr3.setOnClickListener {
            val intent = Intent(this, Agrega::class.java)
            startActivity(intent)
        }

    }
}