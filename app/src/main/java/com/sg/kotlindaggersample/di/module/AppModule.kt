package com.sg.kotlindaggersample.di.module

import android.content.Context
import com.sg.kotlindaggersample.SampleApp
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

/**
 * Created by Selin on 6.02.2019.
 */
@Module
class AppModule {

    @Provides
    @Singleton
    internal fun provideContext(application: SampleApp): Context = application

}