package com.example.mod11apirest

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.mod11apirest.databinding.LineBeerBinding
import com.squareup.picasso.Picasso

class BeerAdapter(val arrayListBeers : ArrayList<Beer>) :
    RecyclerView.Adapter<BeerAdapter.ViewHolder>() {
    inner class ViewHolder(val binding: LineBeerBinding) :
        RecyclerView.ViewHolder(binding.root)
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding =
            LineBeerBinding.inflate(
                LayoutInflater.from(parent.context), parent, false
            )
        return ViewHolder(binding)
    }
    override fun getItemCount() = arrayListBeers.size
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val beerToShow = arrayListBeers[position]
        holder.binding.beer = beerToShow
        Picasso.get().load(beerToShow.image_url).into(holder.binding.imageViewBeer)
    }
}










