package com.example.mod3demo3

fun main() {

    //TODO Collections et Méthodes sur collections
    val collectionCouleurs = mutableListOf("jaune","vert","jaune")
    collectionCouleurs += "jaune"
    collectionCouleurs += "jaune"
    collectionCouleurs += "vert"
    collectionCouleurs += "vert"
    collectionCouleurs += "jaune"
    collectionCouleurs += "jaune"

    val nbJaune = collectionCouleurs.filter { col -> col == "jaune" }.count()
    println(nbJaune)
}