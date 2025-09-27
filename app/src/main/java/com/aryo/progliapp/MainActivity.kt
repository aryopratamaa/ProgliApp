package com.aryo.progliapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnExit = findViewById<Button>(R.id.btnExit)
        btnExit.setOnClickListener {
            finishAffinity()
        }

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
            ),
            Keahlian(
                "Teknik Elektronika Industri",
                "Program Keahlian Teknik Elektronika",
                "Bekerja di industri manufaktur, teknisi peralatan elektronik, maintenance engineer.",
                "Lab elektronika, peralatan solder, PLC, sensor dan aktuator."
            ),
            Keahlian(
                "Teknik Pemesinan",
                "Program Keahlian Teknik Mesin",
                "Bekerja sebagai operator mesin, teknisi permesinan, atau di bidang manufaktur logam.",
                "Mesin bubut, mesin frais, mesin CNC."
            ),
            Keahlian(
                "Teknik Kendaraan Ringan",
                "Program Keahlian Otomotif",
                "Bekerja sebagai mekanik mobil, teknisi service kendaraan ringan, teknisi engine.",
                "Bengkel praktik, peralatan otomotif."
            ),
            Keahlian(
                "Teknik Sepeda Motor",
                "Program Keahlian TSM",
                "Bekerja sebagai mekanik sepeda motor, teknisi injeksi, teknisi service motor sport.",
                "Bengkel praktik, peralatan service motor."
            ),
            Keahlian(
                "Teknik Pengelasan",
                "Program Keahlian Teknik Pengelasan dan Fabrikasi Logam",
                "Bekerja sebagai welder, teknisi las industri, fabrikator logam.",
                "Workshop las, mesin las listrik, mesin las MIG/TIG."
            )
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
