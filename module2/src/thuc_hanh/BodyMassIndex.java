package thuc_hanh;

import java.util.Scanner;

public class BodyMassIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double weight, height, mbi;
        System.out.print("Enter the weight in pounds: ");
        weight = sc.nextDouble();
        System.out.print("Enter the height in pounds: ");
        height = sc.nextDouble();
        mbi = weight / Math.pow(height, 2);
        System.out.printf("%-20s%s", "bmi", "Interpretation\n");
        if (mbi < 18) {
            System.out.printf("%-20.2f%s", mbi, "UnderWeight");
        } else if (mbi < 25.0) {
            System.out.printf("%-20.2f%s", mbi, "Normal");
        } else if (mbi < 30.0) {
            System.out.printf("%-20.2f%s", mbi, "OverWeight");
        } else {
            System.out.printf("%-20.2f%s", mbi, "Obese");
        }
    }
}
