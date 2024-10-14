package bai_tap.method;

import java.util.Arrays;
import java.util.Scanner;

public class MinArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr;
        int size;
        while (true) {
            try {
                System.out.println("Size of Array");
                size = sc.nextInt();
            } catch (Exception e) {
                System.out.println("Invalid Input");
                sc.nextLine();
                continue;
            }
            break;
        }
        arr = new int[size];
        for (int i = 0; i < size; i++) {
            while (true) {
                try {
                    System.out.println("Enter element");
                    arr[i] = sc.nextInt();
                } catch (Exception e) {
                    System.out.println("Invalid Input");
                    sc.nextLine();
                    continue;
                }
                break;
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("Min Of Array: "+minArray(arr));
    }

    public static int minArray(int[] arr) {
        int minArr = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < minArr) {
                minArr = arr[i];
            }
        }
       return minArr;
    }
}
