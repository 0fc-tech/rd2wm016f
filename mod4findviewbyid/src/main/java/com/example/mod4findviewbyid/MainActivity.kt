package com.example.mod4findviewbyid

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.mod4findviewbyid.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)
        //val textViewHelloWorld = findViewById<TextView>(R.id.textViewHelloWorld)
        binding.textViewHelloWorld.textSize = 20f
        binding.textViewHelloWorld.setTextColor(getColor(R.color.redBlack))

        //val button = findViewById<Button>(R.id.button)
        binding.button.setOnClickListener {
            binding.textViewHelloWorld.text = "Appui sur bouton !"
            Toast.makeText(this, "Appui sur bouton !", Toast.LENGTH_SHORT).show()
            //Snackbar.make(it,"Appui sur bouton",Snackbar.LENGTH_SHORT)
            //    .setAction("ANNULER",{}).show()
        }
        binding.monEntier = 5
    }
}