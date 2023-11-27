package com.example.mod7configchange

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
//Cette classe contient toutes les données de notre activité de compteur
class CompteurViewModel : ViewModel() {
    //Agit comme un conteneur autour de notre entier (compteur) et avertit les observers
    // (dans notre cas notre binding qui mettra à jour l'UI avec notre nouvelle valeur de compteur)
    var compteur = MutableLiveData(0)
    fun plusUn() {
        //On modifie le compteur par sa valeur ".inc()" => incrémentée de 1
        compteur.value = compteur.value?.inc()
    }
}