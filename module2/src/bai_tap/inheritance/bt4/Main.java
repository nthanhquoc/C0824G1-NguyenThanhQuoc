package bai_tap.inheritance.bt4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap Do Dai Canh Thu Nhat");
        double side1 = sc.nextDouble();
        System.out.println("Nhap Do Dai Canh Thu Hai");
        double side2 = sc.nextDouble();
        System.out.println("Nhap Do Dai Canh Thu Hai");
        double side3 = sc.nextDouble();

        Triangle tri=new Triangle(side1,side2,side3);
        System.out.println(tri.getArea());
        System.out.println(tri.getPerimeter());
        System.out.println(tri);

    }
}
