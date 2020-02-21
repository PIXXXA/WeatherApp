package com.firsttask.weatherapp.di.component

import com.firsttask.weatherapp.di.*
import com.firsttask.weatherapp.fragments.weather.WeatherFragment
import dagger.Component
import dagger.android.AndroidInjectionModule
import dagger.android.AndroidInjector
import dagger.android.ContributesAndroidInjector
import dagger.android.DaggerApplication
import javax.inject.Singleton

@Singleton
@Component(
    modules = [AndroidInjectionModule::class, AppModule::class, NetworkModule::class,
        UtilsModule::class, ViewModelFactoryModule::class,FragmentModule::class]
)
interface AppComponent{

}

