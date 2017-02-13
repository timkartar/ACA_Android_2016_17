package com.example.somesh.mypay;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openMobile (View view) {
        Intent i = new Intent(this, MobileActivity.class);
        startActivity(i);
    }

    public void openDth (View view) {
        Intent i2 = new Intent(this, DthActivity.class);
        startActivity(i2);
    }

    public void openLandline (View view) {
        Intent i3 = new Intent(this, LandlineActivity.class);
        startActivity(i3);
    }

    public void openDatacard (View view) {
        Intent i4 = new Intent(this, DatacardActivity.class);
        startActivity(i4);
    }
}