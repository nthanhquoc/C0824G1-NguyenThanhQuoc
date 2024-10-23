package bai_tap.stack_qeue.bt1;

import java.util.Scanner;
import java.util.Stack;

public class ReverseArray {
    public static void reverseArray(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        for(int i=0;i<arr.length;i++) {
            stack.push(arr[i]);
        }
        for(int i=0;i<arr.length;i++) {
            arr[i] = stack.pop();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;
        int []arr;
        number = numberInArray(sc);
        arr = new int[number];
        inputValue(number, arr, sc);
        reverseArray(arr);
        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i]+" ");
        }
    }

    private static void inputValue(int number, int[] arr, Scanner sc) {
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
    }

    private static int numberInArray(Scanner sc) {
        int number;
        while(true) {
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
        return number;
    }
}
