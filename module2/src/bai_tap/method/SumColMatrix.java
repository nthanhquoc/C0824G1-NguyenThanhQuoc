package bai_tap.method;

import java.util.Arrays;
import java.util.Scanner;

public class SumColMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matrix;
        int cols;
        int rows;
        int indexCol;
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
                    if(matrix[i][j] <= 0){
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
        while (true){
            try{
                System.out.print("Input index Column to Sum: ");
                indexCol = sc.nextInt();
            } catch (Exception e) {
                System.out.println("Invalid input. Try again.");
                sc.nextLine();
                continue;
            }
            if(indexCol < 0){
                System.out.println("Invalid input. Try again.");
                continue;
            }
            break;
        }
        sumColMatrix(matrix,rows,indexCol);
    }
    public static void sumColMatrix(int[][] matrix, int rows,int indexCols) {
            int sum = 0;
            for (int j = 0; j < rows; j++) {
                sum += matrix[j][indexCols];
            }
            System.out.println("Sum of colum "+indexCols+"="+sum);
    }
}
