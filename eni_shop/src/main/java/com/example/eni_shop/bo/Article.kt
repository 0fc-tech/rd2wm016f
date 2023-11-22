package com.example.eni_shop.bo

import java.time.LocalDateTime
import java.time.format.DateTimeFormatter




data class Article(
    val id: Long,
    var titre : String,
    var description: String,
    var prix : Double,
    val urlImage: String,
    val dateSortie : LocalDateTime
){
    fun afficherDateSortie() : String{
        val formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy ")
        return formatter.format(dateSortie)
    }
}
