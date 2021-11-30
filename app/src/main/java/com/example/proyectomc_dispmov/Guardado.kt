package com.example.proyectomc_dispmov

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_guardado.*
import kotlinx.android.synthetic.main.activity_sugerencias2.*

class Guardado : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_guardado)

        val bundle = intent.extras
        val guardad = bundle?.getString("Guardados")
        val mostrar = findViewById<TextView>(R.id.guardados)

        mostrar.text = "Precio total: " + guardad.toString()


        aceptar3.setOnClickListener {
            val intent: Intent = Intent(this, Inicio::class.java)
            startActivity(intent)
        }
    }
}