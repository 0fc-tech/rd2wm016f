package com.example.eni_shop.dao

import com.example.eni_shop.bo.Article

interface ArticleDao {
    fun selectById(id: Long): Article?
    fun selectAll(): List<Article>
    fun add(article: Article): Long
    fun update(article: Article): Boolean
    fun remove(article: Article): Boolean
}