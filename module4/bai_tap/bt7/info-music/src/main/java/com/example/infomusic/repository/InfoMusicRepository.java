package com.example.infomusic.repository;

import com.example.infomusic.model.InfoMusic;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InfoMusicRepository extends JpaRepository<InfoMusic, Integer> {
}
