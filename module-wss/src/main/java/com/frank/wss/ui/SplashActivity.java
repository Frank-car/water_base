package com.frank.wss.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.frank.wss.R;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        new Handler().postDelayed(this::inMain, 3 * 1000);
    }

    private void inMain() {
        startActivity(new Intent(this, MainActivity.class));
        finish();
    }

}