package bai_tap.class_practice.ex1;

import java.util.Scanner;

public class QuadraticEquation {
    double variableA;
    double variableB;
    double variableC;
    double delta;

    public QuadraticEquation(double variableA, double variableB, double variableC) {
        this.variableA = variableA;
        this.variableB = variableB;
        this.variableC = variableC;
    }

    public double getVariableA() {
        return variableA;
    }

    public double getVariableB() {
        return variableB;
    }

    public double getVariableC() {
        return variableC;
    }

    public double getDiscriminant() {
        delta = Math.pow(variableB, 2) - 4 * variableC * variableA;
        return delta;
    }

    public double getRoot1() {
        if (delta > 0) {
            return (-variableB + Math.sqrt(delta)) / (2 * variableA);
        } else {
            return 0;
        }
    }

    public double getRoot2() {
        if (delta > 0) {
            return (-variableB - Math.sqrt(delta)) / (2 * variableA);
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double variableA;
        double variableB;
        double variableC;
        String messageA = "Input a: ";
        String messageB = "Input b: ";
        String messageC = "Input c: ";
        variableA = inputValue(sc, messageA);
        variableB = inputValue(sc, messageB);
        variableC = inputValue(sc, messageC);
        QuadraticEquation equation = new QuadraticEquation(variableA, variableB, variableC);
        System.out.println("a = " + equation.getVariableA());
        System.out.println("b = " + equation.getVariableB());
        System.out.println("c = " + equation.getVariableC());
        System.out.println("Delta = " + equation.getDiscriminant());
        if (equation.getDiscriminant() > 0) {
            System.out.printf("The equation has two roots: %.3f and %.3f\n", equation.getRoot1(), equation.getRoot2());
        } else if (equation.getDiscriminant() == 0) {
            System.out.printf("The equation has one root: %.3f\n", equation.getRoot1());
        } else {
            System.out.println("The equation has no real roots.");
        }
    }

    public static double inputValue(Scanner sc, String message) {
        double variable;
        while (true) {
            try {
                System.out.println(message);
                variable = sc.nextDouble();
            } catch (Exception e) {
                System.out.println("Invalid input");
                sc.nextLine();
                continue;
            }
            break;
        }
        return variable;
    }
}
