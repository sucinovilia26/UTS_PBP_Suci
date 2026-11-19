package com.suciatinovilia.uts_pbp_suciati

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val satu = findViewById<EditText>(R.id.etSatu)
        val dua = findViewById<EditText>(R.id.etDua)
        val jumlahView = findViewById<EditText>(R.id.etJumlah)
        val tombol = findViewById<Button>(R.id.btnHitung)

        tombol.setOnClickListener {
            val teksSatu = satu.text.toString().trim()
            val teksDua = dua.text.toString().trim()

            // TODO-02: validasi kedua String tidak kosong; beri error dan hentikan proses
            if (teksSatu.isEmpty() || teksDua.isEmpty()) {
                if (teksSatu.isEmpty()) {
                    satu.error = "Nama peserta tidak boleh kosong"
                }
                if (teksDua.isEmpty()) {
                    dua.error = "Nama event tidak boleh kosong"
                }

                Toast.makeText(this, "Nama Peserta dan Event Wajib Diisi", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            val jumlah = jumlahView.text.toString().trim().toIntOrNull()
            val tarif: Int = 75000
            val total: Int = jumlah?.times(tarif) ?:
            if (jumlah == null || jumlah < 1 || jumlah > 10) {
                jumlahView.error = "Jumlah tiket harus antara 1 dan 10"
                Toast.makeText(this, "Jumlah tiket harus antara 1 dan 10", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }


            val intent = Intent(this, ResultActivity::class.java)
            intent.putExtra("NAMA", teksSatu)
            intent.putExtra("EVENT", teksDua)
            intent.putExtra("JUMLAH", total)
            startActivity(intent)

            //val jumlah: Int? = /* TODO-01: konversi aman ke Int? */ null
// TODO-02: validasi kedua String tidak kosong; beri error dan hentikan proses
// TODO-03: validasi Int dalam rentang 1..10; beri error dan hentikan proses
           // val tarif: Int = 75000
           // val total: Int = 0 // FIXME-04: hitung dengan operasi perkalian Int
// TODO-05: buat Explicit Intent menuju ResultActivity
// TODO-06: kirim teksSatu sebagai String
// TODO-07: kirim teksDua sebagai String
// TODO-08: kirim jumlah sebagai Int
// TODO-09: kirim total sebagai Int
// TODO-10: buka Activity tujuan
        }
    }
}