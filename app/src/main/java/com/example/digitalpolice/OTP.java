package com.example.digitalpolice;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class OTP extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_otp);
        getSupportActionBar().setTitle("OTP");





    }

    public void submit(View view) {

        Intent intent=new Intent(this,HOME.class);
        startActivity(intent);

    }
}
