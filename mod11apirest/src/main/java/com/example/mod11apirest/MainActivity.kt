package com.example.mod11apirest

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

private const val TAG = "MainActivity"
class MainActivity : AppCompatActivity() {
    val vm by viewModels<BeerViewModel>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val recyclerView = findViewById<RecyclerView>(R.id.recyclerViewBeers)
        recyclerView.layoutManager = LinearLayoutManager(this)
        vm.listBeers.observe(this){listBeers->
            if(listBeers.isNotEmpty())
                recyclerView.adapter = BeerAdapter(listBeers)
        }
        vm.getListBeers()
    }

}








