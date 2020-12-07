package com.vitaliilysenko.app.myapplicationforandroidacademy

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView


class AdapterMovie(val movies: List<DataMovie>) : RecyclerView.Adapter<ViewHolderMovie>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolderMovie {

        val view = LayoutInflater.from(parent.context)
                .inflate(R.layout.view_holder_movie, parent, false)
        return ViewHolderMovie(view)
    }

    override fun onBindViewHolder(holder: ViewHolderMovie, position: Int) {
        holder.bind(movies[position])

    }

    override fun getItemCount(): Int {
        return movies.size
    }

}
