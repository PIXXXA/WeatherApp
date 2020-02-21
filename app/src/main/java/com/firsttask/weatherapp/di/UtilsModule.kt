package com.firsttask.weatherapp.di

import android.content.Context
import com.firsttask.individualtask.ResourceProvider
import com.firsttask.weatherapp.fragments.weather.WeatherRepository
import com.firsttask.weatherapp.rest.service.WeatherService
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class UtilsModule {
    @Provides
    @Singleton
    fun getResourceProvider(context: Context): ResourceProvider {
        return ResourceProvider(context)
    }

    @Provides
    @Singleton
    fun getWeatherRepository(weatherService: WeatherService): WeatherRepository{
        return WeatherRepository(weatherService)
    }
}