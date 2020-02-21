package com.firsttask.weatherapp.fragments.weather

import com.firsttask.weatherapp.rest.model.WeatherResponse

interface ViewModelCallBack {
    fun onSuccess(stringBuilder: WeatherResponse, locationKey :String?)
}