package com.example.sandwich.Service;

import org.springframework.stereotype.Service;

@Service
public class CondimentService implements ICondimentService {
    public boolean validateCondiments(String[] condiments) {
        return condiments != null && condiments.length > 0;
    }
}
