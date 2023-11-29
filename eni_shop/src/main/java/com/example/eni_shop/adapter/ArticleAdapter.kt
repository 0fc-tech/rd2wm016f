package com.example.eni_shop.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView.Adapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.eni_shop.bo.Article
import com.example.eni_shop.databinding.ArticleLineBinding


class ArticleAdapter(val listArticles : ArrayList<Article>,
                     val onClickArticle : (article:Article) -> Unit)
    : Adapter<ArticleAdapter.ArticleViewHolder>() {
    class ArticleViewHolder(val binding: ArticleLineBinding) : ViewHolder(binding.root)
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ArticleViewHolder {
        //récupérer une instance du ArticleLineBinding
        val inflater = LayoutInflater.from(parent.context)
        val binding = ArticleLineBinding.inflate(inflater,parent,false)
        return ArticleViewHolder(binding)
    }
    override fun getItemCount() = listArticles.size
    override fun onBindViewHolder(holder: ArticleViewHolder, position: Int) {
        listArticles[position].also {article->
            holder.binding.article = article
            holder.itemView.setOnClickListener {
                onClickArticle.invoke(article)
            }
        }
    }

}