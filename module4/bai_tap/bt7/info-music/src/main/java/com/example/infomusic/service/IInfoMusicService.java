package com.example.infomusic.service;

import com.example.infomusic.model.InfoMusic;

import java.util.List;

public interface IInfoMusicService {
    List<InfoMusic> getInfoMusic();
    void save(InfoMusic infoMusic);
    void update(int id, InfoMusic infoMusic);
    InfoMusic findById(int id);
}
