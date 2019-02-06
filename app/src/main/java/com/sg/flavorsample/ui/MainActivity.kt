package com.sg.flavorsample.ui

import android.os.Bundle
import com.sg.flavorsample.R
import com.sg.flavorsample.extensions.getLoginActivityIntent
import com.sg.flavorsample.ui.base.BaseActivity
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
