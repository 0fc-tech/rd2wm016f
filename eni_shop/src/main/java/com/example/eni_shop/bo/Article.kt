package com.example.eni_shop.bo

import android.os.Parcelable
import kotlinx.parcelize.Parcelize
import java.time.LocalDate
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter



@Parcelize
data class Article(
    val id: Long,
    var titre : String,
    var description: String,
    var prix : Double,
    val urlImage: String,
    val dateSortie : LocalDate
) : Parcelable{
    fun afficherDateSortie() : String{
        val formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy")
        return formatter.format(dateSortie)
    }
}
