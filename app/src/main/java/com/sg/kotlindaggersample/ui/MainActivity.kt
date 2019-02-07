package com.sg.kotlindaggersample.ui

import android.os.Bundle
import com.sg.kotlindaggersample.R
import com.sg.kotlindaggersample.extensions.getLoginActivityIntent
import com.sg.kotlindaggersample.ui.base.BaseActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setOnClickListeners()
    }

    private fun setOnClickListeners() {
        btn_go_login.setOnClickListener { startActivity(getLoginActivityIntent()) }
    }

    override fun getLayoutId(): Int = R.layout.activity_main
}
