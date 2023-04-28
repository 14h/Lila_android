package com.underscorevoid.lila


import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity


class FirgunActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.firgun)

        val firgunBeginButton = findViewById<Button>(R.id.firgun_begin)
        firgunBeginButton.setOnClickListener {
            val intent = Intent(this, Firgun1Activity::class.java)
            startActivity(intent)
        }
    }
}









