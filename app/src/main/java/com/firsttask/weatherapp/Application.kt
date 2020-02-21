package com.firsttask.weatherapp

import com.firsttask.weatherapp.di.AppModule
import com.firsttask.weatherapp.di.component.DaggerAppComponent
import dagger.android.AndroidInjector
import dagger.android.support.DaggerApplication

class Application : DaggerApplication() {
    override fun applicationInjector(): AndroidInjector<Application> {
        return DaggerAppComponent.builder().application(this).appModule(AppModule(this)).build()
    }

}