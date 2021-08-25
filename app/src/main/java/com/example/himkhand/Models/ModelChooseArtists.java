package com.example.himkhand.Models;

import android.widget.ImageView;

public class ModelChooseArtists {

    public boolean isSelectd;
    private int ImageChooseArtist;
    private String tvArtistName;

    public boolean isSelectd() {
        return isSelectd;
    }

    public void setSelectd(Boolean selectd) {
        isSelectd = selectd;
    }

    public void getSelectd(Boolean selectd) {
        isSelectd = selectd;
    }

    public ModelChooseArtists(Boolean isSelectd) {
        this.isSelectd = isSelectd;

    }

    public ModelChooseArtists(int imageChooseArtist, String tvArtistName) {
        ImageChooseArtist = imageChooseArtist;
        this.tvArtistName = tvArtistName;
    }

    public int getImageChooseArtist() {
        return ImageChooseArtist;
    }

    public void setImageChooseArtist(int imageChooseArtist) {
        ImageChooseArtist = imageChooseArtist;
    }

    public String getTvArtistName() {
        return tvArtistName;
    }

    public void setTvArtistName(String tvArtistName) {
        this.tvArtistName = tvArtistName;
    }

}

