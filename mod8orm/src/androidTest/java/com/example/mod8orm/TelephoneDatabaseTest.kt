package com.example.mod8orm

import android.content.Context
import androidx.room.Room
import androidx.test.core.app.ApplicationProvider
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class TelephoneDatabaseTest {
    @Test
    fun testInsertsAndRead(){
        val context = ApplicationProvider.getApplicationContext<Context>()
        val db = Room.inMemoryDatabaseBuilder(
            context,
            TelephoneDatabase::class.java).build()
        val dao = db.telephoneDao()
        val insertIphone14 = dao.insert(
            Telephone(
            0L,"Apple","Iphone 14",6,128,"Jaune"
            ))
        val insertOnePlus = dao.insert(Telephone(
            0L,"OnePlus","OnePlus 11",16,256,"Titan Black"
        ))
        val firstTelephone = dao.getById(1L)
        Assert.assertEquals(firstTelephone.couleur, "Jaune")
        Assert.assertEquals(firstTelephone.modele, "Iphone 14")
        Assert.assertEquals(firstTelephone.tailleRAMGB, 6)
        Assert.assertEquals(firstTelephone.marque, "Apple")
    }
}