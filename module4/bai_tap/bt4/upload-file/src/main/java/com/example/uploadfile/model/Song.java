package com.example.uploadfile.model;

public class Song {
    private String songName;
    private String artist;
    private String genre;
    private String filePath;

    public Song(){}
    public Song(String songName, String artist, String genre, String filePath) {
        this.songName = songName;
        this.artist = artist;
        this.genre = genre;
        this.filePath = filePath;
    }
    public String getSongName() {
        return songName;
    }
    public void setSongName(String songName) {
        this.songName = songName;
    }
    public String getArtist() {
        return artist;
    }
    public void setArtist(String artist) {
        this.artist = artist;
    }
    public String getGenre() {
        return genre;
    }
    public void setGenre(String genre) {
        this.genre = genre;
    }
    public String getFilePath() {
        return filePath;
    }
    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

}
