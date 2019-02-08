package com.example.digitalpolice;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Forgetpassword extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgetpassword);

        getSupportActionBar().setTitle("Forget PIN");

    }

    public void otpnext(View view) {

        Intent intent=new Intent(this,Changepassword.class);

        startActivity(intent);



    }
}
