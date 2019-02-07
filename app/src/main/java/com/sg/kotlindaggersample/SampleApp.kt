package com.sg.kotlindaggersample

import android.content.Context
import com.sg.kotlindaggersample.di.component.DaggerAppComponent
import dagger.android.AndroidInjector
import dagger.android.DaggerApplication

/**
 * Created by Selin on 6.02.2019.
 */
class SampleApp: DaggerApplication() {

    init {
        instance = this
    }

    companion object {

        lateinit var instance: SampleApp

        fun applicationContext(): Context {
            return instance.applicationContext
        }
    }

    override fun applicationInjector(): AndroidInjector<out DaggerApplication> =
        DaggerAppComponent.builder().create(this)
}