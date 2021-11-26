package com.example.proyectomc_dispmov

import android.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.firebase.auth.ktx.FirebaseAuthKtxRegistrar
import kotlinx.android.synthetic.main.activity_registro.*
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase


class Registro : AppCompatActivity() {
    private lateinit var auth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registro)

        auth= Firebase.auth
        registrar()
    }
    private fun registrar(){
        title = "Registar usuario"

        registrarbtn.setOnClickListener(){
            if (passwordRegistro.text.isNotEmpty() && passwordRegistro.text.isNotEmpty()){
                FirebaseAuth.getInstance().createUserWithEmailAndPassword(emailRegistro.text.toString(),
                    passwordRegistro.text.toString()).addOnCompleteListener {
                        if (it.isSuccessful){

                        }else{
                            registroerroneo()
                        }
                }
            }
        }
    }

    private fun registroerroneo(){
        val constructor = AlertDialog.Builder(this)
        constructor.setTitle("Error")
        constructor.setMessage("Se ha producido un error a la hora de registrar al usuario!")
        constructor.setPositiveButton("Aceptar",null)
        val dialogo:AlertDialog = constructor.create()
        dialogo.show()
    }
}