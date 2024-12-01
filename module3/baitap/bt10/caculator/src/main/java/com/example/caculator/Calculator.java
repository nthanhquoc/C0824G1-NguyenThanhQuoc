package com.example.caculator;

public class Calculator {
    public float calculate(float firstNumber, float secondNumber, String operator) throws ArithmeticException {
        switch (operator) {
            case "Add":
                return firstNumber + secondNumber;
            case "Sub":
                return firstNumber - secondNumber;
            case "Multi":
                return firstNumber * secondNumber;
            case "Div":
                if (secondNumber == 0) {
                    throw new ArithmeticException("Division by zero is not allowed.");
                }
                return firstNumber / secondNumber;
            default:
                throw new IllegalArgumentException("Invalid operator");
        }
    }
}
