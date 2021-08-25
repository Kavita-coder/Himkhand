package com.example.himkhand.Auth;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.himkhand.ChooseArtists;
import com.example.himkhand.R;

public class CreateUserAccount extends AppCompatActivity {
    TextView tv_userSkip;
    ImageView img_arrowBack;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_user_account);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        //This method will cover the entire Screen.

        img_arrowBack = findViewById(R.id.image_back);
        img_arrowBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), ChooseArtists.class));
            }
        });

        tv_userSkip = findViewById(R.id.tv_create_user_skip);
        tv_userSkip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), ChooseArtists.class));
            }
        });
    }
}