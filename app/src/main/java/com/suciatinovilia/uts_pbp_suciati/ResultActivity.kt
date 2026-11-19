package com.suciatinovilia.uts_pbp_suciati

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)
        val ringkasan = findViewById<TextView>(R.id.tvRingkasan)
        val totalView = findViewById<TextView>(R.id.tvTotal)

        // TODO-11: terima String pertama
        val satu = intent.getStringExtra("NAMA")
        // TODO-12: terima String kedua
        val dua = intent.getStringExtra("EVENT")
        // TODO-13: terima Int (bukan getStringExtra)
        val jumlah = intent.getIntExtra("JUMLAH", 0)
        // TODO-14: terima Int total
        val total = intent.getIntExtra("TOTAL", 0)

        // TODO-15: tampilkan String dan jumlah pada ringkasan
        ringkasan.text = "Peserta ${satu ?: ""}"

        // TODO-16: tampilkan total (konversi Int ke teks hanya di UI)
        totalView.text = "Total: ${total.toInt()}"
    }
}