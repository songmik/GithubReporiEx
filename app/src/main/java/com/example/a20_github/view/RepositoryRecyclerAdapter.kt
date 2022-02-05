package com.example.a20_github.view

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.a20_github.data.entity.GithubRepoEntity
import com.example.a20_github.databinding.ViewholderRepositoryItemBinding

class RepositoryRecyclerAdapter:RecyclerView.Adapter<RepositoryRecyclerAdapter.RepositoryItemViewHolder>() {

    private var repositoryList: List<GithubRepoEntity> = listOf()
    private lateinit var repositoryClickListener: (GithubRepoEntity) -> Unit

    inner class RepositoryItemViewHolder(
        private val binding: ViewholderRepositoryItemBinding,
        val searchResultClickListener: (GithubRepoEntity) -> Unit
    ) :RecyclerView.ViewHolder(binding.root){
        fun bindData(data: GithubRepoEntity) = with(binding){

        }

        fun bindViews(data: GithubRepoEntity){

        }
    }
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): RepositoryRecyclerAdapter.RepositoryItemViewHolder {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(
        holder: RepositoryRecyclerAdapter.RepositoryItemViewHolder,
        position: Int
    ) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int  = repositoryList.size

    fun setSearchResultList(searchResultList: List<GithubRepoEntity>, searchResultClickListener: (GithubRepoEntity) -> Unit ){
        this.repositoryList = searchResultList
        this.repositoryClickListener = searchResultClickListener
        notifyDataSetChanged()
    }
}