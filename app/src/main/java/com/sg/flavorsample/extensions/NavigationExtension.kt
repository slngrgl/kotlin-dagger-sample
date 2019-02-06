package com.sg.flavorsample.extensions

import android.content.Context
import android.content.Intent
import com.sg.flavorsample.ui.MainActivity
import com.sg.flavorsample.ui.login.LoginActivity

/**
 * Created by Selin on 22.01.2019.
 */
fun Context.getMainActivityIntent(clearHistory: Boolean): Intent {
    return Intent(this, MainActivity::class.java).apply {
        if (clearHistory) {
            addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP)
        }
    }
}

fun Context.getLoginActivityIntent(): Intent {
    return Intent(this, LoginActivity::class.java).apply {
    }
}