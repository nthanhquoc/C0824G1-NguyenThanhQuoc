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
        } else if (delta == 0) {
            return -variableB / (2 * variableA);
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
        while (true) {
            try {
                System.out.print("Input a: ");
                variableA = sc.nextDouble();
            } catch (Exception e) {
                System.out.println("Invalid input");
                sc.nextLine();
                continue;
            }
            if (variableA == 0) {
                System.out.println("Variable A must not be zero");
                continue;
            }
            break;
        }
        while (true) {
            try {
                System.out.print("Input b: ");
                variableB = sc.nextDouble();
            } catch (Exception e) {
                System.out.println("Invalid input");
                sc.nextLine();
                continue;
            }
            break;
        }
        while (true) {
            try {
                System.out.print("Input c: ");
                variableC = sc.nextDouble();
            } catch (Exception e) {
                System.out.println("Invalid input");
                sc.nextLine();
                continue;
            }
            break;
        }
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
}
