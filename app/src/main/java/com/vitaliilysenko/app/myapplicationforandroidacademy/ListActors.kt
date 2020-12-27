package com.vitaliilysenko.app.myapplicationforandroidacademy

class ListActors {
    fun generateActor(): List<DataActor> {
        return listOf(
        DataActor(R.string.name_actor_1,R.drawable.robert),
        DataActor(R.string.name_actor_2,R.drawable.chris),
        DataActor(R.string.name_actor_3,R.drawable.mark),
        DataActor(R.string.name_actor_4,R.drawable.chris_hemsworth)
        )
    }
}