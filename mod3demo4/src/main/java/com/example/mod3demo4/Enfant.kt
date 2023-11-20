package com.example.mod3demo4

class Enfant(var name : String):Personne(name) {
    override fun getTruc() {
        super.getTruc()
        println("Ceci est le getTruc de Enfant")
    }
}

fun main() {
    val personne = Personne("John")
    println(personne.getTruc())
    val enfant = Enfant("Doe")
    println(enfant.getTruc())
}