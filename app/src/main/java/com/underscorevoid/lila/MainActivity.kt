package com.underscorevoid.lila

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout

class MainActivity : AppCompatActivity() {
    private lateinit var firgunBtn : LinearLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        firgunBtn = findViewById(R.id.firgunBtn);
        firgunBtn.setOnClickListener {
            val intent = Intent(this, FirgunActivity::class.java)
            // start your next activity
            startActivity(intent)
        }
    }


}
