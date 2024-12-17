package com.example.sandwich.service;

import org.springframework.stereotype.Service;

@Service
public class CondimentService implements ICondimentService {
    public boolean validateCondiments(String[] condiments) {
        return condiments != null && condiments.length > 0;
    }
}
