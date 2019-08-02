package com.hotelkaro.Activity;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.LinearLayout;

import com.hotelkaro.R;

public class ReviewBooking extends AppCompatActivity implements View.OnClickListener {

    LinearLayout book;
    Context mContext = this;
    CardView applyCoupon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_review_booking);

        book = findViewById(R.id.ll_continue);
        book.setOnClickListener(this);
        applyCoupon = findViewById(R.id.card_apply_coupon);
        applyCoupon.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.ll_continue:

                startActivity(new Intent(mContext,Payment.class));

                break;

            case R.id.card_apply_coupon:

                startActivity(new Intent(mContext,Coupon.class));

                break;

        }
    }
}
