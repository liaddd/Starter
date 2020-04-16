package com.liad.starter.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.liad.starter.fragments.FirstWelcomeFragment
import com.liad.starter.fragments.SecondWelcomeFragment
import com.liad.starter.fragments.ThirdWelcomeFragment

class FragmentPagerAdapter(fm: FragmentManager) : FragmentPagerAdapter(fm) {

    private val fragments = listOf(
        FirstWelcomeFragment.newInstance(),
        SecondWelcomeFragment.newInstance(),
        ThirdWelcomeFragment.newInstance()
    )

    override fun getItem(position: Int): Fragment = fragments[position]

    override fun getCount(): Int {
        return fragments.size
    }

}