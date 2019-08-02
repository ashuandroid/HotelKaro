package com.hotelkaro.Activity;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.hotelkaro.R;

public class HotelList extends AppCompatActivity implements View.OnClickListener {

    ImageView ivLocation;
    Context mContext = this;
    LinearLayout fillter,shortBy;
    CardView hotel2,hotel1,hotel3,hotel4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hotel_list);

        ivLocation = findViewById(R.id.iv_location);
        ivLocation.setOnClickListener(this);

        fillter = findViewById(R.id.ll_fillter);
        fillter.setOnClickListener(this);
        shortBy = findViewById(R.id.ll_short);
        shortBy.setOnClickListener(this);

        hotel1 = findViewById(R.id.hotel1);
        hotel1.setOnClickListener(this);

        hotel1 = findViewById(R.id.hotel2);
        hotel1.setOnClickListener(this);

        hotel1 = findViewById(R.id.hotel3);
        hotel1.setOnClickListener(this);

        hotel1 = findViewById(R.id.hotel4);
        hotel1.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
         switch (v.getId()){
             case R.id.iv_location:

                 startActivity(new Intent(mContext,HotelMap.class));

                 break;
             case R.id.ll_fillter:

                 startActivity(new Intent(mContext,HotelMap.class));

                 break;
             case R.id.ll_short:

                 startActivity(new Intent(mContext,HotelMap.class));

                 break;

             case R.id.hotel1:

                 startActivity(new Intent(mContext,RoomList.class));

                 break;

             case R.id.hotel2:

                 startActivity(new Intent(mContext,RoomList.class));

                 break;


             case R.id.hotel3:

                 startActivity(new Intent(mContext,RoomList.class));

                 break;

             case R.id.hotel4:

                 startActivity(new Intent(mContext,RoomList.class));

                 break;
         }
    }
}
