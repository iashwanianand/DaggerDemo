package com.example.daggerdemo.adapter

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.daggerdemo.data.model.MovieList
import com.example.daggerdemo.databinding.LayoutPopularMovieBinding

class MyRecyclerViewAdapter(val movieList: List<MovieList>) : RecyclerView.Adapter<MyViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        return movieList.size
    }

}

class MyViewHolder(private val binding: LayoutPopularMovieBinding) : RecyclerView.ViewHolder(binding.root){

}