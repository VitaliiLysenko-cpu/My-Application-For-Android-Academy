package com.vitaliilysenko.app.myapplicationforandroidacademy

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.GridLayout
import android.widget.ImageView
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView


class FragmentMoviesList : Fragment() {


    private var onChangeFragmentClickListener: OnChangeFragmentClickListener? = null
    private var recyclerMovie: RecyclerView? =  null
    private  var layoutManager:RecyclerView.LayoutManager?=null
    private var adapterMovie: RecyclerView.Adapter<RecyclerView.ViewHolder>?=null

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_movies_list, container, false)
        view?.findViewById<ImageView>(R.id.mask)?.apply {
            setOnClickListener {
                onChangeFragmentClickListener?.addSecondFragment()
            }
        }
        return view
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        if (context is OnChangeFragmentClickListener) {
            onChangeFragmentClickListener = context
        }
    }

    override fun onDetach() {
        super.onDetach()
        onChangeFragmentClickListener = null
    }
}