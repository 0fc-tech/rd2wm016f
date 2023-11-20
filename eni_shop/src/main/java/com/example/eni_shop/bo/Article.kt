package com.example.eni_shop.bo

import java.time.LocalDateTime

data class Article(
    val id: Long,
    var titre : String,
    var description: String,
    var prix : Double,
    val urlImage: String,
    val dateSortie : LocalDateTime
)
