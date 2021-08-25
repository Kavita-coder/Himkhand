package com.example.himkhand.Home;


import java.util.ArrayList;

public class Home_Model {

    private int type;
    public static final int STORY_LAYOUT = 0;
    public static final int HORIZONTAL_LAYOUT = 1;
    public static final int POPULAR_LAYOUT = 2;
    public static final int RECOM_RADIO_LAYOUT = 3;
    public static final int FRESH_HITS_LAYOUT = 4;
    public static final int POPULAR_PODCAST_LAYOUT = 5;


    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

// model

    private ArrayList<ModelStory> modelStoryArrayList;

    public Home_Model(int type, ArrayList<ModelStory> modelStoryArrayList) {
        this.type = type;
        this.modelStoryArrayList = modelStoryArrayList;
    }

    public ArrayList<ModelStory> getModelStoryArrayList() {
        return modelStoryArrayList;
    }

    public void setModelStoryArrayList(ArrayList<ModelStory> modelStoryArrayList) {
        this.modelStoryArrayList = modelStoryArrayList;
    }


    // horizontal

    private String title_name;
    private ArrayList<Horizontal_Model> horizontalModelArrayList;

    public Home_Model(int type, String title_name, ArrayList<Horizontal_Model> horizontalModelArrayList) {
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


    //popular
    private String popular_title;
    private ArrayList<ModelStory> popularArtistArrayList;
    private int backgroundColor;

    public Home_Model(int type, String popular_title, ArrayList<ModelStory> popularArtistArrayList, int backgroundColor) {
        this.type = type;
        this.popular_title = popular_title;
        this.popularArtistArrayList = popularArtistArrayList;
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


    // recommended radio

    private String radio_title;
    private ArrayList<RadioModel> radioModelArrayList;
    private int data;

    public Home_Model(int type, String radio_title, ArrayList<RadioModel> radioModelArrayList, int data, int data2, int data3) {
        this.type = type;
        this.radio_title = radio_title;
        this.radioModelArrayList = radioModelArrayList;
        this.data = data;
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

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }


    //fresh hits

    private String fresh_hits_title;
    private ArrayList<FreshHitsModel> freshHitsArrayList;
    private int bgColor;

    public Home_Model(int type, String fresh_hits_title, ArrayList<FreshHitsModel> freshHitsArrayList, int bgColor, int data) {
        this.type = type;
        this.fresh_hits_title = fresh_hits_title;
        this.freshHitsArrayList = freshHitsArrayList;
        this.bgColor = bgColor;
    }

    public String getFresh_hits_title() {
        return fresh_hits_title;
    }

    public void setFresh_hits_title(String fresh_hits_title) {
        this.fresh_hits_title = fresh_hits_title;
    }

    public ArrayList<FreshHitsModel> getFreshHitsArrayList() {
        return freshHitsArrayList;
    }

    public void setFreshHitsArrayList(ArrayList<FreshHitsModel> freshHitsArrayList) {
        this.freshHitsArrayList = freshHitsArrayList;
    }

    public int getBgColor() {
        return bgColor;
    }

    public void setBgColor(int bgColor) {
        this.bgColor = bgColor;
    }


    //Popular Podcast

    private String popular_podcast_title;
    private ArrayList<ModelPodCast> modelPodCastArrayList;

    public static int getStoryLayout() {
        return STORY_LAYOUT;
    }

    public String getPopular_podcast_title() {
        return popular_podcast_title;
    }

    public void setPopular_podcast_title(String popular_podcast_title) {
        this.popular_podcast_title = popular_podcast_title;
    }

    public ArrayList<ModelPodCast> getModelPodCastArrayList() {
        return modelPodCastArrayList;
    }

    public void setModelPodCastArrayList(ArrayList<ModelPodCast> modelPodCastArrayList) {
        this.modelPodCastArrayList = modelPodCastArrayList;
    }

    public Home_Model(int type, String popular_podcast_title, ArrayList<ModelPodCast> modelPodCastArrayList, int data, int data2, int data3, int data4) {
        this.type = type;
        this.popular_podcast_title = popular_podcast_title;
        this.modelPodCastArrayList = modelPodCastArrayList;


    }
}