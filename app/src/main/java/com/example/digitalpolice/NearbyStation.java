package com.example.digitalpolice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class NearbyStation extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nearby_station);
        getSupportActionBar().setTitle("Near by Station");

    }
}
