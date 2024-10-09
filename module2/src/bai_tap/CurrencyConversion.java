package bai_tap;

import java.util.Scanner;

public class CurrencyConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double exchangeRate=24.83000;
        double valueDolla,changeVietNamDong;
        System.out.println("Input Value USD: ");
        valueDolla=sc.nextDouble();
        changeVietNamDong=valueDolla*exchangeRate;
        System.out.println(valueDolla+" USD = "+changeVietNamDong+" VND");
    }
}
