package com.firsttask.weatherapp.fragments.weather


import android.app.Activity
import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.firsttask.weatherapp.R
import com.firsttask.weatherapp.databinding.FragmentWeatherBinding
import dagger.android.AndroidInjection
import dagger.android.support.AndroidSupportInjection
import dagger.android.support.DaggerFragment
import javax.inject.Inject

class WeatherFragment : DaggerFragment() {

    @Inject
    lateinit var viewModelFactory: WeatherFactory
    private lateinit var viewModel: WeatherViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        return DataBindingUtil.inflate<FragmentWeatherBinding>(
            inflater, R.layout.fragment_weather, container, false
        ).run {
            lifecycleOwner = this@WeatherFragment
            viewModel = this@WeatherFragment.viewModel
            root
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel = ViewModelProvider(this, viewModelFactory).get(WeatherViewModel::class.java)
    }

    override fun onAttach(context: Context) {
        AndroidSupportInjection.inject(this)
        super.onAttach(context)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val longitude: String? = arguments?.getString("Longitude")
        val latitude: String? = arguments?.getString("Latitude")
        viewModel.currentLocation(latitude, longitude)
    }

    companion object {
        fun newInstance() = WeatherFragment()
    }
}
