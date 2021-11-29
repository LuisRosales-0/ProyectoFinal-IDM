package com.example.proyectomc_dispmov

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.example.proyectomc_dispmov.databinding.ActivityAutentificacionBinding
import com.example.proyectomc_dispmov.databinding.ActivityOlvidarcontrasena1Binding
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase
import kotlinx.android.synthetic.main.activity_autentificacion.*
import kotlinx.android.synthetic.main.activity_olvidarcontrasena1.*


class Olvidarcontrasena1 : AppCompatActivity() {
    private lateinit var auth: FirebaseAuth
    private lateinit var binding: ActivityOlvidarcontrasena1Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_olvidarcontrasena1)
        binding = ActivityOlvidarcontrasena1Binding.inflate(layoutInflater)
        setContentView(binding.root)
        auth = Firebase.auth

        binding.enviar.setOnClickListener {
            val emailrestau = restaurar.text.toString()

            when{
                emailrestau.isEmpty() -> {
                    Toast.makeText(baseContext,
                        "Asegurese de ingresar todos los campos!.", Toast.LENGTH_SHORT).show()
                }else -> {
                restaurarcontra(emailrestau)
                siguiente()
                finish()
                 }
            }
        }
    }
    private fun restaurarcontra(email: String) {
        Firebase.auth.sendPasswordResetEmail(email)
            .addOnCompleteListener { task ->
                if (task.isSuccessful) {
                    Log.d("TAG", "Email enviado.")
                }
            }
    }
    private fun siguiente(){
        val intent = Intent(this, Olvdiarcontrasena2::class.java)
        this.startActivity(intent)
    }
}


