package com.example.eni_shop.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.example.eni_shop.R
import com.example.eni_shop.dao.ArticleRepository


class ListeArticleFragment : Fragment() {
    val lavm by viewModels<ListeArticleViewModel>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_liste_article, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        lavm.listeArticles.observe(viewLifecycleOwner){listArticles->
            Toast.makeText(context, listArticles.toString(), Toast.LENGTH_SHORT).show()
        }
        lavm.getArticleList()
        view.findViewById<Button>(R.id.buttonToDetailArticle).setOnClickListener {
            ArticleRepository.getArticle(1)?.let {article ->
                val destination = ListeArticleFragmentDirections.
                actionListeArticleFragmentToDetailArticleFragment(article)//TODO Récupérer Article
                findNavController().navigate(destination)
            }

        }
    }
}