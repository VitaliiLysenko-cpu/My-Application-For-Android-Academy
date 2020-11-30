package com.vitaliilysenko.app.myapplicationforandroidacademy


import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.DialogFragment

class FragmentMoviesDetails : DialogFragment() {
       private var onDeleteFragmentClickListener: OnDeleteFragmentClickListener? = null
    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_movies_details, container, false)
        view?.findViewById<TextView>(R.id.back)?.apply {
            setOnClickListener {
                onDeleteFragmentClickListener?.deleteFragment()
            }
        }
        return view
    }
    override fun onAttach(context: Context) {
        super.onAttach(context)
        if (context is OnDeleteFragmentClickListener) {
            onDeleteFragmentClickListener = context
        }
    }

    override fun onDetach() {
        super.onDetach()
        onDeleteFragmentClickListener = null
    }
}

