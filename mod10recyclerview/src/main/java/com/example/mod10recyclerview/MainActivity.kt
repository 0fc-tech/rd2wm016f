package com.example.mod10recyclerview

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rv = findViewById<RecyclerView>(R.id.recyclerViewLaptop)
        rv.layoutManager = LinearLayoutManager(this)
        rv.adapter = LaptopAdapter(arrayListOf(
            Laptop("Dell", "XPS 13", 16, 1299.99),
            Laptop("Apple", "MacBook Air", 8, 999.99),
            Laptop("HP", "Spectre x360", 16, 1399.99),
            Laptop("Lenovo", "ThinkPad X1 Carbon", 16, 1499.99),
            Laptop("Asus", "ZenBook 14", 16, 1199.99),
            Laptop("Acer", "Swift 5", 16, 1099.99),
            Laptop("Microsoft", "Surface Laptop 4", 8, 999.99),
            Laptop("LG", "Gram 17", 16, 1499.99),
            Laptop("Razer", "Blade 15", 32, 2499.99),
            Laptop("MSI", "GS66 Stealth", 32, 2299.99),
            Laptop("Alienware", "M15 R6", 32, 2799.99),
            Laptop("Lenovo", "Legion 7", 32, 1999.99),
            Laptop("HP", "OMEN 15", 16, 1499.99),
            Laptop("Acer", "Predator Helios 300", 16, 1199.99),
            Laptop("Apple", "MacBook Pro", 16, 1799.99),
            Laptop("Dell", "Inspiron 14", 8, 599.99),
            Laptop("Asus", "ROG Zephyrus G14", 16, 1299.99),
            Laptop("Microsoft", "Surface Book 3", 16, 1699.99),
            Laptop("LG", "Gram 15", 8, 1199.99),
            Laptop("Lenovo", "IdeaPad 5", 8, 799.99),
            Laptop("Acer", "Chromebook 14", 4, 299.99),
            Laptop("HP", "Pavilion 15", 12, 799.99),
            Laptop("Dell", "Latitude 14", 8, 999.99),
            Laptop("Asus", "VivoBook 15", 8, 699.99),
            Laptop("Lenovo", "Yoga 9i", 16, 1399.99)
        ))
    }
}