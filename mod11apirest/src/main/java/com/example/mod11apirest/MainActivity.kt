package com.example.mod11apirest

import android.os.Bundle
import android.widget.ImageView
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import com.squareup.picasso.Picasso

private const val TAG = "MainActivity"
class MainActivity : AppCompatActivity() {
    val vm by viewModels<BeerViewModel>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val imageView = findViewById<ImageView>(R.id.imageViewBeer)
        vm.listBeers.observe(this){listBeers->
            if(listBeers.isNotEmpty())
                Picasso.get().load(listBeers.last().image_url).into(imageView)
        }
        vm.getListBeers()
    }

}








