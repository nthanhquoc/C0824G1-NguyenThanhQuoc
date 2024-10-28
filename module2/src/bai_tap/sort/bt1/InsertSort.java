package bai_tap.sort.bt1;

import java.util.Scanner;

public class InsertSort {
    public static void insertSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;
        int[] arr;
        while (true) {
            try {
                System.out.println("Enter the size of the array");
                number = sc.nextInt();
            } catch (Exception e) {
                System.out.println("Invalid Input");
                sc.nextLine();
                continue;
            }
            break;
        }
        arr = new int[number];
        for (int i = 0; i < arr.length; i++) {
            while (true) {
                try {
                    System.out.print("Input Element " + (i + 1) + ": ");
                    arr[i] = sc.nextInt();
                } catch (Exception e) {
                    System.out.println("Invalid input, please enter a valid number.");
                    sc.nextLine();
                }
                break;
            }
        }
        displayArray("Array: ", arr);
        System.out.println("\n");
        insertSort(arr);
        displayArray("Array after insertion: ", arr);
    }

    private static void displayArray(String message, int[] arr) {
        System.out.print(message);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
