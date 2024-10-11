package bai_tap.class_practice.ex1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double variableA;
        double variableB;
        double variableC;
        System.out.print("Input a: ");
        variableA = sc.nextDouble();
        System.out.print("Input b: ");
        variableB = sc.nextDouble();
        System.out.print("Input c: ");
        variableC = sc.nextDouble();
        QuadraticEquation equation = new QuadraticEquation(variableA, variableB, variableC);
        System.out.println("a = "+equation.getVariableA());
        System.out.println("b = "+equation.getVariableB());
        System.out.println("c = "+equation.getVariableC());
        if (equation.getDiscriminant() > 0) {
            System.out.printf("The equation has two roots: %.3f and %.3f\n", equation.getRoot1(), equation.getRoot2());
        } else if (equation.getDiscriminant() == 0) {
            System.out.printf("The equation has one root: %.3f\n", equation.getRoot1());
        } else {
            System.out.println("The equation has no real roots.");
        }
    }
}
