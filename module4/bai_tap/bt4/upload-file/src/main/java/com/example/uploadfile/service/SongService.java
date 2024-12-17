package com.example.uploadfile.service;

import com.example.uploadfile.model.Song;
import com.example.uploadfile.repository.SongRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SongService implements ISongService {
    @Autowired
    private SongRepository songRepository;

    public void saveSong(Song song){
        songRepository.saveSong(song);
    }

    public List<Song> getSongs(){
        return songRepository.getSongs();
    }
}
