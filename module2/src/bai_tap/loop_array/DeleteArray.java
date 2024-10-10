package bai_tap.loop_array;

import java.util.Scanner;

public class DeleteArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr;
        int number;
        int numberDelete;
        int index = -1;
        while (true) {
            try {
                System.out.println("How many elements do you want to create");
                number = sc.nextInt();
            } catch (Exception e) {
                System.out.println("Invalid input");
                sc.nextLine();
                continue;
            }
            if (number == 0 || number < 0) {
                System.out.println("Invalid input");
                continue;
            }
            break;
        }
        arr = new int[number];
        for (int i = 0; i < number; i++) {
            while (true) {
                try {
                    System.out.print("Enter element " + (i + 1) + ": ");
                    arr[i] = sc.nextInt();
                    break;
                } catch (Exception e) {
                    System.out.println("Invalid input, please enter a valid number.");
                    sc.nextLine();
                }
            }
        }
        for (int i = 0; i < number; i++) {
            System.out.print(arr[i] + " ");
        }
        while (true) {
            try {
                System.out.println("\nEnter number to delete: ");
                numberDelete = sc.nextInt();
                break;
            } catch (Exception e) {
                System.out.println("Invalid input, please enter a valid number.");
                sc.nextLine();
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == numberDelete) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            System.out.println("Element not Found");
        } else {
            int []newArr = new int[arr.length - 1];
            System.arraycopy(arr, 0, newArr, 0, index);
            for (int i = index; i < newArr.length; i++) {
                newArr[i] = arr[i + 1];
            }
            for (int i = 0; i < newArr.length; i++) {
                System.out.print(newArr[i] + " ");
            }
        }

    }

}
