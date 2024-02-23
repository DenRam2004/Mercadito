package com.denis.mercadito

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ListAdapter
import android.widget.TextView
import androidx.core.view.LayoutInflaterCompat
import androidx.core.widget.TextViewCompat
import androidx.recyclerview.widget.RecyclerView
import org.w3c.dom.Text

class ProductosAdapter(var context: Context, var ListaProductos: MutableList<dtProductos>) :
    RecyclerView.Adapter<ProductosAdapter.ViewHolder>()
{
  inner class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
      lateinit var txtid: TextView
      init {
          txtid=itemView.findViewById(R.id.txtid)
      }
      lateinit var txtdescripcion: TextView
      init {
          txtdescripcion=itemView.findViewById(R.id.txtdescripcion)
      }
      lateinit var txtpreciomenudeo: TextView
      init {
          txtpreciomenudeo=itemView.findViewById(R.id.txtpreciomenudeo)
      }
lateinit var txtpreciomayoreo: TextView
init {
    txtpreciomayoreo=itemView.findViewById(R.id.txtpreciomayoreo)
}
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductosAdapter.ViewHolder {
        var itemView = LayoutInflater.from(context).inflate(
            R.layout.mercadito,parent,false)
        return ViewHolder(itemView)
    }

    override fun getItemCount(): Int {
        return ListaProductos.size
    }

    override fun onBindViewHolder(holder: ProductosAdapter.ViewHolder, position: Int) {
        var productos = ListaProductos[position]
        holder.txtid.text=productos.id
        holder.txtdescripcion.text=productos.descripcion
        holder.txtpreciomenudeo.text=productos.preciomenudeo
        holder.txtpreciomayoreo.text=productos.preciomayoreo
    }
}

