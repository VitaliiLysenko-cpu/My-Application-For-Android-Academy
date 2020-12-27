package com.vitaliilysenko.app.myapplicationforandroidacademy

class ListMovie {

    fun generateMovie(): List<DataMovie>{
        return listOf(
                DataMovie("Avengers: End Game","13+","Action, Adventure, Drama",
                        4,125,137,false,R.drawable.avengers_draw),
                DataMovie("Tenet", "16+", "Action, Sci-Fi, Thriller",
                        5, 98, 97, true, R.drawable.tenet_draw),
                DataMovie("Black Widow", "13+", "Action, Adventure, Sci-Fi",
                        4, 38, 102, false, R.drawable.black_window_dwaw),
                DataMovie("Wonder Woman 1984", "13+", "Action, Adventure, Fantasy",
                        5, 74, 120, false, R.drawable.wonder_woman_draw)
        )
    }
}