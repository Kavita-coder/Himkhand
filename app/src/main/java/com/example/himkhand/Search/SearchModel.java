package com.example.himkhand.Search;

import com.example.himkhand.Home.FreshHitsModel;
import com.example.himkhand.Home.Horizontal_Model;
import com.example.himkhand.Home.ModelStory;
import com.example.himkhand.Home.RadioModel;

import java.util.ArrayList;

public class SearchModel {

    private int type;

    public static final int SEARCH_HORIZONTAL_LAYOUT = 0;
    public static final int SEARCH_POPULAR_LAYOUT = 1;
    public static final int SEARCH_RECOM_RADIO_LAYOUT = 2;
    public static final int SEARCH_FRESH_HITS_LAYOUT = 3;

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }


    //Horizontal Model
    private String title_name;
    private ArrayList<Horizontal_Model> horizontalModelArrayList;

    public SearchModel(int type, String title_name, ArrayList<Horizontal_Model> horizontalModelArrayList) {
        this.type = type;
        this.title_name = title_name;
        this.horizontalModelArrayList = horizontalModelArrayList;
    }

    public String getTitle_name() {
        return title_name;
    }

    public void setTitle_name(String title_name) {
        this.title_name = title_name;
    }

    public ArrayList<Horizontal_Model> getHorizontalModelArrayList() {
        return horizontalModelArrayList;
    }

    public void setHorizontalModelArrayList(ArrayList<Horizontal_Model> horizontalModelArrayList) {
        this.horizontalModelArrayList = horizontalModelArrayList;
    }

    //Popular
    private String popular_title;
    private ArrayList<ModelStory> popularArtistArrayList;
    int backgroundcolor;

    public SearchModel(int type, String popular_title, ArrayList<ModelStory> popularArtistArrayList, int backgroundcolor) {
        this.type = type;
        this.popular_title = popular_title;
        this.popularArtistArrayList = popularArtistArrayList;
        this.backgroundcolor = backgroundcolor;
    }

    public String getPopular_title() {
        return popular_title;
    }

    public void setPopular_title(String popular_title) {
        this.popular_title = popular_title;
    }

    public ArrayList<ModelStory> getPopularArtistArrayList() {
        return popularArtistArrayList;
    }

    public void setPopularArtistArrayList(ArrayList<ModelStory> popularArtistArrayList) {
        this.popularArtistArrayList = popularArtistArrayList;
    }

    public int getBackgroundcolor() {
        return backgroundcolor;
    }

    public void setBackgroundcolor(int backgroundcolor) {
        this.backgroundcolor = backgroundcolor;
    }

    //Recommended Radio

    private String radio_title;
    private ArrayList<RadioModel> radioModelArrayList;

    public SearchModel(int type, String radio_title, ArrayList<RadioModel> radioModelArrayList, int data, int data1) {
        this.type = type;
        this.radio_title = radio_title;
        this.radioModelArrayList = radioModelArrayList;
    }

    public String getRadio_title() {
        return radio_title;
    }

    public void setRadio_title(String radio_title) {
        this.radio_title = radio_title;
    }

    public ArrayList<RadioModel> getRadioModelArrayList() {
        return radioModelArrayList;
    }

    public void setRadioModelArrayList(ArrayList<RadioModel> radioModelArrayList) {
        this.radioModelArrayList = radioModelArrayList;
    }
    //Fresh Hits

    private String fresh_hits_title;
    private ArrayList<FreshHitsModel> freshHitsModelArrayList;

    public SearchModel(int type, String fresh_hits_title, ArrayList<FreshHitsModel> freshHitsModelArrayList, int data, int data1, int data2) {
        this.type = type;
        this.fresh_hits_title = fresh_hits_title;
        this.freshHitsModelArrayList = freshHitsModelArrayList;
    }

    public String getFresh_hits_title() {
        return fresh_hits_title;
    }

    public void setFresh_hits_title(String fresh_hits_title) {
        this.fresh_hits_title = fresh_hits_title;
    }

    public ArrayList<FreshHitsModel> getFreshHitsModelArrayList() {
        return freshHitsModelArrayList;
    }

    public void setFreshHitsModelArrayList(ArrayList<FreshHitsModel> freshHitsModelArrayList) {
        this.freshHitsModelArrayList = freshHitsModelArrayList;
    }
}
