package com.example.proyectomc_dispmov

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_agrega1.*
import kotlinx.android.synthetic.main.activity_sugerencias1.*

class Sugerencias1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sugerencias1)

        enviarr.setOnClickListener {
            val intent: Intent = Intent(this, Sugerencias2::class.java)
            startActivity(intent)
        }

    }
}