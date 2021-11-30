package com.example.proyectomc_dispmov


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import com.example.proyectomc_dispmov.databinding.ActivityMainBinding
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    private lateinit var auth: FirebaseAuth
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportActionBar?.hide()

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        auth= Firebase.auth
        val user = Firebase.auth.currentUser
        if (user != null) {
            Ingres.setOnClickListener {
                val intent = Intent(this,Inicio::class.java)
                startActivity(intent)
            }

        } else {
            Ingres.setOnClickListener {
                val intent  = Intent(this,Autentificacion::class.java)
                startActivity(intent)
            }
        }



    }



}