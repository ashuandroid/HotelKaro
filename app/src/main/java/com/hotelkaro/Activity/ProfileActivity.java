package com.hotelkaro.Activity;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import com.hotelkaro.R;

public class ProfileActivity extends AppCompatActivity implements View.OnClickListener {

    LinearLayout myBooking;
    Context mContext = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        myBooking = findViewById(R.id.my_booking);
        myBooking.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.my_booking:

                startActivity(new Intent(mContext,MyTrip.class));


                break;


        }
    }
}
