package com.example.mod3demo2

fun main() {
    val age = 9999999999
    //val isMajeur = if(age >= 18) "Majeur" else "Mineur"
    //println(isMajeur)

    println(
        when(age){
            in Int.MIN_VALUE..0 -> "N'existe pas encore"
            in 1..17->"Mineur"
            in 18..100->"Majeur"
            in 101..Int.MAX_VALUE -> "pas tout jeune"
            else -> "N'existe pas"
        }
    )

    val alErrors = arrayListOf(
        "200 Success",
        "300 Multiple Choices",
        "404 Not Found",
        "505 Http Version Not Supported",
        "100 Continue")

    for (error in alErrors){
        println(error)
    }
    for ((key,error) in alErrors.withIndex())  {
        println("$key:$error")
    }
}