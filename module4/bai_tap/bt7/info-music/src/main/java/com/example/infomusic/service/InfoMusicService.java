package com.example.infomusic.service;

import com.example.infomusic.model.InfoMusic;
import com.example.infomusic.repository.InfoMusicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InfoMusicService  implements IInfoMusicService{
    @Autowired
    private InfoMusicRepository infoMusicRepository;

    @Override
    public List<InfoMusic> getInfoMusic() {
        return infoMusicRepository.findAll();
    }

    @Override
    public void save(InfoMusic infoMusic) {
        infoMusicRepository.save(infoMusic);
    }

    @Override
    public void update(int id, InfoMusic infoMusic) {
        infoMusicRepository.save(infoMusic);
    }

    public InfoMusic findById(int id){
        return infoMusicRepository.findById(id).orElse(null);
    }
}
