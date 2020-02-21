package com.firsttask.weatherapp.di

import com.firsttask.individualtask.ResourceProvider
import com.firsttask.weatherapp.fragments.weather.WeatherFactory
import com.firsttask.weatherapp.fragments.weather.WeatherRepository
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class ViewModelFactoryModule {
    @Provides
    @Singleton
    fun getWeatherFactory(
        weatherRepository: WeatherRepository, resourceProvider: ResourceProvider
    ): WeatherFactory {
        return WeatherFactory(
            weatherRepository, resourceProvider
        )
    }
}
