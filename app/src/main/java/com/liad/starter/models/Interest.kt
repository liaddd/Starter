package com.liad.starter.models

import androidx.annotation.DrawableRes

data class Interest(val title: String, @DrawableRes val background: Int, val isSelected: Boolean = false)