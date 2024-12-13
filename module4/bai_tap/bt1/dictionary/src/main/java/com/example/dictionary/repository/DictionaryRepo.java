package com.example.dictionary.repository;

import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;
@Repository
public class DictionaryRepo {
    private static Map<String,String> dictionary = new HashMap<>();

    static{
        dictionary.put("hello","xin chào");
        dictionary.put("cat","mèo");
        dictionary.put("dog","chó");
        dictionary.put("book","sách");
    }

    public String findMean(String word){
        return dictionary.get(word.toLowerCase());
    }
}
