package thuc_hanh;

import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size;
        int[] arr;
        do {
            System.out.print("Enter a size");
            size = sc.nextInt();
            if (size > 20) {
                System.out.println("Size does not exceed 20");
            }
        } while (size > 20);
        arr = new int[size];
        int i = 0;
        while (i < arr.length) {
            System.out.print("Enter element" + (i + 1) + ": ");
            arr[i] = sc.nextInt();
            i++;
        }
        System.out.print("Element in array: ");
        for(int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + " ");
        }
        for(int j=0;j<arr.length/2;j++) {
            int temp = arr[j];
            arr[j] = arr[size-1-j];
            arr[size-1-j] = temp;
        }
        System.out.print("Reversed array: ");
        for(int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + " ");
        }
    }
}
