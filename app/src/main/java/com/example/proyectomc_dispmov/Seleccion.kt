package com.example.proyectomc_dispmov

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.CheckBox
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_agrega1.*
import kotlinx.android.synthetic.main.activity_seleccion.*

class Seleccion : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_seleccion)

        val precio1 = findViewById<CheckBox>(R.id.prod1)
        val precio2 = findViewById<CheckBox>(R.id.prod2)
        val precio3 = findViewById<CheckBox>(R.id.prod3)
        val precio4 = findViewById<CheckBox>(R.id.prod4)
        val precio5 = findViewById<CheckBox>(R.id.prod5)
        val precio6 = findViewById<CheckBox>(R.id.prod6)

        val preciofinal = findViewById<TextView>(R.id.precioo)

        val calculartot = findViewById<Button>(R.id.caltot)

        //Item                                              Precio
        //Intel Core i5-7640X                               2599.00
        //Intel Core i3-9100                                2579.00
        //RAM Team Group Delta TUF DDR4, 3200MHz 16GB       1499.00
        //RAM Patriot Viper 4 Blackout DDR4, 3200MHz 16GB   1829.00
        // NVIDIA GeForce GT 1030, 2GB 64-bit GDDR4         3969.00
        // NVIDIA Quadro P620, 2GB 128-bit GDDR5            4399.00

       calculartot.setOnClickListener {
           var sumatotal = 0
           if (precio1.isChecked)
               sumatotal += 2599
           if(precio2.isChecked)
               sumatotal += 2579
           if (precio3.isChecked)
               sumatotal += 1499
           if (precio4.isChecked)
               sumatotal += 1829
           if(precio5.isChecked)
               sumatotal += 3969
           if (precio6.isChecked)
               sumatotal += 4399
           preciofinal.setText("El precio total es: $"+ sumatotal.toString())
           val guardar = findViewById<Button>(R.id.guard)
           guardar.setOnClickListener {
               val intent = Intent(this, Guardado::class.java)
               intent.putExtra("Guardados", sumatotal.toString())
               startActivity(intent)
           }
       }
        menu.setOnClickListener {
            val intent: Intent = Intent(this, Inicio::class.java)
            startActivity(intent)
        }


    }
}