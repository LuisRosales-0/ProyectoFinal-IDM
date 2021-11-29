package com.example.proyectomc_dispmov

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.itempc.view.*

class Productos_adapter(private val mContext: Context, private val ListaProductos: List<Productos>) : ArrayAdapter<Productos>(mContext, 0, ListaProductos){
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val layout = LayoutInflater.from(mContext).inflate(R.layout.itempc, parent, false   )

        val productos = ListaProductos[position]
        layout.nombre.text = productos.nombre
        layout.precio.text = "$${productos.precio}"
        layout.imageView.setImageResource(productos.Imagen)



        return  layout
    }


}