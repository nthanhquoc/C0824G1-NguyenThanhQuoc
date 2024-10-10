package bai_tap.loop_array;

import java.util.Arrays;
import java.util.Scanner;

public class MergeArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arrOne;
        int[] arrTwo;
        int[] mergeArray;
        int numberOne;
        int numberTwo;
        while (true) {
            try {
                System.out.print("How many elements in Array One? : ");
                numberOne = sc.nextInt();
            } catch (Exception e) {
                System.out.println("Invalid Input. Please enter a positive integer.");
                sc.nextLine();
                continue;
            }
            if (numberOne <= 0) {
                System.out.println("Invalid Input. Number of elements must be greater than 0.");
                continue;
            }
            break;
        }
        while (true) {
            try {
                System.out.print("How many elements in Array Two? : ");
                numberTwo = sc.nextInt();
            } catch (Exception e) {
                System.out.println("Invalid Input. Please enter a positive integer.");
                sc.nextLine();
                continue;
            }
            if (numberTwo <= 0) {
                System.out.println("Invalid Input. Number of elements must be greater than 0.");
                continue;
            }
            break;
        }
        arrOne = new int[numberOne];
        arrTwo = new int[numberTwo];
        for (int i = 0; i < numberOne; i++) {
            while (true) {
                try {
                    System.out.print("Input Array One Element " + (i + 1) + ": ");
                    arrOne[i] = sc.nextInt();
                } catch (Exception e) {
                    System.out.println("Invalid Input. Please enter a positive integer.");
                    sc.nextLine();
                    continue;
                }
                break;
            }
        }
        for (int i = 0; i < numberTwo; i++) {
            while (true) {
                try {
                    System.out.print("Input Array Two Element " + (i + 1) + ": ");
                    arrTwo[i] = sc.nextInt();
                } catch (Exception e) {
                    System.out.println("Invalid Input. Please enter a positive integer.");
                    sc.nextLine();
                    continue;
                }
                break;
            }
        }
        System.out.println("Array One"+Arrays.toString(arrOne));
        System.out.println("Array Two"+Arrays.toString(arrTwo));
        mergeArray = new int[numberOne+numberTwo];
        for(int i = 0; i < numberOne; i++){
            mergeArray[i]=arrOne[i];
        }
        for(int i = 0; i < numberTwo; i++){
            mergeArray[numberOne+i]=arrTwo[i];
        }
        System.out.println("Array Three"+Arrays.toString(mergeArray));
    }
}
