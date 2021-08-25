package com.example.himkhand.Models;

public class ArtistModel {
    int imageArtist, imgSettings;
    String tvSongName, tvListeners;

    public ArtistModel(int imageArtist, int imgSettings, String tvSongName, String tvListeners) {
        this.imageArtist = imageArtist;
        this.imgSettings = imgSettings;
        this.tvSongName = tvSongName;
        this.tvListeners = tvListeners;
    }

    public int getImageArtist() {
        return imageArtist;
    }

    public void setImageArtist(int imageArtist) {
        this.imageArtist = imageArtist;
    }

    public int getImgSettings() {
        return imgSettings;
    }

    public void setImgSettings(int imgSettings) {
        this.imgSettings = imgSettings;
    }

    public String getTvSongName() {
        return tvSongName;
    }

    public void setTvSongName(String tvSongName) {
        this.tvSongName = tvSongName;
    }

    public String getTvListeners() {
        return tvListeners;
    }

    public void setTvListeners(String tvListeners) {
        this.tvListeners = tvListeners;
    }
}
