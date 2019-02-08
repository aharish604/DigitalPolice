package com.example.digitalpolice;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {

    EditText adhaar, pin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        adhaar = findViewById(R.id.login_adhaar);
        pin = findViewById(R.id.login_pin);
    }


    public void register(View view) {
        Intent intent = new Intent(this, Register.class);
        startActivity(intent);
    }

    public void login(View view) {
        if (adhaar.getText().toString().length() != 12) {
            adhaar.setError("Enter Aadharr");
        } else if (pin.getText().toString().length() != 4) {
            pin.setError("Enter Pin");
        } else {
            Intent intent = new Intent(this, HOME.class);
            startActivity(intent);
        }
    }

    public void forget(View view) {
        Intent intent = new Intent(this, Forgetpassword.class);
        startActivity(intent);
    }
}
