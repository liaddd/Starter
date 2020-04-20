package com.liad.starter.fragments.create_profile_fragments


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.liad.starter.R
import com.liad.starter.activities.CreateProfileActivity
import kotlinx.android.synthetic.main.fragment_choose_gender.*


class ChooseGenderFragment : Fragment() {

    companion object {
        fun newInstance(): ChooseGenderFragment =
            ChooseGenderFragment()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View = inflater.inflate(R.layout.fragment_choose_gender, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        (activity as CreateProfileActivity).currentPage(2)

        initViews()
    }

    private fun initViews() {
        val onClick = View.OnClickListener {
            it.background = resources.getDrawable(R.drawable.gender_selected_background, null)
        }

        choose_gender_fragment_you_are_male.setOnClickListener(onClick)
        choose_gender_fragment_you_are_female.setOnClickListener(onClick)
        choose_gender_fragment_chat_with_male.setOnClickListener(onClick)
        choose_gender_fragment_chat_with_female.setOnClickListener(onClick)
        choose_gender_fragment_both_genders_text_view.setOnClickListener(onClick)
    }

}
