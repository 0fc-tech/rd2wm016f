package com.example.mod5menu

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.itemAdd -> Toast.makeText(this, "Add", Toast.LENGTH_SHORT).show()
            R.id.itemInfo -> Toast.makeText(this, "Info", Toast.LENGTH_SHORT).show()
            R.id.itemEdit -> Toast.makeText(this, "Edit", Toast.LENGTH_SHORT).show()
        }
        return super.onOptionsItemSelected(item)
    }
}