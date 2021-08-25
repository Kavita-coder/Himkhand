package com.example.himkhand.Home;

public class RadioModel {

    int imageRadio;
    String tvRadio, tvRadioName;

    public RadioModel(int imageRadio, String tvRadio, String tvRadioName) {
        this.imageRadio = imageRadio;
        this.tvRadio = tvRadio;
        this.tvRadioName = tvRadioName;
    }

    public int getImageRadio() {
        return imageRadio;
    }

    public void setImageRadio(int imageRadio) {
        this.imageRadio = imageRadio;
    }

    public String getTvRadio() {
        return tvRadio;
    }

    public void setTvRadio(String tvRadio) {
        this.tvRadio = tvRadio;
    }

    public String getTvRadioName() {
        return tvRadioName;
    }

    public void setTvRadioName(String tvRadioName) {
        this.tvRadioName = tvRadioName;
    }
}
