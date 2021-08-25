package com.example.himkhand;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.google.android.material.bottomsheet.BottomSheetDialog;

public class ArtistStory extends AppCompatActivity {
  ImageView settings;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_artist_story);

         settings = findViewById(R.id.image_settings);

          settings.setOnClickListener(new View.OnClickListener() {
              @Override
              public void onClick(View view) {

              }
          });
              }
}