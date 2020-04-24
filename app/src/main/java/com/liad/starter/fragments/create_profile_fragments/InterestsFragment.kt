package com.liad.starter.fragments.create_profile_fragments


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.LinearLayout
import androidx.core.content.res.ResourcesCompat
import androidx.fragment.app.Fragment
import com.liad.starter.R
import com.liad.starter.activities.CreateProfileActivity
import com.liad.starter.models.Interest
import com.nex3z.flowlayout.FlowLayout
import kotlinx.android.synthetic.main.fragment_interests.*
import kotlin.random.Random

class InterestsFragment : Fragment() {

    companion object {
        fun newInstance(): InterestsFragment =
            InterestsFragment()
    }

    private lateinit var flowLayout: FlowLayout
    private lateinit var interests: List<Interest>

    private val interestsTitle = arrayOf(
        "Travel",
        "Traveling",
        "Camping",
        "RVing",
        "Basketball",
        "Tennis",
        "Horse Riding",
        "Swimming",
        "Mountain climbing",
        "Football",
        "Walking",
        "Running",
        "Noodling",
        "Hiking",
        "Soccer",
        "Dancing"
    )

    private val interestBackground = arrayOf(
        R.drawable.purple_gradient_background,
        R.drawable.red_gradient_background,
        R.drawable.cyan_gradient_background,
        R.drawable.orange_gradient_background
    )

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View = inflater.inflate(R.layout.fragment_interests, container, false)


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        (activity as? CreateProfileActivity)?.currentPage(3)
        initViews()
    }

    private fun initViews() {
        flowLayout = fragment_interests_flow_layout

        val params = LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT , LinearLayout.LayoutParams.WRAP_CONTENT)

        for (interest in interestsTitle) {
            val button = Button(context)
            button.text = interest
            button.isAllCaps = false
            button.setPadding(16 , 16 , 16 , 16)
            button.setTextColor(
                ResourcesCompat.getColor(resources, android.R.color.white, null)
            )
            button.background = ResourcesCompat.getDrawable(
                resources,
                interestBackground[Random.nextInt(interestBackground.size)],
                null
            )
            flowLayout.addView(button)
        }
    }

}
