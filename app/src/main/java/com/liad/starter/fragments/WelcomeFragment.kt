package com.liad.starter.fragments


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.fragment.app.Fragment
import com.liad.starter.R
import kotlinx.android.synthetic.main.fragment_first_welcome.*

class WelcomeFragment : Fragment() {

    companion object {

        private const val IMAGE = "image_resource"
        private const val TITLE = "title"
        private const val SUB_TITLE = "sub_title"

        fun newInstance(
            @DrawableRes image: Int? = null,
            @StringRes title: Int,
            @StringRes subTitle: Int
        ): WelcomeFragment {
            val bundle = Bundle()
            bundle.putInt(IMAGE, image ?: 0)
            bundle.putInt(TITLE, title)
            bundle.putInt(SUB_TITLE, subTitle)

            val welcomeFragment = WelcomeFragment()
            welcomeFragment.arguments = bundle
            return welcomeFragment
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View = inflater.inflate(R.layout.fragment_first_welcome, container, false)


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initViews()
    }

    private fun initViews() {
        arguments?.let {
            fragment_welcome_image_view.setImageResource(it.getInt(IMAGE))
            fragment_welcome_title.text = getString(it.getInt(TITLE))
            fragment_welcome_sub_title.text = getString(it.getInt(SUB_TITLE))
        }
    }

}
