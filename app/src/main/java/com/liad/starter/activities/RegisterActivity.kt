package com.liad.starter.activities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.liad.starter.R
import com.liad.starter.utills.extensions.changeActivity
import kotlinx.android.synthetic.main.activity_register.*

class RegisterActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        initViews()
    }

    private fun initViews() {
        register_activity_register_button.setOnClickListener {
            changeActivity(CreateProfileActivity::class.java)
        }

        register_activity_sign_in_text.setOnClickListener {
            changeActivity(LoginActivity::class.java)
        }
    }
}
