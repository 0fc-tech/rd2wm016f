package com.example.eni_shop.activity

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.eni_shop.R
import com.example.eni_shop.dao.ArticleRepository
import com.google.android.material.floatingactionbutton.FloatingActionButton

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        findViewById<FloatingActionButton>(R.id.fabCreateArticle).setOnClickListener {
            startActivity(
                Intent(
                    this,
                    CreateArticleActivity::class.java
                )
            )
        }
    }

    override fun onResume() {
        super.onResume()
        findViewById<TextView>(R.id.textViewListArticles).text =
            ArticleRepository.getAllArticle().toString()
    }
}