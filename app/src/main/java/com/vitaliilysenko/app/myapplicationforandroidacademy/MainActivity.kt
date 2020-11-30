package com.vitaliilysenko.app.myapplicationforandroidacademy

import android.app.ActionBar
import android.os.Bundle
import android.widget.FrameLayout
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity(), OnChangeFragmentClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val frame = FrameLayout(this)
        frame.id = R.id.container_fragment
        setContentView(R.layout.activity_main)
        setContentView(frame, ActionBar.LayoutParams(
                ActionBar.LayoutParams.MATCH_PARENT, ActionBar.LayoutParams.MATCH_PARENT))
        if (savedInstanceState == null) {
            addFirstFragment()
        }
    }

    private fun addFirstFragment() {
        supportFragmentManager
                .beginTransaction()
                .add(R.id.container_fragment, FragmentMoviesList())
                .commit()
    }

    override fun addSecondFragment() {
        supportFragmentManager
                .beginTransaction()
                .addToBackStack("Back")
                .add(R.id.container_fragment, FragmentMoviesDetails())
                .commit()
    }
}