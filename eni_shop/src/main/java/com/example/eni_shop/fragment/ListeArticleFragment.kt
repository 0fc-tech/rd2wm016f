package com.example.eni_shop.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.eni_shop.R
import com.example.eni_shop.adapter.ArticleAdapter


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

        view.findViewById<RecyclerView>(R.id.recyclerViewArticles).apply {
            layoutManager = LinearLayoutManager(view.context)
            adapter =  ArticleAdapter(ArrayList( lavm.getArticleList())){article->
                val destination = ListeArticleFragmentDirections.
                actionListeArticleFragmentToDetailArticleFragment(article)
                findNavController().navigate(destination)
            }
        }
        //lavm.listeArticles.observe(viewLifecycleOwner){listArticles->
        //    Toast.makeText(context, listArticles.toString(), Toast.LENGTH_SHORT).show()
        //    recyclerViewArticles.adapter = ArticleAdapter(ArrayList(listArticles))
        //}
        //lavm.getArticleList()
        //view.findViewById<Button>(R.id.buttonToDetailArticle).setOnClickListener {
        //    ArticleRepository.getArticle(1)?.let {article ->
        //        val destination = ListeArticleFragmentDirections.
        //        actionListeArticleFragmentToDetailArticleFragment(article)//TODO Récupérer Article
        //        findNavController().navigate(destination)
        //    }
//
        //}
    }
}