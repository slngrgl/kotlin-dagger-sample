package com.sg.flavorsample.di.component

import com.sg.flavorsample.SampleApp
import com.sg.flavorsample.di.builder.ActivityBuilder
import com.sg.flavorsample.di.module.AppModule
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton

/**
 * Created by Selin on 18.10.2018.
 */
@Singleton
@Component(modules = [
    AndroidSupportInjectionModule::class,
    AppModule::class,
    ActivityBuilder::class])
interface AppComponent : AndroidInjector<SampleApp> {

    @Component.Builder
    abstract class Builder : AndroidInjector.Builder<SampleApp>()

}