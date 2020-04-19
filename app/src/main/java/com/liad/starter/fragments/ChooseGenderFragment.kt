package com.liad.starter.fragments


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.liad.starter.R
import com.liad.starter.activities.CreateProfileActivity


class ChooseGenderFragment : Fragment() {

    companion object {
        fun newInstance(): ChooseGenderFragment = ChooseGenderFragment()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View = inflater.inflate(R.layout.fragment_choose_gender, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        (activity as CreateProfileActivity).currentPage(2)
    }

}
