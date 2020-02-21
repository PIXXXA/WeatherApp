package com.firsttask.weatherapp.fragments.weather

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.firsttask.individualtask.ResourceProvider
import javax.inject.Inject

class WeatherFactory @Inject constructor(
    private val weatherRepository: WeatherRepository,
    private val resourceProvider: ResourceProvider
) : ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return modelClass.getConstructor(
            WeatherRepository::class.java, ResourceProvider::class.java
        ).newInstance(weatherRepository, resourceProvider)
    }
}