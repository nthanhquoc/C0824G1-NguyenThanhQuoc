package com.example.uploadfile.service;

import com.example.uploadfile.model.Song;

import java.util.List;

public interface ISongService {
    public void saveSong(Song song);

    public List<Song> getSongs();
}
