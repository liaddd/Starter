package com.liad.starter.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.liad.starter.R
import com.liad.starter.fragments.WelcomeFragment

class FragmentPagerAdapter(fm: FragmentManager) : FragmentPagerAdapter(fm) {

    private val fragments = listOf(
        WelcomeFragment.newInstance(
            R.drawable.interest_onboarding,
            R.string.customize_your_interests,
            R.string.just_to_give_you_the_best_experience
        ),
        WelcomeFragment.newInstance(
            R.drawable.group,
            R.string.chat_with_awesome_people,
            R.string.our_ai_find_the_best_people_that_share_your_interests
        ),
        WelcomeFragment.newInstance(
            null,
            R.string.get_more,
            R.string.liked_your_match_save_in_your_starter_case_of_cool_people
        )
    )

    override fun getItem(position: Int): Fragment = fragments[position]

    override fun getCount(): Int {
        return fragments.size
    }

}