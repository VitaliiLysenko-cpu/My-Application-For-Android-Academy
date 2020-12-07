package com.vitaliilysenko.app.myapplicationforandroidacademy

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ViewHolderActor(view: View) : RecyclerView.ViewHolder(view) {
    
    val nameActor: TextView
    val imageActor: ImageView

    init {
        nameActor = view.findViewById(R.id.name_actor)
        imageActor = view.findViewById(R.id.image_actor)
    }

    fun bind(dataActor: DataActor) {
        nameActor.setText(dataActor.nameActor)
        imageActor.setBackgroundResource(dataActor.imageActor)
    }
}