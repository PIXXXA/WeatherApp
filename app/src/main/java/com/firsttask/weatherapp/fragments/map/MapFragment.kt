package com.firsttask.weatherapp.fragments.map


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.firsttask.weatherapp.R
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng

/**
 * A simple [Fragment] subclass.
 */

class MapFragment : Fragment(), OnMapReadyCallback, GoogleMap.OnMapClickListener {

    lateinit var fragment: SupportMapFragment
    private var mapLongitude: String? = null
    private var mapLatitude: String? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        val rootView = inflater.inflate(R.layout.fragment_map, container, false)
        fragment = SupportMapFragment()
        val fm = childFragmentManager
        val ft = fm.beginTransaction()
        ft.replace(R.id.map, fragment).commit()
        fragment.getMapAsync(this)
        return rootView
    }

    override fun onMapReady(googleMap: GoogleMap) {
        googleMap.setOnMapClickListener(this)
    }

    override fun onMapClick(p0: LatLng?) {
        mapLongitude = p0?.longitude.toString()
        mapLatitude = p0?.latitude.toString()
    }

    companion object {
        fun newInstance() = MapFragment()
    }
}
