package com.firsttask.weatherapp.fragments.weather

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.firsttask.individualtask.ResourceProvider

class WeatherViewModel(
    private val weatherRepository: WeatherRepository,
    private val resourceProvider: ResourceProvider
) : ViewModel() {
    val currentDate = MutableLiveData<String>()
    val temperatureMax = MutableLiveData<String>()
    val temperatureMin = MutableLiveData<String>()
    var location = MutableLiveData<String>()

    fun currentLocation(latitude:String?, longitude:String?){
        location.value="${latitude}+${longitude}"
        currentDate.value="21323"
        temperatureMax.value="21323"
        temperatureMin.value="21323"
    }
}