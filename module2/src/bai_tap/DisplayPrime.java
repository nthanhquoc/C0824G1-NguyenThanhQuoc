package bai_tap;

import java.util.Scanner;

public class DisplayPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;
        while(true){
            try{
                System.out.println("Input number");
                number=sc.nextInt();
                if(number<0||number==0){
                    System.out.println("Invalid Input");
                    continue;
                }
                break;
            } catch (Exception e) {
                System.out.println("Invalid input");
                return;
            }
        }
        int count=0;
        int prime=2;
        while(count<number){
            if (isPrime(prime)) {
                System.out.print(prime+" ");
                count++;
            }
            prime++;
        }
    }
    public static boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
