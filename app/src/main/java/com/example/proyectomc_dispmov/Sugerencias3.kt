package com.example.proyectomc_dispmov

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_sugerencias2.*
import kotlinx.android.synthetic.main.activity_sugerencias2.aceptar2
import kotlinx.android.synthetic.main.activity_sugerencias3.*

class Sugerencias3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sugerencias3)

        aceptar2.setOnClickListener {
            val intent: Intent = Intent(this, Configuracion::class.java)
            startActivity(intent)
            finish()
        }
    }
}