package bai_tap;

import java.util.Scanner;

public class CurrencyConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double exchangeRate = 24.83000;
        double valueDollar;
        double changeVietNamDong;
        while (true) {
            try {
                System.out.println("Input Value USD: ");
                valueDollar = sc.nextDouble();
                if (valueDollar < 0||valueDollar==0) {
                    System.out.println("Invalid input. The value cannot be negative.");
                    continue;
                }
                changeVietNamDong = valueDollar * exchangeRate;
                System.out.println(valueDollar + " USD = " + changeVietNamDong + " VND");
                break;
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter a valid number.");
                return;
            }

        }
    }
}
