package com.example.digitalpolice;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class RegisterComplaint extends AppCompatActivity {
ActionBar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_complaint);

        toolbar = getSupportActionBar();

        toolbar.setTitle("Complaint Register");


    }

    public void nextcompsecondscreen(View view) {


        Intent intent=new Intent(this,Complaint_Second.class);

        startActivity(intent);



    }
}
