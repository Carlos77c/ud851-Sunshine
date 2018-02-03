package com.example.android.sunshine;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    private static final String FORECAST_SHARE_HASHTAG = " #SunshineApp";
    TextView mDayWeatherDisplay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        // COMPLETED (2) Display the weather forecast that was passed from MainActivity
        mDayWeatherDisplay = findViewById(R.id.day_weather_text);
        Intent receivedIntent = getIntent();
        if(receivedIntent.hasExtra(Intent.EXTRA_TEXT)){
            mDayWeatherDisplay.setText(receivedIntent.getStringExtra(Intent.EXTRA_TEXT));
            mDayWeatherDisplay.setGravity(Gravity.START);
        }
    }
}