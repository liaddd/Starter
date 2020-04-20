package com.liad.starter.fragments.create_profile_fragments


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.liad.starter.R
import com.liad.starter.activities.CreateProfileActivity

class InterestsFragment : Fragment() {

    companion object {
        fun newInstance(): InterestsFragment =
            InterestsFragment()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View = inflater.inflate(R.layout.fragment_interests, container, false)


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        (activity as CreateProfileActivity).currentPage(3)
    }

}
