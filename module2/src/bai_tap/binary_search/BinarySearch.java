package bai_tap.binary_search;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr;
        int number;
        int value;
        number = getInput("How Many Number In Array", sc);
        arr = new int[number];
        inputArray(number, arr, sc);
        displayArray(arr);
        Arrays.sort(arr);
        System.out.println("Mang Sau Khi Sap Xep la " + Arrays.toString(arr));
        value = getInput("Input value to search", sc);
        int result = binarySearch(arr, 0, arr.length - 1, value);
        displayIndex(result);

        int result2 = binarySearch2(arr, value);
        displayIndex(result2);
    }

    private static void displayIndex(int result) {
        if (result == -1) {
            System.out.println("Not found");
        } else {
            System.out.println("Found at index: " + result);
        }
    }

    public static int getInput(String message, Scanner sc) {
        while (true) {
            try {
                System.out.println(message);
                return sc.nextInt();
            } catch (Exception e) {
                System.out.println("Invalid input, please enter a valid number.");
                sc.nextLine();
            }
        }
    }

    public static void displayArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print("[" + arr[i] + "]\t");
        }
    }

    public static void inputArray(int number, int[] arr, Scanner sc) {
        for (int i = 0; i < number; i++) {
            System.out.println("Nhap Phan Tu Thu " + i + ": ");
            arr[i] = sc.nextInt();
        }
    }

    public static int binarySearch(int[] arr, int left, int right, int value) {
        if (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] == value) {
                return mid;
            } else if (arr[mid] < value) {
                return binarySearch(arr, mid + 1, right, value);
            } else {
                return binarySearch(arr, left, mid - 1, value);
            }
        }
        return -1;
    }
    public static int binarySearch2(int[] arr, int value) {
        int low=arr[0];
        int high=arr[arr.length-1];
        while(low<=high) {
            int mid=(low+high)/2;
            if(arr[mid]==value) {
                return mid;
            }else if(arr[mid]<value) {
                low=mid+1;
            }
            else {
                high=mid-1;
            }
        }
        return -1;
    }
}
