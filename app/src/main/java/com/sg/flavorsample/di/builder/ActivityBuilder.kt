package com.sg.flavorsample.di.builder

import com.sg.flavorsample.di.scope.ActivityScope
import com.sg.flavorsample.ui.MainActivity
import com.sg.flavorsample.ui.login.LoginActivity
import com.sg.flavorsample.ui.login.LoginActivityModule
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