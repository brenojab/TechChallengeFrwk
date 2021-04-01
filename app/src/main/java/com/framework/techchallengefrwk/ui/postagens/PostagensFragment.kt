package com.framework.techchallengefrwk.ui.postagens

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.framework.techchallengefrwk.R
import com.framework.techchallengefrwk.ui.home.HomeViewModel

class PostagensFragment : Fragment() {


    private lateinit var postagensViewModel: PostagensViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        postagensViewModel =
            ViewModelProvider(this).get(PostagensViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_postagens, container, false)




        return root
    }
}