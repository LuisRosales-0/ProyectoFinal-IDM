package com.example.proyectomc_dispmov

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase
import com.google.gson.Gson
import com.google.gson.GsonBuilder
import kotlinx.android.synthetic.main.activity_agrega1.*
import kotlinx.android.synthetic.main.activity_noticias.*
import okhttp3.*
import java.io.IOException

class Noticias : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_noticias)

       mostarnews()

        acepp.setOnClickListener {
            val intent: Intent = Intent(this, Inicio::class.java)
            startActivity(intent)
        }

    }

    fun mostarnews(){
        val client = OkHttpClient()

        val request = Request.Builder()
            .url("https://gaming-news.p.rapidapi.com/news")
            .get()
            .addHeader("x-rapidapi-host", "gaming-news.p.rapidapi.com")
            .addHeader("x-rapidapi-key", "ad40adf933msh465d7d5262db06ap11044cjsna14c6e1930f4")
            .build()


        client.newCall(request).enqueue(object: Callback{
            override fun onFailure(call: Call, e: IOException) {
            println("Fallo en la conexion")
            }
            override fun onResponse(call: Call, response: Response) {
                if (response.isSuccessful()){
                    val body = response.body()?.string()

                }

            }
        }

        )




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

class HomeNoticias(val news: List<News>)

class News(val title: String, val url: String )