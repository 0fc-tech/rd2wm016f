package com.example.eni_shop.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.eni_shop.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        getColor(R.color.primary_color_app)
    }
}