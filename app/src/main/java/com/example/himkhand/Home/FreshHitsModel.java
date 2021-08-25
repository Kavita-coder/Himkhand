package com.example.himkhand.Home;

public class FreshHitsModel {

    int artistPic;
    String songName, artistName;

    public FreshHitsModel(int artistPic, String songName, String artistName) {
        this.artistPic = artistPic;
        this.songName = songName;
        this.artistName = artistName;
    }

    public int getArtistPic() {
        return artistPic;
    }

    public void setArtistPic(int artistPic) {
        this.artistPic = artistPic;
    }

    public String getSongName() {
        return songName;
    }

    public void setSongName(String songName) {
        this.songName = songName;
    }

    public String getArtistName() {
        return artistName;
    }

    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }
}
