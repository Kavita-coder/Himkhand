package com.example.himkhand;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.app.Dialog;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.Toast;

import com.example.himkhand.Home.HomeFragment;
import com.example.himkhand.Search.SearchFragment;

import com.example.jean.jcplayer.JcAudio;
import com.example.jean.jcplayer.JcPlayerView;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.io.IOException;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    BottomNavigationView bottomNavigation;
    MediaPlayer player;
    JcPlayerView jcplayerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        jcplayerView = (JcPlayerView) findViewById(R.id.jcPlayer);

        ArrayList<JcAudio> jcAudios = new ArrayList<>();

     // jcAudios.add(JcAudio.createFromURL("url audio","http://xxx/audio.mp3"));
       // jcAudios.add(JcAudio.createFromAssets("Asset audio", "audio.mp3"));
        jcAudios.add(JcAudio.createFromRaw("Raw audio", R.raw.kithe));
        jcplayerView.initPlaylist(jcAudios);

        jcplayerView.createNotification(R.drawable.login_bg);

        bottomNavigation = findViewById(R.id.bottom_navigation);
        bottomNavigation.setOnNavigationItemSelectedListener(navListener);

        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                new HomeFragment()).commit();
    }

    private BottomNavigationView.OnNavigationItemSelectedListener navListener =
            new BottomNavigationView.OnNavigationItemSelectedListener() {
                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                    Fragment selectedFragment = null;

                    switch (item.getItemId()) {
                        case R.id.navigation_home:
                            selectedFragment = new HomeFragment();
                            break;
                        case R.id.navigation_search:
                            selectedFragment = new SearchFragment();
                            break;
                        case R.id.navigation_discover:
                            selectedFragment = new DiscoverFragment();
                            break;
                        case R.id.my_library:
                            selectedFragment = new MyLibraryFragment();
                            break;
                    }
                    getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, selectedFragment).commit();
                    return true;
                }
            };
    //    @Override
//    public void onBackPressed() {
//
//        Dialog dialog =new Dialog(this);
//        dialog.setContentView(R.layout.layout_dialog);
//        dialog.setCancelable(true);
//        dialog.getWindow().setLayout(WindowManager.LayoutParams.MATCH_PARENT,WindowManager.LayoutParams.WRAP_CONTENT);
//        dialog.show();
//    }
}