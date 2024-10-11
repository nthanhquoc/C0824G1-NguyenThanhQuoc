package bai_tap.class_practice.ex1;

public class QuadraticEquation {
    double variableA;
    double variableB;
    double variableC;

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
        double delta = Math.pow(variableB, 2) - 4 * variableC * variableA;
        return delta;
    }

    public double getRoot1() {
        if (getDiscriminant() > 0) {
            return (-variableB + Math.sqrt(getDiscriminant())) / (2 * variableA);
        } else {
            return 0;
        }
    }

    public double getRoot2() {
        if (getDiscriminant() > 0) {
            return (-variableB - Math.sqrt(getDiscriminant())) / (2 * variableA);
        } else {
            return 0;
        }
    }
}
