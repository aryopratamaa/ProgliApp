package com.aryo.progliapp

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class DetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val tvNamaDetail = findViewById<TextView>(R.id.tvNamaDetail)
        val tvProgliDetail = findViewById<TextView>(R.id.tvProgliDetail)
        val tvPeluangDetail = findViewById<TextView>(R.id.tvPeluangDetail)
        val tvFasilitasDetail = findViewById<TextView>(R.id.tvFasilitasDetail)

        // Ambil data dari Intent
        val nama = intent.getStringExtra("NAMA")
        val progli = intent.getStringExtra("PROGLI")
        val peluang = intent.getStringExtra("PELUANG")
        val fasilitas = intent.getStringExtra("FASILITAS")

        // Tampilkan ke UI
        tvNamaDetail.text = nama
        tvProgliDetail.text = progli
        tvPeluangDetail.text = "Peluang Kerja: $peluang"
        tvFasilitasDetail.text = "Fasilitas: $fasilitas"
    }
}
