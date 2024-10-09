package thuc_hanh;

import java.util.Scanner;

public class Interest {
    public static void main(String[] args) {
        double money;
        int month;
        double interestRate;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Money: ");
        money = sc.nextDouble();
        System.out.print("Enter monthly income: ");
        month = sc.nextInt();
        System.out.print("Enter interest rate: ");
        interestRate = sc.nextDouble();
        double totalInterest=0;
        for(int i=0;i<month;i++){
            totalInterest += money * (interestRate/100)/12 * month;
        }
        System.out.println("Total of interest: " + totalInterest);
    }
}
