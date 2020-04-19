package com.liad.starter.activities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.res.ResourcesCompat
import com.liad.starter.R
import com.liad.starter.fragments.ChooseGenderFragment
import com.liad.starter.fragments.InterestsFragment
import com.liad.starter.fragments.ProfilePictureFragment
import com.liad.starter.utills.extensions.changeFragment
import kotlinx.android.synthetic.main.activity_create_profile.*

class CreateProfileActivity : AppCompatActivity() {

    private val fragments = listOf(
        ProfilePictureFragment.newInstance(),
        ChooseGenderFragment.newInstance(),
        InterestsFragment.newInstance()
    )

    private var currentFragmentPos = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create_profile)

        initViews()
    }

    private fun initViews() {
        create_profile_activity_progress_bar.progressDrawable.setColorFilter(
            ResourcesCompat.getColor(resources, R.color.light_purple, null),
            android.graphics.PorterDuff.Mode.SRC_IN
        )

        changeFragment(
            supportFragmentManager,
            fragments[currentFragmentPos],
            R.id.create_profile_activity_frame_layout
        )

        create_profile_activity_continue_button.setOnClickListener {
            changeFragment(
                supportFragmentManager,
                fragments[currentFragmentPos + 1],
                R.id.create_profile_activity_frame_layout,
                true
            )
        }
    }

    fun currentPage(page: Int) {
        val title = "Step $page-3"
        create_profile_activity_step_text_view.text = title

        var counter = 0
        val percent: Int = when (page) {
            1 -> {

                counter = 0
                33
            }
            2 -> {
                counter = 33
                66
            }
            3 -> {
                counter = 66
                100
            }
            else -> 0
        }

        Thread(Runnable {
            while (counter < percent) {
                create_profile_activity_progress_bar.progress = counter++
                Thread.sleep(20)
            }
        }).start()
    }
}
