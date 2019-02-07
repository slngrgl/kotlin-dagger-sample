package com.sg.kotlindaggersample.ui.login

import dagger.Binds
import dagger.Module
import dagger.Provides

/**
 * Created by Selin on 6.02.2019.
 */
@Module
abstract class LoginActivityModule {

    @Binds
    abstract fun provideLoginView(fragment: LoginActivity): LoginView

    @Module
    companion object {

        @JvmStatic
        @Provides
        fun provideLoginPresenter(view: LoginView): LoginPresenter = LoginPresenterImpl(view)
    }
}