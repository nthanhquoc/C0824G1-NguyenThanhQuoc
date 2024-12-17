package com.example.uploadfile.repository;

import com.example.uploadfile.model.Song;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class SongRepository {
    private static List<Song>songs=new ArrayList<>();

    public void saveSong(Song song){
        songs.add(song);
    }

    public List<Song> getSongs(){
        return songs;
    }
}
