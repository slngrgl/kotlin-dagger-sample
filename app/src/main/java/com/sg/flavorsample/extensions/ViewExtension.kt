package com.sg.flavorsample.extensions

import android.os.Build
import android.support.annotation.ColorRes
import android.support.v4.content.ContextCompat
import android.view.View
import android.view.Window
import android.view.WindowManager
import android.widget.Button
import android.widget.TextView

fun View.isVisibile(): Boolean = this.visibility == View.VISIBLE

fun View.isGone(): Boolean = this.visibility == View.GONE

fun View.isInvisible(): Boolean = this.visibility == View.INVISIBLE

fun View.makeVisible() { this.visibility = View.VISIBLE }

fun View.makeGone() { this.visibility = View.GONE }

fun View.makeInvisible() { this.visibility = View.INVISIBLE }

fun View.setVisibilityByCondition(isVisible: Boolean) { this.visibility = if(isVisible) View.VISIBLE else View.GONE }

/**
 * TextView
 */
fun TextView.setTextWithContentDescription(value : String?) {
    text = value
    contentDescription = value
}

/**
 * Button
 */
fun Button.disableButton() {
    isEnabled = false
    alpha = 0.3f
}

fun Button.enableButton() {
    isEnabled = true
    alpha = 1.0f
}

/**
 * Sets color to status bar
 */
fun Window.addStatusBarColor(@ColorRes color: Int) {
    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
        this.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS)
        this.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS)
        this.statusBarColor = ContextCompat.getColor(this.context, color)
    }
}