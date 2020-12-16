package com.example.findplace;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class BuyTicketActivity extends AppCompatActivity {

    public static final String
            KEY_FOR_PLACE_NAME = "place name"
            , KEY_FOR_LOCATION = "location"
            , KEY_FOR_IMAGE_URL = "image url"
            , KEY_FOR_DISCOUNT = "discount";

    private TextView placeName, price, location, score, description;
    private ImageView imageViewPlaceImage;
    private Button people, like, bookTripNow;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buy_ticket);
    }
}