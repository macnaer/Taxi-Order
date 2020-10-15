package com.example.taxiorder;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class ChooseActivityMode extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_mode);
    }

    public void goToPassengerSignIn(View view) {
        startActivity(new Intent(
                ChooseActivityMode.this,
                PassengerSignInActivity.class
        ));
    }

    public void goToDriverSignIn(View view) {
        startActivity(new Intent(
                ChooseActivityMode.this,
                DriverSignInActivity.class
        ));
    }
}