package com.example.proyectomc_dispmov

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_agrega.*
import kotlinx.android.synthetic.main.activity_armapc.*

class Agrega : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_agrega)

        val producto = Productos("Intel Core i5-7640X", 2599.00, R.drawable.intelcorei5,)
        val producto2 = Productos("Intel Core i3-9100", 2579.00, R.drawable.intelcorei3)

        val producto3 = Productos("RAM Team Group Delta TUF DDR4, 3200MHz 16GB", 1499.00, R.drawable.ramtdelta)
        val producto4 = Productos("RAM Patriot Viper 4 Blackout DDR4, 3200MHz 16GB", 1829.00, R.drawable.rampviper)

        val producto5 = Productos("NVIDIA GeForce GT 1030, 2GB 64-bit GDDR4", 3969.00, R.drawable.nvidiagt1030)
        val producto6 = Productos("NVIDIA Quadro P620, 2GB 128-bit GDDR5", 4399.00, R.drawable.nvidiaquadro)

        val ListaProductos = listOf(producto, producto2, producto3, producto4, producto5, producto6)

        val adapter = Productos_adapter(this, ListaProductos)
        lista.adapter = adapter

        aceptar.setOnClickListener {
            val intent: Intent = Intent(this, Agrega1::class.java)
            startActivity(intent)
        }



    }
}