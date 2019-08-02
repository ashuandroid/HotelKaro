package com.hotelkaro.Activity;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.hotelkaro.R;

public class MainActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener, View.OnClickListener {

    Button btnSearch;
    BottomNavigationView navigation;
    Context mContext = this;
    EditText search;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btnSearch = findViewById(R.id.btn_searh_hotel);
        btnSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,HotelList.class));
            }
        });


        navigation = findViewById(R.id.bootom);
        navigation.setOnNavigationItemSelectedListener(this);

        search = findViewById(R.id.et_search);
        search.setOnClickListener(this);


    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        switch (menuItem.getItemId()) {
            case R.id.search_menu:




                  break;

            case R.id.fav_menu:



                break;

            case R.id.profile_menu:

                startActivity(new Intent(mContext,ProfileActivity.class));


                break;

            case R.id.setting_menu:



                break;

        }
        return false;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.et_search:

                startActivity(new Intent(mContext,DestinationActivity.class));

                break;
        }
    }
}
