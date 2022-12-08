package com.example.tiketpesawat

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class KetigaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ketiga)

        val view_asal = findViewById<TextView>(R.id.view_asal)
        val view_tujuan = findViewById<TextView>(R.id.view_tujuan)
        val view_tgl = findViewById<TextView>(R.id.view_tgl)
        val view_harga = findViewById<TextView>(R.id.view_harga)
        val view_jam = findViewById<TextView>(R.id.view_jam)
        val view_kelas = findViewById<TextView>(R.id.view_kelas)

        val kelas = intent.getStringExtra("tiket").toString()
        val asal = intent.getStringExtra("asal").toString()
        val tujuan = intent.getStringExtra("tujuan").toString()
        val tanggal = intent.getStringExtra("tanggal").toString()
        val jam = intent.getStringExtra("jam").toString()

        view_asal.setText(asal)
        view_tujuan.setText(tujuan)
        view_jam.setText(tujuan)
        view_kelas.setText(kelas)
        view_tgl.setText(kelas)


        var harga :Int? = null
        if (asal.equals("Jakarta")){
            if (tujuan.equals("Bali")){
                if (kelas.equals("Ekonomi")){
                    if (jam.equals("10.00")){
                        harga = 1000000
                    }else if (jam.equals("16.00")){
                        harga = 800000
                    }else if (jam.equals("20.00")){
                        harga = 500000
                    }
                }else{
                    if (jam.equals("10.00")){
                        harga = 5000000
                    }else if (jam.equals("16.00")){
                        harga = 300000
                    }else if (jam.equals("20.00")){
                        harga = 200000
                    }
                }
            }else if (tujuan.equals("Yogyakarta")){
                if (kelas.equals("Ekonomi")){
                    if (jam.equals("10.00")){
                        harga = 1000000
                    }else if (jam.equals("16.00")){
                        harga = 800000
                    }else if (jam.equals("20.00")){
                        harga = 500000
                    }
                }else{
                    if (jam.equals("10.00")){
                        harga = 5000000
                    }else if (jam.equals("16.00")){
                        harga = 300000
                    }else if (jam.equals("20.00")){
                        harga = 200000
                    }
                }
            }else if (tujuan.equals("Jakarta")){
                harga = 0
            }
        }else if (asal.equals("Bali")){
            if (tujuan.equals("Bali")){
                harga = 0
            }else if (tujuan.equals("Yogyakarta")){
                if (kelas.equals("Ekonomi")){
                    if (jam.equals("10.00")){
                        harga = 1000000
                    }else if (jam.equals("16.00")){
                        harga = 800000
                    }else if (jam.equals("20.00")){
                        harga = 500000
                    }
                }else{
                    if (jam.equals("10.00")){
                        harga = 5000000
                    }else if (jam.equals("16.00")){
                        harga = 300000
                    }else if (jam.equals("20.00")){
                        harga = 200000
                    }
                }

            }else if (tujuan.equals("Jakarta")){
                if (kelas.equals("Ekonomi")){
                    if (jam.equals("10.00")){
                        harga = 1000000
                    }else if (jam.equals("16.00")){
                        harga = 800000
                    }else if (jam.equals("20.00")){
                        harga = 500000
                    }
                }else{
                    if (jam.equals("10.00")){
                        harga = 5000000
                    }else if (jam.equals("16.00")){
                        harga = 300000
                    }else if (jam.equals("20.00")){
                        harga = 200000
                    }
                }

            }
        }else if (asal.equals("Yogyakarta")){
            if (tujuan.equals("Bali")){
                if (kelas.equals("Ekonomi")){
                    if (jam.equals("10.00")){
                        harga = 1000000
                    }else if (jam.equals("16.00")){
                        harga = 800000
                    }else if (jam.equals("20.00")){
                        harga = 500000
                    }
                }else{
                    if (jam.equals("10.00")){
                        harga = 5000000
                    }else if (jam.equals("16.00")){
                        harga = 300000
                    }else if (jam.equals("20.00")){
                        harga = 200000
                    }
                }

            }else if (tujuan.equals("Yogyakarta")){
                harga = 0
            }else if (tujuan.equals("Jakarta")){
                if (kelas.equals("Ekonomi")){
                    if (jam.equals("10.00")){
                        harga = 1000000
                    }else if (jam.equals("16.00")){
                        harga = 800000
                    }else if (jam.equals("20.00")){
                        harga = 500000
                    }
                }else{
                    if (jam.equals("10.00")){
                        harga = 5000000
                    }else if (jam.equals("16.00")){
                        harga = 300000
                    }else if (jam.equals("20.00")){
                        harga = 200000
                    }
                }

            }
        }
        view_harga.setText(harga.toString())
    }
}