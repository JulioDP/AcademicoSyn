package com.example.academicosync.ui.home

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.academicosync.R

class CategoriaAdapter(private val categoriaList: List<CursoCategorias>) : RecyclerView.Adapter<CategoriaViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CategoriaViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return CategoriaViewHolder(layoutInflater.inflate(R.layout.item_categorias ,parent,false))
    }

    override fun getItemCount(): Int {
        return categoriaList.size
    }

    override fun onBindViewHolder(holder: CategoriaViewHolder, position: Int) {
        val item = categoriaList[position]
        holder.render(item)
    }
}