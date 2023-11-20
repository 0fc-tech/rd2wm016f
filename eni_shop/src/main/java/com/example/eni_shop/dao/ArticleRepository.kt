package com.example.eni_shop.dao

import com.example.eni_shop.bo.Article

object ArticleRepository {
    private val articleDaoNetwork = DaoFactory.createArticleDao(DaoType.NETWORK)
    private val articleDaoMemory = DaoFactory.createArticleDao(DaoType.MEMORY)
    fun getArticle(id: Long): Article? {
        return articleDaoMemory.selectById(id);
    }
    fun addArticle(article: Article): Long {
        return articleDaoMemory.add(article)
    }
}