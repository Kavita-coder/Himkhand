package com.example.himkhand.Search;

import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.himkhand.Home.FreshHitsModel;
import com.example.himkhand.Home.HomeAdapter;
import com.example.himkhand.Home.Home_Model;
import com.example.himkhand.Home.Horizontal_Model;
import com.example.himkhand.Home.ModelStory;
import com.example.himkhand.Home.RadioModel;
import com.example.himkhand.R;

import java.util.ArrayList;

public class SearchFragment extends Fragment {

    RecyclerView recyclerView;
    ArrayList<SearchModel> searchModelArrayList;
    ArrayList<Horizontal_Model> horizontalModelArrayList;
    ArrayList<ModelStory> popularModelArrayList;
    ArrayList<Horizontal_Model> recentSongsModelArrayList;
    ArrayList<RadioModel> searchRadioModelArrayList;
    ArrayList<FreshHitsModel> freshHitsModelArrayList;
    ArrayList<ModelStory> albumsModelArrayList;
    ArrayList<Horizontal_Model> popularSongsModelArrayList;
    ArrayList<ModelStory> playListModelArrayList;
    ArrayList<Horizontal_Model> latestSongsModelArrayList;
    ArrayList<Horizontal_Model> newlyLaunchRadioModelArrayList;
    ArrayList<Horizontal_Model> pickYourMoodModelArrayList;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_search, container, false);
        EditText editSearch;
        editSearch= view.findViewById((R.id.edt_search));
        editSearch.requestFocus();
        editSearch.setTextColor(Color.BLACK);

        recyclerView = view.findViewById(R.id.searchMainRecyclerView);

        horizontalModelArrayList = new ArrayList<>();
        horizontalModelArrayList.add(new Horizontal_Model(R.drawable.trending1, "Daises", "Ketty Perry"));
        horizontalModelArrayList.add(new Horizontal_Model(R.drawable.trending2, "Lover", "Tailor Swift"));
        horizontalModelArrayList.add(new Horizontal_Model(R.drawable.trending3, "Blinding", "Dua Lips"));
        horizontalModelArrayList.add(new Horizontal_Model(R.drawable.trending4, "Daises", "Ketty Perry"));
        horizontalModelArrayList.add(new Horizontal_Model(R.drawable.trending5, "Lover", "Tailor Swift"));
        horizontalModelArrayList.add(new Horizontal_Model(R.drawable.trending1, "Blinding", "Dua Lips"));
        horizontalModelArrayList.add(new Horizontal_Model(R.drawable.trending2, "Daises", "Ketty Perry"));
        horizontalModelArrayList.add(new Horizontal_Model(R.drawable.trending3, "Lover", "Tailor Swift"));

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

        searchRadioModelArrayList = new ArrayList<>();
        searchRadioModelArrayList.add(new RadioModel(R.drawable.login_bg,"72.9 FM","Chartbuster"));
        searchRadioModelArrayList.add(new RadioModel(R.drawable.trending1,"92.6 FM","Chartbuster"));
        searchRadioModelArrayList.add(new RadioModel(R.drawable.trending5,"80.0 FM","Chartbuster"));
        searchRadioModelArrayList.add(new RadioModel(R.drawable.popularsong2,"90.6 FM","Chartbuster"));
        searchRadioModelArrayList.add(new RadioModel(R.drawable.popularsong3,"98.4 FM","Chartbuster"));


        freshHitsModelArrayList = new ArrayList<>();
        freshHitsModelArrayList.add(new FreshHitsModel(R.drawable.trending1,"Oxygen","Robin Schulz"));
        freshHitsModelArrayList.add(new FreshHitsModel(R.drawable.trending3,"Oxygen","Oxygen"));
        freshHitsModelArrayList.add(new FreshHitsModel(R.drawable.trending5,"Oxygen","Oxygen"));
        freshHitsModelArrayList.add(new FreshHitsModel(R.drawable.trending4,"Oxygen","Oxygen"));

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


        searchModelArrayList = new ArrayList<>();
        searchModelArrayList.add(new SearchModel(0,"Trending Songs",horizontalModelArrayList));
        searchModelArrayList.add(new SearchModel(1,"Popular Artists",popularModelArrayList,R.color.bgColor));
        searchModelArrayList.add(new SearchModel(0,"Recent Songs",recentSongsModelArrayList));
        searchModelArrayList.add(new SearchModel(3,"Fresh Hits",freshHitsModelArrayList, R.color.bgColor,1,1));
        searchModelArrayList.add(new SearchModel(1,"Albums",albumsModelArrayList,R.color.background_color));
        searchModelArrayList.add(new SearchModel(0,"Popular Songs",popularSongsModelArrayList));
        searchModelArrayList.add(new SearchModel(1,"Playlists For You",playListModelArrayList, R.color.background_color));
        searchModelArrayList.add(new SearchModel(0,"Latest Songs",latestSongsModelArrayList));
        searchModelArrayList.add(new SearchModel(2,"Recommended Radio",searchRadioModelArrayList, 1, 1));
        searchModelArrayList.add(new SearchModel(0,"Newly Launched",newlyLaunchRadioModelArrayList));
        searchModelArrayList.add(new SearchModel(0,"Pick Your Mood",pickYourMoodModelArrayList));


        SearchAdapter searchAdapter = new SearchAdapter(getContext(), searchModelArrayList);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getContext());
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(searchAdapter);
        searchAdapter.notifyDataSetChanged();

        return view;
    }

}
