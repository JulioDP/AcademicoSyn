package com.example.academicosync.ui.home

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.academicosync.R

class CategoriaViewHolder(view: View): RecyclerView.ViewHolder(view) {
    
    //Recuperar los datos
    val textCAtegorias= view.findViewById<TextView>(R.id.text_curso)

    fun render(cursoCategorias: CursoCategorias){
        textCAtegorias.text = cursoCategorias.nombre;
    }
}