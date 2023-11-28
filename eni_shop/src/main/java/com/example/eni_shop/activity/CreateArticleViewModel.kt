package com.example.eni_shop.activity

import androidx.lifecycle.ViewModel
import com.example.eni_shop.bo.Article
import com.example.eni_shop.dao.ArticleRepository

class CreateArticleViewModel : ViewModel() {
    fun addArticle(article : Article){
        ArticleRepository.addArticle(article)
    }
}