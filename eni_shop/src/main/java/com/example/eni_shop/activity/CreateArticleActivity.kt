package com.example.eni_shop.activity

import android.os.Bundle
import android.widget.Toast
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.eni_shop.R
import com.example.eni_shop.bo.Article
import com.example.eni_shop.dao.ArticleRepository
import com.example.eni_shop.databinding.ActivityCreateArticleBinding
import java.time.LocalDate
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

class CreateArticleActivity : AppCompatActivity() {
    lateinit var acab : ActivityCreateArticleBinding
    val cavm by viewModels<CreateArticleViewModel>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        acab = DataBindingUtil.setContentView(
            this, R.layout.activity_create_article
        )
        //acab.article = ArticleRepository.getArticle(1)/*Article(
        //    -1,
        //    "PS5",
        //    "Console de jeu",
        //    500.0,"", LocalDateTime.now())*/
        acab.buttonSauvegarder.setOnClickListener {
            //Toast.makeText(
            //    this, "${acab.article!!.titre} , ${acab.article!!.description}",
            //    Toast.LENGTH_SHORT).show()
            val articleToSave = Article(
                5,
                acab.editTextTitre.text.toString(),
                acab.edittextDescription.text.toString(),
                acab.editTextPrix.text.toString().toDouble(),
                "url",
                stringToLocalDate(acab.editTextSortieInitiale.text.toString())
            )
            cavm.addArticle(articleToSave)
            finish()
        }
    }
    fun stringToLocalDate(dateString : String) : LocalDate {
        val formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy")
        return LocalDate.parse(dateString,formatter)
    }
}