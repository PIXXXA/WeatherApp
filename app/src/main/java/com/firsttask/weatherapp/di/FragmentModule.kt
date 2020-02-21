package com.firsttask.weatherapp.di

import com.firsttask.weatherapp.fragments.weather.WeatherFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class FragmentModule {
    @ContributesAndroidInjector
    abstract fun contributeWeatherFragment(): WeatherFragment
}