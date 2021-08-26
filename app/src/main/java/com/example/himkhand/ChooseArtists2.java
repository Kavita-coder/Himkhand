package com.example.himkhand;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.himkhand.Adapters.AdapterArtist2;
import com.example.himkhand.Adapters.AdapterChooseArtist;
import com.example.himkhand.Models.ArtistModel;
import com.example.himkhand.Models.ModelChooseArtists;

import java.util.ArrayList;

public class ChooseArtists2 extends AppCompatActivity {
    RecyclerView recyclerView;
    private AdapterArtist2 adapterArtist2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_artists2);

        recyclerView = findViewById(R.id.recyclerview_artist);
        ArrayList<ArtistModel> artistModelArrayList = new ArrayList<>();

        artistModelArrayList.add(new ArtistModel(R.drawable.trending1, R.drawable.settings_verticle, "Jazbat", "7,084"));
        artistModelArrayList.add(new ArtistModel(R.drawable.trending2, R.drawable.settings_verticle, "Jazbat", "7,084"));
        artistModelArrayList.add(new ArtistModel(R.drawable.trending3, R.drawable.settings_verticle, "Jazbat", "7,084"));
        artistModelArrayList.add(new ArtistModel(R.drawable.trending4, R.drawable.settings_verticle, "Jazbat", "7,084"));
        artistModelArrayList.add(new ArtistModel(R.drawable.login_bg, R.drawable.settings_verticle, "Jazbat", "7,084"));
        artistModelArrayList.add(new ArtistModel(R.drawable.trending1, R.drawable.settings_verticle, "Jazbat", "7,084"));
        artistModelArrayList.add(new ArtistModel(R.drawable.trending2, R.drawable.settings_verticle, "Jazbat", "7,084"));
        artistModelArrayList.add(new ArtistModel(R.drawable.trending3, R.drawable.settings_verticle, "Jazbat", "7,084"));
        artistModelArrayList.add(new ArtistModel(R.drawable.trending4, R.drawable.settings_verticle, "Jazbat", "7,084"));


        adapterArtist2 = new AdapterArtist2(this, artistModelArrayList);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(RecyclerView.VERTICAL);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(adapterArtist2);



    }
}