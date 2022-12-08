package com.example.tiketpesawat

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.DatePicker
import android.widget.Spinner

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val kota_asal = findViewById<Spinner>(R.id.drop_kota_asal).selectedItem
        val kota_tujuan = findViewById<Spinner>(R.id.drop_kota_tujuan).selectedItem
        val tanggal_berangkat = findViewById<DatePicker>(R.id.date_berangkat)
        val btn = findViewById<Button>(R.id.btn_next)

        btn.setOnClickListener {
            val day = tanggal_berangkat.dayOfMonth.toString()
            val month = tanggal_berangkat.month.toString()
            val year = tanggal_berangkat.year.toString()
            val tanggal = day+"/"+month+"/"+year

//            val tiket = Tiket(kota_asal.toString(), kota_tujuan.toString(), tanggal)

            val intent = Intent(this, KeduaActivity::class.java)
            intent.putExtra("asal", kota_asal.toString())
            intent.putExtra("tujuan", kota_tujuan.toString())
            intent.putExtra("tanggal", tanggal)
            startActivity(intent)
        }


    }
}