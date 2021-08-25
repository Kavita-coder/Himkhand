package com.example.himkhand.Home;

import android.widget.ImageView;
import android.widget.TextView;

public class Horizontal_Model {
    int imageView;
    String tv_trend, textView;

    public Horizontal_Model(int imageView, String tv_trend, String textView) {
        this.imageView = imageView;
        this.tv_trend = tv_trend;
        this.textView = textView;
    }

    public int getImageView() {
        return imageView;
    }

    public void setImageView(int imageView) {
        this.imageView = imageView;
    }

    public String getTv_trend() {
        return tv_trend;
    }

    public void setTv_trend(String tv_trend) {
        this.tv_trend = tv_trend;
    }

    public String getTextView() {
        return textView;
    }

    public void setTextView(String textView) {
        this.textView = textView;
    }
}
