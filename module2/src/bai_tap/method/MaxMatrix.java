package bai_tap.method;

import java.util.Scanner;

public class MaxMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matrix;
        int rows;
        int cols;
        while (true) {
            try {
                System.out.print("How many rows do you want to use?: ");
                rows = sc.nextInt();
            } catch (Exception e) {
                System.out.println("Invalid input. Try again.");
                sc.nextLine();
                continue;
            }
            if (rows <= 0) {
                System.out.println("Invalid input. Try again.");
                continue;
            }
            break;
        }
        while (true) {
            try {
                System.out.print("How many columns do you want to use?: ");
                cols = sc.nextInt();
            } catch (Exception e) {
                System.out.println("Invalid input. Try again.");
                sc.nextLine();
                continue;
            }
            if (cols <= 0) {
                System.out.println("Invalid input. Try again.");
                continue;
            }
            break;
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
                    break;
                }
            }
        }
        System.out.println("Max Of Matrix: " + findMaxMatrix(matrix, rows));
    }

    public static int findMaxMatrix(int[][] matrix, int rows) {
        int max = matrix[0][0];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                }
            }
        }
        return max;
    }
}
