package com.example.proyectomc_dispmov

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_seleccion1.*

class Seleccion1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_seleccion1)

        //val capital = findViewById<EditText>(R.id.monto)

        val calcula = findViewById<Button>(R.id.calcularr)

        val aviso = findViewById<TextView>(R.id.aviso)


        calcula.setOnClickListener {
            calculo()
        }
        menu2.setOnClickListener {
            val intent: Intent = Intent(this, Inicio::class.java)
            startActivity(intent)
        }

    }

    private fun calculo() {
        val producto = Productos("Intel Core i5-7640X", 2599.00, R.drawable.intelcorei5,)
        val producto2 = Productos("Intel Core i3-9100", 2579.00, R.drawable.intelcorei3)
        val producto3 =
            Productos("RAM Team Group Delta TUF DDR4, 3200MHz 16GB", 1499.00, R.drawable.ramtdelta)
        val producto4 = Productos(
            "RAM Patriot Viper 4 Blackout DDR4, 3200MHz 16GB",
            1829.00,
            R.drawable.rampviper
        )
        val producto5 =
            Productos("NVIDIA GeForce GT 1030, 2GB 64-bit GDDR4", 3969.00, R.drawable.nvidiagt1030)
        val producto6 =
            Productos("NVIDIA Quadro P620, 2GB 128-bit GDDR5", 4399.00, R.drawable.nvidiaquadro)

        val ListaProductos1 = listOf(producto, producto2, producto3, producto4, producto5, producto6)
        val ListaProductos2 = listOf(producto, producto2, producto3, producto4, producto5)
        val ListaProductos3 = listOf(producto, producto2, producto3, producto4)
        val ListaProductos4 = listOf(producto3, producto4)
        val ListaProductos5 = listOf(producto, producto2, producto3, producto4)
        val ListaProductos6 = listOf(producto2, producto3, producto4)
        val ListaProductos7 = listOf(producto3)


        val adapter1 = Productos_adapter(this, ListaProductos1)
        val adapter2 = Productos_adapter(this, ListaProductos2)
        val adapter3 = Productos_adapter(this, ListaProductos3)
        val adapter4 = Productos_adapter(this, ListaProductos4)
        val adapter5 = Productos_adapter(this, ListaProductos5)
        val adapter6 = Productos_adapter(this, ListaProductos6)
        val adapter7 = Productos_adapter(this, ListaProductos7)

        val fondo = Integer.parseInt(monto.getText().toString())

        if (fondo >= 4399) {
            aviso.setText("Usted completa: ")
            liist.adapter = adapter1
        } else {
        }
        if (fondo < 4399) {
            aviso.setText("Usted completa: ")
            liist.adapter = adapter2
        } else {
        }
        if (fondo < 3969) {
            aviso.setText("Usted completa: ")
            liist.adapter = adapter3
        } else {
        }
        if (fondo < 2599) {
            aviso.setText("Usted completa: ")
            liist.adapter = adapter6
        } else {
        }
        if (fondo < 2579) {
            aviso.setText("Usted completa: ")
            liist.adapter = adapter4
        } else {
        }
        if (fondo < 1829) {
            aviso.setText("Usted completa: ")
            liist.adapter = adapter7
        } else {
        }
        if (fondo < 1499){
            aviso.setText("Usted no completa nada. ")
            liist.adapter = null
        }
    }
}
        //if (fondo > 4500) {
              //
       // }
       // else {
          //  aviso.setText("Completa: ")
           //
       // }
       // if (fondo < 1829){
      //  }
           // aviso.setText("Se completa:")

            //else{
           // if (fondo < 10000) {
              //  aviso.setText("Seu completa:")
           // }else{
               // if (fondo < 15000 ){
               //     aviso.setText("Sinau completa:")
               // }else {
               //     if (fondo > 20000){
                     //   aviso.setText("Se completa:")
                      //  liist.adapter = adapter1
                  //  }else{
                     //   aviso.setText("dos")

               // }

            //}
        //}

   // }
//}