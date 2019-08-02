package com.hotelkaro.Activity;

import android.graphics.Point;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;
import com.hotelkaro.R;

public class HotelMap extends AppCompatActivity {

    private GoogleMap mMap;
    private LatLng origin, destination, three, four, five, six, seven;

    String txt[] = {"Hotel Sunrise", "Hotel Sunrise", "Hotel Sunrise"};

    private Marker mPerth;
    private Marker mSydney;
    private Marker mBrisbane;
    private Marker india;
    private Marker australia;
    private Marker china;
    private Marker caneda;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hotel_map);


    }
}
