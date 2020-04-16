package com.liad.starter.fragments


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.liad.starter.R

class FirstWelcomeFragment : Fragment() {


    companion object {
        fun newInstance(): FirstWelcomeFragment = FirstWelcomeFragment()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View = inflater.inflate(R.layout.fragment_first_welcome, container, false)

}
