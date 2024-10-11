package thuc_hanh;

import java.util.Scanner;

public class Student {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size;
        int []arr;
        do{
            System.out.print("Enter the size: ");
            size = sc.nextInt();
            if(size>30)
                System.out.println("Size should not exceed 30");
        }while(size>30);
        arr = new int[size];
        int i=0;
        while(i<size){
            System.out.print("Enter number: ");
            arr[i] = sc.nextInt();
            i++;
        }
        int count = 0;
        System.out.print("List of mark: ");
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + "\t");
            if (arr[j] >= 5 && arr[j] <= 10)
                count++;
        }
        System.out.print("\n The number of students passing the exam is " + count);
    }
}
