package com.example.tiketpesawat

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Spinner
import androidx.appcompat.app.AppCompatActivity

class KeduaActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kedua)

        val kelas_tiket = findViewById<Spinner>(R.id.drop_kelas_tiket).selectedItem.toString()
        val jam = findViewById<Spinner>(R.id.drop_jam).selectedItem.toString()
        val kumpul = findViewById<Button>(R.id.kumpul)

        val asal = intent.getStringExtra("asal")
        val tujuan = intent.getStringExtra("tujuan")
        val tanggal = intent.getStringExtra("tanggal")

        kumpul.setOnClickListener {
            val intent = Intent(this, KetigaActivity::class.java)
            intent.putExtra("asal", asal)
            intent.putExtra("tujuan", tujuan)
            intent.putExtra("tanggal", tanggal)
            intent.putExtra("jam", jam)
            intent.putExtra("tiket", kelas_tiket)
            startActivity(intent)
        }


    }
}