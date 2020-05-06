package com.liad.starter.models

import com.liad.starter.R
import kotlin.random.Random

//TODO Liad - generate random background color
class Interest(
    val title: String,
    var isSelected: Boolean = false
) {

    private val interestBackground = arrayOf(
        R.drawable.purple_gradient_background,
        R.drawable.red_gradient_background,
        R.drawable.cyan_gradient_background,
        R.drawable.orange_gradient_background
    )

    var background: Int = R.drawable.white_background_gray_border
        get() = if(isSelected) interestBackground[Random.nextInt(interestBackground.size)] else R.drawable.white_background_gray_border
}