package com.example.somesh.mypay;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MobileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mobile);
    }

    public void proceed(View view){
        Intent proceedIntent = new Intent(this, ProceedActivity.class);
        startActivity(proceedIntent);

    }
}
