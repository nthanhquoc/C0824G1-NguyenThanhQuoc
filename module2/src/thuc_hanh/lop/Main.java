package thuc_hanh.lop;

import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the width: ");
        double width = sc.nextDouble();
        System.out.println("Enter the height: ");
        double height = sc.nextDouble();
        Rectangle rectangle = new Rectangle(width, height);
        System.out.println("Your Rectangle is " + rectangle.display());
        System.out.println("Perimeter of the Rectangle is " + rectangle.getPerimeter());
        System.out.println("Area of the Rectangle is " + rectangle.getArea());
    }
}
