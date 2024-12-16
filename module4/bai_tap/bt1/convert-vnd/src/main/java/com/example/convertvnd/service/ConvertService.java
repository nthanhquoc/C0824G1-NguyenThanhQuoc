package com.example.convertvnd.service;


import org.springframework.stereotype.Service;

@Service
public class ConvertService implements IConvertService {
    private final double RATE = 31.5;

    public double covertUsdToVnd(double usd){
        if (usd < 0) {
            throw new IllegalArgumentException("Số tiền USD không được âm.");
        }
        return usd * RATE;
    }
}
