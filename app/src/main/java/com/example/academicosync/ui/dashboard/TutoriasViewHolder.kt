package com.example.academicosync.ui.dashboard

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.academicosync.R

class TutoriasViewHolder(view: View) : ViewHolder(view) {

    //Recuperar los datos
    val textTutorias= view.findViewById<TextView>(R.id.text_nombre_tutoria)

    fun render(tutorias: Tutorias){
        textTutorias.text = tutorias.nombre;
    }
}
