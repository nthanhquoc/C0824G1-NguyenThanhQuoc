package thuc_hanh;

import java.util.Scanner;

public class MaxArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size;
        int []array;
        do{
            System.out.print("Enter the size:");
            size = sc.nextInt();
            if(size>20){
                System.out.println("Size should not exceed 20");
            }
        }while(size>20);
        array = new int[size];
        int i=0;
        while(i<array.length){
            System.out.print("Enter the element:");
            array[i] = sc.nextInt();
            i++;
        }
        System.out.print("Array is: ");
        for(int j=0;j<array.length;j++){
            System.out.print(array[j]+" ");
        }
        int max=array[0];
        for(int j=0;j<array.length;j++){
            if(array[j]>max){
                max=array[j];
            }
        }
        System.out.println("The larget porerty value in the list is "+max);
    }
}
