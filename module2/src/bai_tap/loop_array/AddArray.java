package bai_tap.loop_array;

import java.util.Scanner;

public class AddArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr;
        int number;
        int index;
        int value;
        while (true) {
            try {
                System.out.print("How many elements in array?: ");
                number = sc.nextInt();
            } catch (Exception e) {
                System.out.println("Invalid input, please enter a valid number.");
                sc.nextLine();
                continue;
            }
            if (number <= 0) {
                System.out.println("Invalid input, the number must be greater than 0.");
                continue;
            }
            arr = new int[number];
            for (int i = 0; i < arr.length; i++) {
                while (true) {
                    try {
                        System.out.print("Input Element " + (i + 1) + ": ");
                        arr[i] = sc.nextInt();
                        break;
                    } catch (Exception e) {
                        System.out.println("Invalid input, please enter a valid number.");
                        sc.nextLine();
                    }
                }
            }
            System.out.print("Array: ");
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
            while (true) {
                try {
                    System.out.print("Input value to add: ");
                    value = sc.nextInt();
                    break;
                } catch (Exception e) {
                    System.out.println("Invalid input, please enter a valid number.");
                    sc.nextLine();
                }
            }
            while (true) {
                try {
                    System.out.print("Input index where you want to add the value: ");
                    index = sc.nextInt();
                    if (index < 0 || index > arr.length) {
                        System.out.println("Invalid index. Index must be between 0 and " + arr.length);
                    } else {
                        break;
                    }
                } catch (Exception e) {
                    System.out.println("Invalid input, please enter a valid number.");
                    sc.nextLine();
                }
            }
            int[] newArr = new int[arr.length + 1];
            System.arraycopy(arr, 0, newArr, 0, index);
            newArr[index] = value;
            for (int i = arr.length - 1; i >= index; i--) {
                newArr[i + 1] = arr[i];
            }
            for (int i = 0; i < newArr.length; i++) {
                System.out.print(newArr[i] + " ");
            }
            break;
        }
    }
}
