package com.liad.starter.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager.widget.ViewPager
import com.liad.starter.R
import com.liad.starter.adapters.FragmentPagerAdapter
import com.liad.starter.utills.extensions.changeActivity
import kotlinx.android.synthetic.main.activity_welcome.*

class WelcomeActivity : AppCompatActivity() {


    private lateinit var viewPager: ViewPager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)

        //setFullScreen()
        initViews()
    }

    private fun initViews() {
        viewPager = welcome_activity_view_pager
        viewPager.apply {
            adapter = FragmentPagerAdapter(supportFragmentManager)
        }

        main_fragment_sign_in_text.setOnClickListener {
            changeActivity(LoginActivity::class.java)
        }

        welcome_activity_button.setOnClickListener {
            changeActivity(RegisterActivity::class.java)
        }
    }
}
