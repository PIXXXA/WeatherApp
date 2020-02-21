package com.firsttask.weatherapp

import android.app.Application
import com.firsttask.weatherapp.di.AppModule
import com.firsttask.weatherapp.di.component.AppComponent
import com.firsttask.weatherapp.di.component.DaggerAppComponent

class Application : Application() {
    override fun onCreate() {
        super.onCreate()
        appComponent = buildComponent()
    }

    private fun buildComponent(): AppComponent {
        return DaggerAppComponent.builder().appModule(AppModule(this)).build()
    }

    companion object {
        lateinit var appComponent: AppComponent
    }
}