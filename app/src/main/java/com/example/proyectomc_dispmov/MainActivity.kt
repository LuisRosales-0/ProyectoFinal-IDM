package com.example.proyectomc_dispmov


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.proyectomc_dispmov.databinding.ActivityMainBinding
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    private lateinit var auth: FirebaseAuth
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registro)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        auth= Firebase.auth

        Ingresar.setOnClickListener {
            val intent: Intent = Intent(this, Autentificacion::class.java)
            startActivity(intent)
        }

    }


}