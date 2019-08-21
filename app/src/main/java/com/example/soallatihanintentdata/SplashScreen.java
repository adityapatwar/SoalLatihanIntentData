package com.example.soallatihanintentdata;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ProgressBar;

public class SplashScreen extends AppCompatActivity {

    private int waktu_loading=2000;
    int test;
    ProgressBar prb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_splash_screen);

        prb = (ProgressBar) findViewById(R.id.progressbar);

        new Handler ().postDelayed(new Runnable() {
            @Override
            public void run() {

                Intent home=new Intent(SplashScreen.this, MainActivity.class);
                startActivity(home);
                finish();

            }
        },waktu_loading);
    }
}
