package com.example.himkhand.Auth;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;

import com.example.himkhand.Auth.CreateAccount;
import com.example.himkhand.R;

public class SplashActivity extends AppCompatActivity {
    private static int SPLASH_SCREEN_TIME_OUT=3000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        //This method will cover the entire Screen.


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
               Intent i=new Intent(getApplicationContext(), CreateAccount.class);
               //Creating Intent
                startActivity(i);
                //starting Intent
                finish();
            }
        }, SPLASH_SCREEN_TIME_OUT);


    }
}