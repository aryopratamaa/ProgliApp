package com.aryo.progliapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class KeahlianAdapter(private val listKeahlian: List<Keahlian>) :
    RecyclerView.Adapter<KeahlianAdapter.KeahlianViewHolder>() {

    class KeahlianViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val tvNama: TextView = itemView.findViewById(R.id.tvNama)
        val tvProgli: TextView = itemView.findViewById(R.id.tvProgli)
        val tvPeluangKerja: TextView = itemView.findViewById(R.id.tvPeluangKerja)
        val tvFasilitas: TextView = itemView.findViewById(R.id.tvFasilitas)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): KeahlianViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_keahlian, parent, false)
        return KeahlianViewHolder(view)
    }

    override fun onBindViewHolder(holder: KeahlianViewHolder, position: Int) {
        val item = listKeahlian[position]
        holder.tvNama.text = item.nama
        holder.tvProgli.text = item.progli
        holder.tvPeluangKerja.text = "Peluang Kerja: ${item.peluangKerja}"
        holder.tvFasilitas.text = "Fasilitas: ${item.fasilitas}"
    }

    override fun getItemCount(): Int = listKeahlian.size
}

