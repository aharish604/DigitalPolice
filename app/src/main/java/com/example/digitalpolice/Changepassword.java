package com.example.digitalpolice;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Changepassword extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_changepassword);

        getSupportActionBar().setTitle("Change PIN");

    }

    public void changepin(View view) {

        Intent intent=new Intent(this,HOME.class);

        startActivity(intent);

    }
}
