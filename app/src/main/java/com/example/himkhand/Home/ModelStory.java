package com.example.himkhand.Home;

public class ModelStory {
    int Image;
    String Textview;

    public ModelStory(int image, String textview) {
        Image = image;
        Textview = textview;
    }

    public int getImage() {
        return Image;
    }

    public void setImage(int image) {
        Image = image;
    }

    public String getTextview() {
        return Textview;
    }

    public void setTextview(String textview) {
        Textview = textview;
    }
}
