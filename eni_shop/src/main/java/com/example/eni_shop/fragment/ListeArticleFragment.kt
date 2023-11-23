package com.example.eni_shop.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.eni_shop.R
import com.example.eni_shop.dao.ArticleRepository


class ListeArticleFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_liste_article, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        view.findViewById<Button>(R.id.buttonToDetailArticle).setOnClickListener {
            ArticleRepository.getArticle(1)?.let {article ->
                val destination = ListeArticleFragmentDirections.
                actionListeArticleFragmentToDetailArticleFragment(article)//TODO Récupérer Article
                findNavController().navigate(destination)
            }

        }
    }
}