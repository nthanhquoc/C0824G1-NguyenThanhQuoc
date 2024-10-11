package bai_tap.method;

import java.util.Scanner;

public class SumDiagonalMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matrix;
        int cols;
        int rows;
        while (true) {
            try {
                System.out.println("How many rows do you want create in matrix?");
                rows = sc.nextInt();
            } catch (Exception e) {
                System.out.println("Invalid Input");
                sc.nextLine();
                continue;
            }
            if (rows <= 0) {
                System.out.println("Invalid Input");
                continue;
            }
            break;
        }
        while (true) {
            try {
                System.out.println("How many columns do you want create in matrix?");
                cols = sc.nextInt();
            } catch (Exception e) {
                System.out.println("Invalid Input");
                continue;
            }
            if (cols <= 0) {
                System.out.println("Invalid Input");
                continue;
            }
            break;
        }
        if (rows != cols) {
            System.out.println("Not a Square Matrix");
            return;
        }
        matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                while (true) {
                    try {
                        System.out.print("Enter value for matrix[" + i + "][" + j + "]: ");
                        matrix[i][j] = sc.nextInt();
                    } catch (Exception e) {
                        System.out.println("Invalid input. Try again.");
                        sc.nextLine();
                        continue;
                    }
                    if (matrix[i][j] <= 0) {
                        System.out.println("Invalid input. Try again.");
                        continue;
                    }
                    break;
                }
            }
        }
        System.out.println("Matrix: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        int sumMain = 0;
        int sumSecondary = 0;
        for (int i = 0; i < rows; i++) {
            sumMain += matrix[i][i];
            sumSecondary += matrix[i][cols - i - 1];
        }
        System.out.println("Sum main: " + sumMain);
        System.out.println("Sum secondary: " + sumSecondary);
    }
}
