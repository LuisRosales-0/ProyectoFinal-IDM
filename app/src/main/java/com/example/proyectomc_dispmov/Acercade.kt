package com.example.proyectomc_dispmov

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_acercade.*
import kotlinx.android.synthetic.main.activity_agrega1.*

class Acercade : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_acercade)

        volver.setOnClickListener {
            val intent: Intent = Intent(this, Inicio::class.java)
            startActivity(intent)
        }

    }
}