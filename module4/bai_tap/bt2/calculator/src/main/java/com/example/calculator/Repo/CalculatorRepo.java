package com.example.calculator.Repo;

import org.springframework.stereotype.Repository;

@Repository
public class CalculatorRepo {
    public double calculate(double numb1, double numb2, String operator) {
        switch (operator) {
            case "add":
                return numb1 + numb2;
            case "subtract":
                return numb1 - numb2;
            case "multiply":
                return numb1 * numb2;
            case "divide":
                return (numb2 != 0) ? numb1 / numb2 : Double.NaN;
            default:
                throw new IllegalArgumentException("Invalid operation");

        }
    }
}
