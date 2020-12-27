package com.vitaliilysenko.app.myapplicationforandroidacademy

import android.graphics.Color
import android.view.View
import android.widget.ImageView
import android.widget.RatingBar
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ViewHolderMovie(view: View) : RecyclerView.ViewHolder(view) {

    val titleMovie: TextView
    val filmGenre: TextView
    val textAge: TextView
    val rating: RatingBar
    val reviews: TextView
    val playTime: TextView
    val favorite: ImageView
    val poster: ImageView

    init {

        filmGenre = view.findViewById(R.id.text_film_genre)
        textAge = view.findViewById(R.id.text_recommend_age)
        titleMovie = view.findViewById(R.id.title_movie)
        rating = view.findViewById(R.id.ratingBar)
        reviews = view.findViewById(R.id.value_reviews)
        playTime = view.findViewById(R.id.time_play_min)
        favorite = view.findViewById(R.id.favorite)
        poster = view.findViewById(R.id.poster)
    }

    fun bind(dataMovie: DataMovie) {
        titleMovie.text = dataMovie.titleMovie
        filmGenre.text = dataMovie.filmGenre
        textAge.text = dataMovie.recommendAge
        titleMovie.text = dataMovie.titleMovie
        rating.rating = dataMovie.rating.toFloat()
        reviews.text = dataMovie.reviews.toString()
        playTime.text = dataMovie.playTime.toString()
        poster.setBackgroundResource(dataMovie.poster)
        if (dataMovie.favorite) {
            favorite.setBackgroundColor(Color.parseColor("#FF3365"))
        } else {
            favorite.setBackgroundColor(Color.parseColor("#FFFFFFFF"))
        }
    }
}
