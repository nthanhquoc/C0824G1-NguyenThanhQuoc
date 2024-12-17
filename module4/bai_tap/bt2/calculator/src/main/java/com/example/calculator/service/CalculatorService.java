package com.example.calculator.service;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService implements ICalculatorService {

    public double calculate(double numb1,double numb2,String operator){
        switch (operator) {
            case "add":
                return numb1 + numb2;
            case "subtract":
                return numb1 - numb2;
            case "multiply":
                return numb1 * numb2;
            case "divide":
                if (numb2 == 0) {
                    throw new ArithmeticException("Division by zero is not allowed.");
                }
                return numb1 / numb2;
            default:
                throw new IllegalArgumentException("Invalid operation");
        }
    }

}
