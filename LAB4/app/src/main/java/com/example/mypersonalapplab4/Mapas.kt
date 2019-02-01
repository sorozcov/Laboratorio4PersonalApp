package com.example.mypersonalapplab4

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions
import com.google.android.gms.maps.model.Marker




class Mapas : Fragment(),OnMapReadyCallback{
    private lateinit var mMap: GoogleMap
    override fun onMapReady(googleMap: GoogleMap) {
        mMap = googleMap

        // Add a marker in Dhaka, Bangladesh, and move the camera.
        val MiUbicacion = LatLng(14.641980, -90.513240)
        mMap.setMapType(GoogleMap.MAP_TYPE_NORMAL);
        mMap.addMarker(
            MarkerOptions()
                .position(MiUbicacion).title("Guatemala")
        )
        mMap.moveCamera(CameraUpdateFactory.newLatLng(MiUbicacion));
        mMap.moveCamera(CameraUpdateFactory.zoomTo(6.0f))
    }




    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
            //returning our layout file
            //change R.layout.yourlayoutfilename for each of your fragments
            var  v:View =inflater.inflate(com.example.mypersonalapplab4.R.layout.mapas, container, false)

            var fm:FragmentManager= childFragmentManager
            val mapFrag:SupportMapFragment= fm.findFragmentById(com.example.mypersonalapplab4.R.id.map) as SupportMapFragment

             mapFrag.getMapAsync(this);
            return v
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        //you can set the title for your toolbar here for different fragments different titles
        activity!!.title = "Dirección"


    }


}