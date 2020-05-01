package com.liad.starter.utills.extensions

import android.app.Activity
import android.content.Intent
import android.view.WindowManager
import androidx.annotation.IdRes
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager

fun Activity.setFullScreen() {
    this.window.setFlags(
        WindowManager.LayoutParams.FLAG_FULLSCREEN,
        WindowManager.LayoutParams.FLAG_FULLSCREEN
    )
}

fun Activity.changeActivity(destination: Class<*>, closeCurrent: Boolean = false) {
    val intent = Intent(this, destination)
    startActivity(intent)
    if (closeCurrent) finish()
}

fun changeFragment(
    fragmentManager: FragmentManager,
    fragment: Fragment,
    @IdRes containerId: Int,
    addToBackStack: Boolean = false
) {
    val fragmentTransaction = fragmentManager.beginTransaction()
    fragmentTransaction.replace(containerId, fragment)
    if (addToBackStack) fragmentTransaction.addToBackStack(fragment::class.java.simpleName)
    fragmentTransaction.commit()
}

fun Int.toEmoji(): String = String(Character.toChars(this))