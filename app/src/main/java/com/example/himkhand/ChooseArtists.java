package com.example.himkhand;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.himkhand.Adapters.AdapterChooseArtist;
import com.example.himkhand.Interfaces.ChooseArtistListener;
import com.example.himkhand.Auth.CreateAccount;
import com.example.himkhand.Models.ModelChooseArtists;

import java.util.ArrayList;

public class ChooseArtists extends AppCompatActivity implements ChooseArtistListener {
    private RecyclerView recyclerView;
    Button btn_next;
    TextView tv_skip;
    ImageView imgback;
    private AdapterChooseArtist adapterChooseArtist;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_artists);

        btn_next = findViewById(R.id.btn_next);
        tv_skip = findViewById(R.id.tvSkip);
        imgback = findViewById(R.id.image_back);
        recyclerView = findViewById(R.id.recyclerview);
        ArrayList<ModelChooseArtists> chooseArtists = new ArrayList<>();

        chooseArtists.add(new ModelChooseArtists(R.drawable.login_bg, "Shkaira1"));
        chooseArtists.add(new ModelChooseArtists(R.drawable.login_bg, "Shkaira2"));
        chooseArtists.add(new ModelChooseArtists(R.drawable.login_bg, "Shkaira3"));
        chooseArtists.add(new ModelChooseArtists(R.drawable.login_bg, "Shkaira4"));
        chooseArtists.add(new ModelChooseArtists(R.drawable.login_bg, "Shkaira5"));
        chooseArtists.add(new ModelChooseArtists(R.drawable.login_bg, "Shkaira5"));
        chooseArtists.add(new ModelChooseArtists(R.drawable.login_bg, "Shkaira5"));
        chooseArtists.add(new ModelChooseArtists(R.drawable.login_bg, "Shkaira5"));
        chooseArtists.add(new ModelChooseArtists(R.drawable.login_bg, "Shkaira5"));
        chooseArtists.add(new ModelChooseArtists(R.drawable.login_bg, "Shkaira5"));

        adapterChooseArtist = new AdapterChooseArtist(this, chooseArtists);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this, 4);
        gridLayoutManager.setOrientation(RecyclerView.VERTICAL);
        recyclerView.setLayoutManager(gridLayoutManager);
        recyclerView.setAdapter(adapterChooseArtist);

        imgback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ChooseArtists.this, CreateAccount.class));
            }
        });

        tv_skip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ChooseArtists.this, ChooseArtists2.class));
            }
        });

        btn_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ChooseArtists.this, MainActivity.class));
            }
        });
    }

    @Override
    public void onArtistsAction(Boolean isSelected) {

    }
}
