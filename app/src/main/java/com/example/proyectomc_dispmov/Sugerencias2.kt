package com.example.proyectomc_dispmov

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_agrega1.*
import kotlinx.android.synthetic.main.activity_sugerencias2.*

class Sugerencias2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sugerencias2)

        aceptar2.setOnClickListener {
            val intent: Intent = Intent(this, Inicio::class.java)
            startActivity(intent)
            finish()
        }
    }
}