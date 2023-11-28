package com.example.mod8orm

import androidx.room.Entity
import androidx.room.PrimaryKey
@Entity
data class Telephone(
    @PrimaryKey(autoGenerate = true)
    val id : Long,
    val marque: String,
    val modele: String,
    val tailleRAMGB: Int,
    val tailleStockageGB: Int,
    val couleur: String
)
