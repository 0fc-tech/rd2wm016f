package com.example.eni_shop.dao.memory

import android.os.Build
import android.util.Log
import androidx.annotation.RequiresApi
import com.example.eni_shop.bo.Article
import com.example.eni_shop.dao.ArticleDao
import java.time.LocalDate
import java.time.LocalDateTime
//logt
private const val TAG = "ArticleDaoMemoryImpl"
class ArticleDaoMemoryImpl: ArticleDao {
    private val listArticles = arrayListOf(
/*0 */      Article(1,"PS5","Console de jeu",500.0,"htt", LocalDate.now()),
/*1 */       Article(2,"PS4","Console de jeu",400.0,"htt", LocalDate.now()),
/*2*/        Article(3,"PS3","Console de jeu",200.0,"htt", LocalDate.now())
    )
    override fun selectById(id: Long): Article? {
       return listArticles.find { it.id == id }
    }

    override fun selectAll(): List<Article> = listArticles

    override fun add(article: Article): Long {
        listArticles.add(article)
        //logi
        Log.i(TAG, "add: " + article.toString())
        return listArticles.lastIndex.toLong();
    }

    override fun update(article: Article): Boolean {
        TODO("Not yet implemented")
    }

    override fun remove(article: Article): Boolean {
        TODO("Not yet implemented")
    }
}