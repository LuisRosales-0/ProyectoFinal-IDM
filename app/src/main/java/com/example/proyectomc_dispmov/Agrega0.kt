package com.example.proyectomc_dispmov

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.ImageView
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase
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