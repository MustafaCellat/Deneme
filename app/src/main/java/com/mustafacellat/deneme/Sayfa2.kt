package com.mustafacellat.deneme

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class Sayfa2 : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sayfa2)

        val button = findViewById<Button>(R.id.button_musteri)
        button.setOnClickListener {
            val intent = Intent(this, Sayfa3::class.java)
            startActivity(intent)
        }
    }
}