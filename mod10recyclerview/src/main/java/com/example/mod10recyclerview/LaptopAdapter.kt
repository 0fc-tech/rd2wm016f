package com.example.mod10recyclerview

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.mod10recyclerview.databinding.LaptopLineBinding

class LaptopAdapter(val listLaptops : ArrayList<Laptop>) : RecyclerView.Adapter<LaptopAdapter.LaptopViewHolder>() {

    class LaptopViewHolder(val binding: LaptopLineBinding) :
        RecyclerView.ViewHolder(binding.root)
    //On va créer le conteneur d'élément de liste (représentation d'un laptop) On appelle ça un ViewHolder
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LaptopViewHolder {
        return LaptopViewHolder(
            LaptopLineBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        )
    }
    //Retourne le nombre d'éléments dans notre liste
    override fun getItemCount() = listLaptops.size
    //Déclenché à chaque fois que l'on veut afficher un élément de notre liste
    override fun onBindViewHolder(holder: LaptopViewHolder, position: Int) {
        holder.binding.laptop = listLaptops[position]
        holder.itemView.setOnClickListener {
            Toast.makeText(
                it.context,
                "Sélection : ${listLaptops[position].modele}",
                Toast.LENGTH_SHORT).show()
        }
    }
}






