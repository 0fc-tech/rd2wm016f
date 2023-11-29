package com.example.eni_shop.fragment

import androidx.lifecycle.ViewModel
import com.example.eni_shop.bo.Article
import com.example.eni_shop.dao.ArticleRepository

class ListeArticleViewModel : ViewModel() {
   //val listeArticles = MutableLiveData <List<Article>>()
   //val listeArticles = MutableLiveData <List<Article>>()

    fun getArticleList() : List<Article>{
        //listeArticles.value =  ArticleRepository.getAllArticle()
        return ArticleRepository.getAllArticle()
    }
    fun getRandomArticle() : Article{
        return ArticleRepository.getAllArticle().random()
    }
}