package com.hotelkaro.Activity;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.TextView;

import com.hotelkaro.R;

public class RoomList extends AppCompatActivity implements View.OnClickListener {

    CardView card1,card2,card3;
    Context mContext = this;
    TextView book1,book2,book3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_room_list);

        card1 = findViewById(R.id.card_1);
        card1.setOnClickListener(this);

        card2 = findViewById(R.id.card_2);
        card2.setOnClickListener(this);

        card3 = findViewById(R.id.card_3);
        card3.setOnClickListener(this);


        book1 = findViewById(R.id.book1);
        book1.setOnClickListener(this);
        book2 = findViewById(R.id.book2);
        book2.setOnClickListener(this);
        book3 = findViewById(R.id.book3);
        book3.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.card_1:

                startActivity(new Intent(mContext,ReviewActivity.class));

                break;

            case R.id.card_2:

                startActivity(new Intent(mContext,ReviewActivity.class));

                break;


            case R.id.card_3:

                startActivity(new Intent(mContext,ReviewActivity.class));


                break;


            case R.id.book1:

                startActivity(new Intent(mContext,ReviewBooking.class));


                break;

            case R.id.book2:

                startActivity(new Intent(mContext,ReviewBooking.class));


                break;

            case R.id.book3:

                startActivity(new Intent(mContext,ReviewBooking.class));


                break;


        }
    }
}
