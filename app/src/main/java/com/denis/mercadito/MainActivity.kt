package com.denis.mercadito

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private var ListaProductos: MutableList<dtProductos> = mutableListOf()
    private lateinit var recycler: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        ListaProductos.add(
            dtProductos("01", "Tomate", "Menudeo $10", "Mayoreo $9")
        )
        ListaProductos.add(
            dtProductos("02", "Camote", "Menudeo $13", "Mayoreo $12")
        )
        ListaProductos.add(
            dtProductos("03", "Papa", "Menudeo $12", "Mayoreo $11")
        )
        ListaProductos.add(
            dtProductos("04", "Leche", "Menudeo $14", "Mayoreo $13")
        )
        ListaProductos.add(
            dtProductos("05", "Manzana", "Menudeo $15", "Mayoreo $14")
        )
        ListaProductos.add(
            dtProductos("06", "Papaya", "Menudeo $16", "Mayoreo $15")
        )
        ListaProductos.add(
            dtProductos("07", "Zanahoria", "Menudeo $13", "Mayoreo $12")
        )
        ListaProductos.add(
            dtProductos("08", "Pimienta", "Menudeo $14", "Mayoreo $13")
        )
        ListaProductos.add(
            dtProductos("09", "Avena", "Menudeo $17", "Mayoreo $16")
        )
        ListaProductos.add(
            dtProductos("10", "Aguacate", "Menudeo $24", "Mayoreo $23")
        )
        ListaProductos.add(
            dtProductos("11", "Lechuga", "Menudeo $16", "Mayoreo $15")
        )
        ListaProductos.add(
            dtProductos("12", "Frijol", "Menudeo $16", "Mayoreo $15")
        )
        ListaProductos.add(
            dtProductos("13", "Arroz", "Menudeo $14", "Mayoreo $13")
        )
        ListaProductos.add(
            dtProductos("14", "Naranja", "Menudeo $20", "Mayoreo $19")
        )
        ListaProductos.add(
            dtProductos("15", "Cacahuate", "Menudeo $17", "Mayoreo $16")
        )
        ListaProductos.add(
            dtProductos("16", "Jugo", "Menudeo $20", "Mayoreo $19")
        )
        ListaProductos.add(
            dtProductos("17", "Kiwi", "Menudeo $26", "Mayoreo $25")
        )
        ListaProductos.add(
            dtProductos("18", "Fresa", "Menudeo $50", "Mayoreo $45")
        )
        ListaProductos.add(
            dtProductos("19", "Lechera", "Menudeo $16", "Mayoreo $15")
        )
        ListaProductos.add(
            dtProductos("20", "Atún", "Menudeo $25", "Mayoreo $23")
        )

        var tabla = findViewById<RecyclerView>(R.id.tablaProductos)
        recycler = tabla
        recycler.layoutManager = LinearLayoutManager(this)
recycler.adapter=ProductosAdapter(this,ListaProductos)
    }
}
