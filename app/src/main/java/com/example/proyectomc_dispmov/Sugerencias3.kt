package com.example.proyectomc_dispmov

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase
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
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {

        menuInflater.inflate(R.menu.salir, menu)

        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        when (item.itemId){
            R.id.Salir ->{
                Firebase.auth.signOut()
                finish()
            }
        }

        return super.onOptionsItemSelected(item)
    }
}