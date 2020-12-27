package com.vitaliilysenko.app.myapplicationforandroidacademy

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class AdapterActor(val actors: List<DataActor>) : RecyclerView.Adapter<ViewHolderActor>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolderActor {
        val view: View = LayoutInflater.from(parent.context)
                .inflate(R.layout.view_holder_actor, parent, false)
        return ViewHolderActor(view)
    }

    override fun onBindViewHolder(holder: ViewHolderActor, position: Int) {
        holder.bind(actors[position])
    }

    override fun getItemCount(): Int {
        return actors.size
    }
}