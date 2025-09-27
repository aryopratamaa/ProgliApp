package com.aryo.progliapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rvKeahlian = findViewById<RecyclerView>(R.id.rvKeahlian)
        rvKeahlian.layoutManager = LinearLayoutManager(this)

        val dataKeahlian = listOf(
            Keahlian(
                "Teknik Jaringan Komputer",
                "Program Keahlian Teknik Jaringan Komputer & Telekomunikasi",
                "Bekerja sebagai teknisi jaringan, administrator jaringan, teknisi komputer, atau wirausaha di bidang jaringan.",
                "Laboratorium jaringan, perangkat router, switch, komputer rakitan."
            ),
            Keahlian(
                "Rekayasa Perangkat Lunak",
                "Program Keahlian Pengembangan Perangkat Lunak dan Gim (PPLG)",
                "Bekerja sebagai programmer, web developer, mobile developer, software tester, atau IT support.",
                "Laboratorium komputer, software development tools, server lokal."
            )
            // tambahkan jurusan lain...
        )

        rvKeahlian.adapter = KeahlianAdapter(dataKeahlian) { keahlian ->
            val intent = Intent(this, DetailActivity::class.java)
            intent.putExtra("NAMA", keahlian.nama)
            intent.putExtra("PROGLI", keahlian.progli)
            intent.putExtra("PELUANG", keahlian.peluangKerja)
            intent.putExtra("FASILITAS", keahlian.fasilitas)
            startActivity(intent)
        }
    }
}
