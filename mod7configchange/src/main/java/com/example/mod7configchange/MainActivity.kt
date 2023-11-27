package com.example.mod7configchange

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.mod7configchange.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    //var compteur = 0

    //On récupère le viewModel dès que l'on utilise la valeur "compteurVM"
    val compteurVM by viewModels<CompteurViewModel>()
    lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)
        //récupération des vues
        binding.vm = compteurVM
        //Lors du clic sur le bouton Plus 1
        binding.buttonPlusUn.setOnClickListener {
            //Incrémenter le compteur, le transformer en chaîne de caractère et
            //l'afficher dans le text du textViewCompteur
            compteurVM.plusUn().toString()
            binding.vm = compteurVM
        }
    }

    //override fun onSaveInstanceState(outState: Bundle) {
    //    super.onSaveInstanceState(outState)
    //    outState.putInt("compteur", compteur)
    //}
//
    //override fun onRestoreInstanceState(savedInstanceState: Bundle) {
    //    super.onRestoreInstanceState(savedInstanceState)
    //    compteur = savedInstanceState.getInt("compteur")
    //    textViewCompteur.text = compteur.toString()
    //}
}






