package com.sg.kotlindaggersample.di.builder

import com.sg.kotlindaggersample.di.scope.ActivityScope
import com.sg.kotlindaggersample.ui.MainActivity
import com.sg.kotlindaggersample.ui.login.LoginActivity
import com.sg.kotlindaggersample.ui.login.LoginActivityModule
import dagger.Module
import dagger.android.ContributesAndroidInjector

/**
 * Created by Selin on 6.02.2019.
 */
@Module
abstract class ActivityBuilder {

    @ActivityScope
    @ContributesAndroidInjector
    abstract fun bindMainActivity(): MainActivity

    @ActivityScope
    @ContributesAndroidInjector(modules = [LoginActivityModule::class])
    abstract fun bindLoginActivity(): LoginActivity
}