package com.liad.starter.activites

import android.app.Fragment
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import androidx.viewpager.widget.ViewPager
import com.liad.starter.R
import com.liad.starter.adapters.FragmentPagerAdapter
import kotlinx.android.synthetic.main.activity_get_started.*

class GetStartedActivity : AppCompatActivity() {


    private lateinit var viewPager : ViewPager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_get_started)

        setFullScreen()
        initViews()
    }

    private fun initViews() {
        viewPager = get_started_activity_view_pager
        viewPager.apply {
            adapter = FragmentPagerAdapter(supportFragmentManager)
        }
    }

    private fun setFullScreen() {
        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )
    }
}
