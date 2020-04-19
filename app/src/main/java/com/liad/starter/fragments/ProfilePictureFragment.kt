package com.liad.starter.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager.HORIZONTAL
import androidx.recyclerview.widget.PagerSnapHelper
import com.liad.starter.R
import com.liad.starter.activities.CreateProfileActivity
import com.liad.starter.adapters.CreateProfilePictureAdapter
import kotlinx.android.synthetic.main.fragment_profile_picture.*

class ProfilePictureFragment : Fragment() {

    companion object {
        fun newInstance(): ProfilePictureFragment =
            ProfilePictureFragment()
    }

    private val pictureAdapter =
        CreateProfilePictureAdapter()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View = inflater.inflate(R.layout.fragment_profile_picture, container, false)


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        (activity as CreateProfileActivity).currentPage(1)
        initViews()
    }

    private fun initViews() {

        profile_fragment_recycler_view.apply {
            adapter = pictureAdapter
            layoutManager = LinearLayoutManager(context, HORIZONTAL, false)
        }

        val pagerSnapHelper = PagerSnapHelper()
        pagerSnapHelper.attachToRecyclerView(profile_fragment_recycler_view)

    }

}
