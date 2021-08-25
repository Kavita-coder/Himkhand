package com.example.himkhand.Auth;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

import com.example.himkhand.ChooseArtists;
import com.example.himkhand.R;
import com.google.firebase.auth.FirebaseAuth;

public class CreateAccount extends AppCompatActivity {
 Button btn_create_Account, btn_signin_google;
 FirebaseAuth auth;
 TextView tv_skip, tv_signIn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_account);

        auth = FirebaseAuth.getInstance();
        tv_signIn = findViewById(R.id.tv_sign_in);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        //This method will cover the entire Screen.
        tv_skip = findViewById(R.id.tv_create_skip);
        btn_create_Account = findViewById(R.id.btn_create_account);
        btn_signin_google = findViewById(R.id.btn_sign_in_google);

        tv_signIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(CreateAccount.this, LoginActivity.class));
            }
        });

        tv_skip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), ChooseArtists.class));
            }
        });

        btn_signin_google.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(CreateAccount.this, GoogleSignInActivity.class));
            }
        });

        btn_create_Account.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(CreateAccount.this, SignUpActivity.class));
                //Start Intent for switching to next activity.
            }
        });
    }
}