/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.sunshine;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // COMPLETED (1) Create a field to store the weather display TextView
    TextView mWeatherTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forecast);

        // COMPLETED (2) Use findViewById to get a reference to the weather display TextView
        mWeatherTextView = findViewById(R.id.tv_weather_data);

        // COMPLETED (3) Create an array of Strings that contain fake weather data

        String[] testWeatherData = {
                "Today, Jun 7 - Rainy - 1°C / 7°C",
                "Tomorrow - Cloudy - 4°C / 9°C",
                "Thursday - Rainy- 8°C / 11°C",
                "Friday - Partly Cloudy - 9°C / 12°C",
                "Saturday - Thunderstorms - 6°C / 7°C",
                "Sunday - Rainy - 6°C / 8°C",
                "Monday - Partly Cloudy - 3°C / 6°C",
                "Tue, Nov 17 - Birthday - 1°C / 8°C",
                "Wed, Nov 18 - Hangover - 2°C / 9°C",
                "Thu, Nov 19 - Sunny - 0°C / 8°C",
                "Fri, Nov 20 - Partly Cloudy - 0°C / 4°C",
                "Sat, Nov 21 - Rainy - 6°C / 7°C",
                "Sun, Nov 22 - Cloudy - 16°C / 8°C",
                "Mon, Nov 23 - Rainy - 15°C / 10°C",
        };

        // COMPLETED (4) Append each String from the fake weather data array to the TextView
        for(String weather : testWeatherData){
            mWeatherTextView.append(weather + "\n\n\n");
        }
    }
}