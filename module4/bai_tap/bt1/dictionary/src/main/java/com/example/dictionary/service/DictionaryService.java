package com.example.dictionary.service;

import com.example.dictionary.repository.DictionaryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DictionaryService implements IDictionaryService {
    @Autowired
    private DictionaryRepo dictionaryRepo;

    public String findMean(String word){
        return dictionaryRepo.findMean(word);
    }
}
