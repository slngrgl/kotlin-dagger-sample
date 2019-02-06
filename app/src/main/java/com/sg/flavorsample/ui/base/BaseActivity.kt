package com.sg.flavorsample.ui.base

import android.os.Bundle
import dagger.android.support.DaggerAppCompatActivity

/**
 * Created by Selin on 6.02.2019.
 */
abstract class BaseActivity: DaggerAppCompatActivity(), BaseView {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(getLayoutId())
    }

    protected abstract fun getLayoutId(): Int
}