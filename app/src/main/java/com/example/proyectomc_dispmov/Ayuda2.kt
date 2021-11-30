package com.example.proyectomc_dispmov

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_ayuda2.*
import kotlinx.android.synthetic.main.activity_configuracion.*

class Ayuda2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ayuda2)

        aceptar4.setOnClickListener {
            val intent: Intent = Intent(this, Configuracion::class.java)
            startActivity(intent)
            finish()
        }
    }
}