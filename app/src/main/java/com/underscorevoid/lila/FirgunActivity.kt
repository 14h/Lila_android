package com.underscorevoid.lila

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.SeekBar


class FirgunActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.firgun)
    }
}
class MyActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.firgun)

        val slider = SeekBar(this)
        // Customize the slider...
//        firgun_slider.addView(slider)
    }
}




