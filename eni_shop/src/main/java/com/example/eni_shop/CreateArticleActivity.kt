package com.example.eni_shop

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.eni_shop.dao.ArticleRepository
import com.example.eni_shop.databinding.ActivityCreateArticleBinding

class CreateArticleActivity : AppCompatActivity() {
    lateinit var acab : ActivityCreateArticleBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        acab = DataBindingUtil.setContentView(
            this,R.layout.activity_create_article)
        acab.article = ArticleRepository.getArticle(1)/*Article(
            -1,
            "PS5",
            "Console de jeu",
            500.0,"", LocalDateTime.now())*/
        acab.buttonSauvegarder.setOnClickListener {
            Toast.makeText(
                this, "${acab.article!!.titre} , ${acab.article!!.description}",
                Toast.LENGTH_SHORT).show()

        }
    }
}