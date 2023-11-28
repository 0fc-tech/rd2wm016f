package com.example.mod8orm

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface TelephoneDao {
    @Insert
    fun insert(telephone: Telephone): Long

    @Query("SELECT * FROM Telephone")
    fun getAll() : List<Telephone>

    @Query("SELECT * FROM Telephone WHERE id = :idTel")
    fun getById(idTel:Long) : Telephone
}