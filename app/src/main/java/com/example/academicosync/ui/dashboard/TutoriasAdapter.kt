package com.example.academicosync.ui.dashboard

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.academicosync.R
import com.example.academicosync.ui.home.CategoriaViewHolder

class TutoriasAdapter(private val listTutorias: List<Tutorias>) : RecyclerView.Adapter<TutoriasViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TutoriasViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return TutoriasViewHolder(layoutInflater.inflate(R.layout.item_tutoria ,parent,false))
    }

    override fun getItemCount(): Int {
        return listTutorias.size
    }

    override fun onBindViewHolder(holder: TutoriasViewHolder, position: Int) {
        val item = listTutorias[position]
        holder.render(item)
    }
}