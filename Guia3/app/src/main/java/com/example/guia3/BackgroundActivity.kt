package com.example.guia3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.constraintlayout.widget.ConstraintLayout
import android.graphics.Color

class BackgroundActivity : AppCompatActivity() {
    private val btnWhite: Button
        get() = findViewById(R.id.White)
    private val btnRed: Button
        get() = findViewById(R.id.Red)
    private val layoutPrincipal: ConstraintLayout
        get() = findViewById(R.id.layoutPrincipal)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_background)

        btnRed.setOnClickListener {
            layoutPrincipal.setBackgroundColor(Color.RED)
        }

        btnWhite.setOnClickListener {
            layoutPrincipal.setBackgroundColor(Color.WHITE)
        }
    }
}