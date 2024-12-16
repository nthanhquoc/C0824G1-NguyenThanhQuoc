package com.example.calculator.Service;

import com.example.calculator.Repo.CalculatorRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CalculatorService implements ICalculatorService {
    @Autowired
    private CalculatorRepo calculatorRepo;

    public double calculate(double numb1,double numb2,String operator){
        return calculatorRepo.calculate(numb1,numb2,operator);
    }

}
