package com.example.digitalpolice;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Register extends AppCompatActivity {

    EditText adhaar,mobileno,pin,conformpin;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        getSupportActionBar().setTitle("Registeration");

        adhaar=findViewById(R.id.register_aadhaar);
        mobileno=findViewById(R.id.register_mobileno);
        pin=findViewById(R.id.register_pin);
        conformpin=findViewById(R.id.register_reenterpin);



      //  pin1= Integer.parseInt(pin.getText().toString());

      //  pin2= Integer.parseInt(conformpin.getText().toString());



    }

    public void register(View view) {



        if(adhaar.getText().toString().length()!=12)
        {

            adhaar.setError("it Not a Valid Aadhaar");


        }else if(mobileno.getText().toString().length()!=10)
        {

            mobileno.setError("it's not a Valid Mobile No");


        }
                else  if(pin.getText().toString().length()!=4)
        {

            pin.setError("Enter 4Dig Pin");

        }

        else if(conformpin.getText().toString().length()!=4)


        {

            conformpin.setError("Enter 4Dig Pin");



        }

        else if (!pin.getText().toString().equals(conformpin.getText().toString()))
        {

            conformpin.setError("Miss match PIN");


        }
else
        {
            Intent intent = new Intent(this, OTP.class);

            startActivity(intent);
        }
    }
}
