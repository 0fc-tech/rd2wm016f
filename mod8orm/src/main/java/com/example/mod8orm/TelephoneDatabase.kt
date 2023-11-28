package com.example.mod8orm

import androidx.room.Database
import androidx.room.RoomDatabase
@Database(entities = arrayOf(Telephone::class), version = 1)
abstract class TelephoneDatabase : RoomDatabase(){
    abstract fun telephoneDao() : TelephoneDao
}