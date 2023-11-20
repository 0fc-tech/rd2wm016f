package com.example.mod3demo1

var michel = "Michel"

fun main() {
    println("Hello World")
    println(michel)

    //TODO Val / Var
    //val nonModifiable = 1
    //nonModifiable = 2

//    var modifiable = 1
//    modifiable = 5

    //TODO Lazy
    val world = "World"
    val messageComplet by lazy { "Hello $world" }
    //Ici messageComplet n'est pas encore initialisé car non appelé!
    println(messageComplet)

    //TODO Nullable
    val monPrenom : String? = null

    val tailleMonPrenom = monPrenom?.length ?: 0

}





