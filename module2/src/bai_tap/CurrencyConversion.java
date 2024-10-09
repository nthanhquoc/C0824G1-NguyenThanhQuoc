package bai_tap;

import java.util.Scanner;

public class CurrencyConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double exchangeRate=24.83000;
        double valueDollar,changeVietNamDong;
        System.out.println("Input Value USD: ");
        valueDollar=sc.nextDouble();
        changeVietNamDong=valueDollar*exchangeRate;
        System.out.println(valueDollar+" USD = "+changeVietNamDong+" VND");
    }
}
