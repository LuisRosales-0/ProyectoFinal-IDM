package com.example.proyectomc_dispmov

import android.app.AlertDialog
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.example.proyectomc_dispmov.databinding.ActivityAutentificacionBinding
import com.google.firebase.auth.ktx.FirebaseAuthKtxRegistrar
import kotlinx.android.synthetic.main.activity_registro.*
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase
import kotlinx.android.synthetic.main.activity_autentificacion.*


class Autentificacion : AppCompatActivity() {

    private lateinit var auth: FirebaseAuth
    private lateinit var binding: ActivityAutentificacionBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registro)

        binding = ActivityAutentificacionBinding.inflate(layoutInflater)
        setContentView(binding.root)
        auth= Firebase.auth

        binding.loginbtn.setOnClickListener {
            val lcorreo = emailLogIn.text.toString()
            val lcontrasena = passwordLogIn.text.toString()
            when{
                lcorreo.isEmpty() || lcontrasena.isEmpty() -> {
                    Toast.makeText(baseContext,
                        "Asegurese de ingresar todos los campos!.",
                        Toast.LENGTH_SHORT).show()
                }else -> {
                    InicioSesion(lcorreo, lcontrasena)
                }
            }
        }
    }

    private fun InicioSesion(email : String, password : String) {
        auth.signInWithEmailAndPassword(email, password)
            .addOnCompleteListener(this) { task ->
                if (task.isSuccessful) {
                    Log.d("TAG", "signInWithEmail:success")
                    acceso()
                } else {
                    Log.w("TAG", "signInWithEmail:failure", task.exception)
                    Toast.makeText(baseContext, "Correo y/o Contraseña erroneos, porfavor vuelva" +
                            "a intentarlo",
                        Toast.LENGTH_SHORT).show()
                }
            }
    }
    private fun acceso(){
        val intent = Intent(this, Inicio::class.java)
        this.startActivity(intent)
    }
}