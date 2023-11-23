package com.example.mod5navfragment

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class User(
    val prenom: String,val nom: String) : Parcelable
