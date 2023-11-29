package com.example.mod11apirest

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import okhttp3.OkHttpClient
import okhttp3.Request
import org.json.JSONArray

class BeerViewModel : ViewModel() {
    val listBeers = MutableLiveData(arrayListOf<Beer>())
    fun getListBeers(){
        val client = OkHttpClient()
        val requestDisneyCharacters = Request.Builder()
            .url("https://api.punkapi.com/v2/beers")
            .build()
        viewModelScope.launch(Dispatchers.IO){
            val responseBeers = client.newCall(requestDisneyCharacters).execute()
            responseBeers.body?.let { body->
                listBeers.postValue(jsonToListBeers(body.string()))
            }
        }
    }
    private fun jsonToListBeers(json: String): ArrayList<Beer> {
        val jsonArray = JSONArray(json)
        val arrayListBeers = arrayListOf<Beer>()
        for(beerIndex in 0 until jsonArray.length()){
            val beerJson = jsonArray.getJSONObject(beerIndex)
            arrayListBeers.add(Beer(
                beerJson.getString("name"),
                beerJson.getString("description"),
                beerJson.getString("tagline"),
                beerJson.getDouble("abv"),
                beerJson.getString("image_url"),
            ))
        }
        return arrayListBeers
    }
}