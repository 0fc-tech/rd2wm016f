package com.example.mod4findviewbyid

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val textViewHelloWorld = findViewById<TextView>(R.id.textViewHelloWorld)
        textViewHelloWorld.textSize = 20f
        textViewHelloWorld.setTextColor(getColor(R.color.redBlack))

        val button = findViewById<Button>(R.id.button)
        button.setOnClickListener {
            textViewHelloWorld.text = "Appui sur bouton !"
            Toast.makeText(this, "Appui sur bouton !", Toast.LENGTH_SHORT).show()
            //Snackbar.make(it,"Appui sur bouton",Snackbar.LENGTH_SHORT)
            //    .setAction("ANNULER",{}).show()
        }
    }
}