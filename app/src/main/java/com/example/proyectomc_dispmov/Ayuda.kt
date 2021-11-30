package com.example.proyectomc_dispmov

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_ayuda.*
import kotlinx.android.synthetic.main.activity_configuracion.*

class Ayuda : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ayuda)

        enviarayuda.setOnClickListener {
            val intent: Intent = Intent(this, Ayuda2::class.java)
            startActivity(intent)

        }
    }
}