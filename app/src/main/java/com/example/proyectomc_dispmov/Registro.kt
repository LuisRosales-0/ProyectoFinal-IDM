package com.example.proyectomc_dispmov

import android.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.util.Patterns
import android.widget.Toast
import com.example.proyectomc_dispmov.databinding.ActivityAutentificacionBinding
import com.example.proyectomc_dispmov.databinding.ActivityRegistroBinding
import com.google.firebase.auth.ktx.FirebaseAuthKtxRegistrar
import kotlinx.android.synthetic.main.activity_registro.*
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase
import java.util.regex.Pattern


class Registro : AppCompatActivity() {
    private lateinit var auth: FirebaseAuth
    private lateinit var binding: ActivityRegistroBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registro)

        binding = ActivityRegistroBinding.inflate(layoutInflater)
        setContentView(binding.root)
        auth= Firebase.auth

        binding.registrarbtn.setOnClickListener {
            val memail = binding.emailRegistro.text.toString()
            val mpassword = binding.passwordRegistro.text.toString()
            val mrepeatpassword = binding.passwordrepetir.text.toString()

            if(memail.isEmpty() || !Patterns.EMAIL_ADDRESS.matcher(memail).matches()){
                Toast.makeText(baseContext, "Ingrese un email valido!",
                    Toast.LENGTH_SHORT).show()
            //}//else if(mpassword.isEmpty() || passwordRegex.matcher(mpassword).matches()){
                //Toast.makeText(baseContext, "Ingrese una contraseña valida!",
                    //Toast.LENGTH_SHORT).show()
            }else {
                registarusuario(memail, mpassword)
            }
        }

    }
    private fun registarusuario(email : String, password : String){
        auth.createUserWithEmailAndPassword(email, password)
            .addOnCompleteListener(this) { task ->
                if (task.isSuccessful) {
                } else {
                    // If sign in fails, display a message to the user.
                    Log.w("TAG", "createUserWithEmail:failure", task.exception)
                    Toast.makeText(baseContext, "Authentication failed.",
                        Toast.LENGTH_SHORT).show()
                }
            }
    }
}