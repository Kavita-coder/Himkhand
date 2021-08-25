package com.example.himkhand.Home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.himkhand.R;

import java.util.ArrayList;

public class HomeFragment extends Fragment {

     RecyclerView recyclerView;
     ArrayList<Home_Model> homeModelArrayList;
     ArrayList<ModelStory> modelStoryArrayList;
     ArrayList<Horizontal_Model> horizontalModelArrayList;
     ArrayList<ModelStory> popularModelArrayList;
     ArrayList<Horizontal_Model> recentSongsModelArrayList;
     ArrayList<ModelStory> albumsModelArrayList;
     ArrayList<Horizontal_Model> popularSongsModelArrayList;
     ArrayList<ModelStory> playListModelArrayList;
     ArrayList<Horizontal_Model> latestSongsModelArrayList;
     ArrayList<Horizontal_Model> newlyLaunchRadioModelArrayList;
     ArrayList<Horizontal_Model> pickYourMoodModelArrayList;
     ArrayList<RadioModel> radioModelArrayList;
     ArrayList<FreshHitsModel> freshHitsModelArrayList;
     ArrayList<ModelPodCast> podCastArrayList;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_home, container,false);
        recyclerView = view.findViewById(R.id.homeMainRecyclerView);

        modelStoryArrayList = new ArrayList<>();
        modelStoryArrayList.add(new ModelStory(R.drawable.story1,"Ad Sheck"));
        modelStoryArrayList.add(new ModelStory(R.drawable.story2,"Giva Johns"));
        modelStoryArrayList.add(new ModelStory(R.drawable.story3,"Adelo Poles"));
        modelStoryArrayList.add(new ModelStory(R.drawable.story4,"Riloz Viz"));
        modelStoryArrayList.add(new ModelStory(R.drawable.story1,"Ad Sheck"));
        modelStoryArrayList.add(new ModelStory(R.drawable.story3,"Giva Johns"));
        modelStoryArrayList.add(new ModelStory(R.drawable.story1,"Adelo Poles"));
        modelStoryArrayList.add(new ModelStory(R.drawable.story2,"Riloz Viz"));


        horizontalModelArrayList = new ArrayList<>();
        horizontalModelArrayList.add(new Horizontal_Model(R.drawable.trending1,"Daises","Ketty Perry"));
        horizontalModelArrayList.add(new Horizontal_Model(R.drawable.trending2,"Lover","Tailor Swift"));
        horizontalModelArrayList.add(new Horizontal_Model(R.drawable.trending3,"Blinding","Dua Lips"));
        horizontalModelArrayList.add(new Horizontal_Model(R.drawable.trending4,"Daises","Ketty Perry"));
        horizontalModelArrayList.add(new Horizontal_Model(R.drawable.trending5,"Lover","Tailor Swift"));
        horizontalModelArrayList.add(new Horizontal_Model(R.drawable.trending1,"Blinding","Dua Lips"));
        horizontalModelArrayList.add(new Horizontal_Model(R.drawable.trending2,"Daises","Ketty Perry"));
        horizontalModelArrayList.add(new Horizontal_Model(R.drawable.trending3,"Lover","Tailor Swift"));


        popularModelArrayList = new ArrayList<>();
        popularModelArrayList.add(new ModelStory(R.drawable.popular1,"Dexys"));
        popularModelArrayList.add(new ModelStory(R.drawable.popular2,"Branigan"));
        popularModelArrayList.add(new ModelStory(R.drawable.popular3,"Laura"));
        popularModelArrayList.add(new ModelStory(R.drawable.popular4,"Michael"));
        popularModelArrayList.add(new ModelStory(R.drawable.popular5,"Dexys"));
        popularModelArrayList.add(new ModelStory(R.drawable.popular1,"Branigan"));
        popularModelArrayList.add(new ModelStory(R.drawable.popular2,"Laura"));
        popularModelArrayList.add(new ModelStory(R.drawable.popular3,"Michael"));


        recentSongsModelArrayList = new ArrayList<>();
        recentSongsModelArrayList.add(new Horizontal_Model(R.drawable.recent1,"Physical", "Dua Lipa"));
        recentSongsModelArrayList.add(new Horizontal_Model(R.drawable.recent2,"Blinding", "Dua Lipa"));
        recentSongsModelArrayList.add(new Horizontal_Model(R.drawable.recent3,"Lover", "Tailor Swift"));
        recentSongsModelArrayList.add(new Horizontal_Model(R.drawable.recent4,"Daises", "Ketty Perry"));
        recentSongsModelArrayList.add(new Horizontal_Model(R.drawable.recent5,"Physical", "Dua Lipa"));
        recentSongsModelArrayList.add(new Horizontal_Model(R.drawable.recent1,"Blinding", "Dua Lipa"));
        recentSongsModelArrayList.add(new Horizontal_Model(R.drawable.recent2,"Lover", "Tailor Swift"));
        recentSongsModelArrayList.add(new Horizontal_Model(R.drawable.recent3,"Daises", "Ketty Perry"));


        albumsModelArrayList = new ArrayList<>();
        albumsModelArrayList.add(new ModelStory(R.drawable.albums1,"Crosby"));
        albumsModelArrayList.add(new ModelStory(R.drawable.albums2,"Martha"));
        albumsModelArrayList.add(new ModelStory(R.drawable.albums3,"Brandy"));
        albumsModelArrayList.add(new ModelStory(R.drawable.albums4,"Sharona"));
        albumsModelArrayList.add(new ModelStory(R.drawable.albums5,"Crosby"));
        albumsModelArrayList.add(new ModelStory(R.drawable.albums1,"Martha"));
        albumsModelArrayList.add(new ModelStory(R.drawable.albums2,"Brandy"));
        albumsModelArrayList.add(new ModelStory(R.drawable.albums3,"Sharona"));


        popularSongsModelArrayList = new ArrayList<>();
        popularSongsModelArrayList.add(new Horizontal_Model(R.drawable.popularsong1,"Physical", "Dua Lipa"));
        popularSongsModelArrayList.add(new Horizontal_Model(R.drawable.popularsong2,"Blinding", "Dua Lipa"));
        popularSongsModelArrayList.add(new Horizontal_Model(R.drawable.popularsong3,"Lover", "Tailor Swift"));
        popularSongsModelArrayList.add(new Horizontal_Model(R.drawable.popularsong4,"Daises", "Ketty Perry"));
        popularSongsModelArrayList.add(new Horizontal_Model(R.drawable.popularsong1,"Physical", "Dua Lipa"));
        popularSongsModelArrayList.add(new Horizontal_Model(R.drawable.popularsong2,"Blinding", "Dua Lipa"));


        playListModelArrayList = new ArrayList<>();
        playListModelArrayList.add(new ModelStory(R.drawable.playlist1,"Billie"));
        playListModelArrayList.add(new ModelStory(R.drawable.playlist2,"Derek"));
        playListModelArrayList.add(new ModelStory(R.drawable.playlis3,"Rita"));
        playListModelArrayList.add(new ModelStory(R.drawable.playlist4,"Layal"));
        playListModelArrayList.add(new ModelStory(R.drawable.playlist1,"Billie"));
        playListModelArrayList.add(new ModelStory(R.drawable.playlist2,"Rita"));
        playListModelArrayList.add(new ModelStory(R.drawable.playlis3,"Laura"));
        playListModelArrayList.add(new ModelStory(R.drawable.playlist4,"Layla"));


        latestSongsModelArrayList = new ArrayList<>();
        latestSongsModelArrayList.add(new Horizontal_Model(R.drawable.trending1,"Daises","Ketty Perry"));
        latestSongsModelArrayList.add(new Horizontal_Model(R.drawable.trending2,"Lover","Tailor Swift"));
        latestSongsModelArrayList.add(new Horizontal_Model(R.drawable.trending3,"Blinding","Dua Lips"));
        latestSongsModelArrayList.add(new Horizontal_Model(R.drawable.trending4,"Daises","Ketty Perry"));
        latestSongsModelArrayList.add(new Horizontal_Model(R.drawable.trending5,"Lover","Tailor Swift"));
        latestSongsModelArrayList.add(new Horizontal_Model(R.drawable.trending1,"Blinding","Dua Lips"));
        latestSongsModelArrayList.add(new Horizontal_Model(R.drawable.trending2,"Daises","Ketty Perry"));
        latestSongsModelArrayList.add(new Horizontal_Model(R.drawable.trending3,"Lover","Tailor Swift"));



        newlyLaunchRadioModelArrayList = new ArrayList<>();
        newlyLaunchRadioModelArrayList.add(new Horizontal_Model(R.drawable.popularsong1,"Daises","Ketty Perry"));
        newlyLaunchRadioModelArrayList.add(new Horizontal_Model(R.drawable.popularsong2,"Lover","Tailor Swift"));
        newlyLaunchRadioModelArrayList.add(new Horizontal_Model(R.drawable.popularsong3,"Blinding","Dua Lips"));
        newlyLaunchRadioModelArrayList.add(new Horizontal_Model(R.drawable.popularsong4,"Daises","Ketty Perry"));
        newlyLaunchRadioModelArrayList.add(new Horizontal_Model(R.drawable.popularsong1,"Lover","Tailor Swift"));
        newlyLaunchRadioModelArrayList.add(new Horizontal_Model(R.drawable.popularsong3,"Blinding","Dua Lips"));



        pickYourMoodModelArrayList = new ArrayList<>();
        pickYourMoodModelArrayList.add(new Horizontal_Model(R.drawable.login_bg,"Daises","Ketty Perry"));
        pickYourMoodModelArrayList.add(new Horizontal_Model(R.drawable.trending1,"Lover","Tailor Swift"));
        pickYourMoodModelArrayList.add(new Horizontal_Model(R.drawable.trending5,"Blinding","Dua Lips"));
        pickYourMoodModelArrayList.add(new Horizontal_Model(R.drawable.popularsong2,"Daises","Ketty Perry"));
        pickYourMoodModelArrayList.add(new Horizontal_Model(R.drawable.popularsong3,"Lover","Tailor Swift"));


        radioModelArrayList = new ArrayList<>();
        radioModelArrayList.add(new RadioModel(R.drawable.login_bg,"72.9 FM","Chartbuster"));
        radioModelArrayList.add(new RadioModel(R.drawable.trending1,"92.6 FM","Chartbuster"));
        radioModelArrayList.add(new RadioModel(R.drawable.trending5,"80.0 FM","Chartbuster"));
        radioModelArrayList.add(new RadioModel(R.drawable.popularsong2,"90.6 FM","Chartbuster"));
        radioModelArrayList.add(new RadioModel(R.drawable.popularsong3,"98.4 FM","Chartbuster"));


        freshHitsModelArrayList = new ArrayList<>();
        freshHitsModelArrayList.add(new FreshHitsModel(R.drawable.trending1,"Oxygen","Robin Schulz"));
        freshHitsModelArrayList.add(new FreshHitsModel(R.drawable.trending3,"Oxygen","Oxygen"));
        freshHitsModelArrayList.add(new FreshHitsModel(R.drawable.trending5,"Oxygen","Oxygen"));
        freshHitsModelArrayList.add(new FreshHitsModel(R.drawable.trending4,"Oxygen","Oxygen"));


        podCastArrayList = new ArrayList<>();
        podCastArrayList.add(new ModelPodCast(R.drawable.login_bg,"Don Dabio","Thousand Faces", "2,75,269", "Monthly Listeners", "1"));
        podCastArrayList.add(new ModelPodCast(R.drawable.login_bg,"Don Dabio","Thousand Faces", "2,75,269", "Monthly Listeners", "1"));
        podCastArrayList.add(new ModelPodCast(R.drawable.login_bg,"Don Dabio","Thousand Faces", "2,75,269", "Monthly Listeners", "1"));
        podCastArrayList.add(new ModelPodCast(R.drawable.login_bg,"Don Dabio","Thousand Faces", "2,75,269", "Monthly Listeners", "1"));
        podCastArrayList.add(new ModelPodCast(R.drawable.login_bg,"Don Dabio","Thousand Faces", "2,75,269", "Monthly Listeners", "1"));



        homeModelArrayList = new ArrayList<>();
        homeModelArrayList.add(new Home_Model(0,modelStoryArrayList));
        homeModelArrayList.add(new Home_Model(1,"Trending Songs",horizontalModelArrayList));
        homeModelArrayList.add(new Home_Model(2,"Popular Artists",popularModelArrayList,R.color.background_color));
        homeModelArrayList.add(new Home_Model(1,"Recent Songs",recentSongsModelArrayList));
        homeModelArrayList.add(new Home_Model(4,"Fresh Hits",freshHitsModelArrayList, R.color.bgColor,1));
        homeModelArrayList.add(new Home_Model(2,"Albums",albumsModelArrayList,R.color.background_color));
        homeModelArrayList.add(new Home_Model(5,"Popular Podcast",podCastArrayList,R.color.background_color, 1, 1,1));
        homeModelArrayList.add(new Home_Model(1,"Popular Songs",popularSongsModelArrayList));
        homeModelArrayList.add(new Home_Model(2,"Playlists For You",playListModelArrayList, R.color.background_color));
        homeModelArrayList.add(new Home_Model(1,"Latest Songs",latestSongsModelArrayList));
        homeModelArrayList.add(new Home_Model(3,"Recommended Radio",radioModelArrayList, 1, 1, 1));
        homeModelArrayList.add(new Home_Model(1,"Newly Launched",newlyLaunchRadioModelArrayList));
        homeModelArrayList.add(new Home_Model(1,"Pick Your Mood",pickYourMoodModelArrayList));




        HomeAdapter homeAdapter = new HomeAdapter(getContext(), homeModelArrayList);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getContext());
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(homeAdapter);
        homeAdapter.notifyDataSetChanged();

        return view;
    }
}
