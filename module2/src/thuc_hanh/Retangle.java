package thuc_hanh;

import java.util.Scanner;

public class Retangle {
    public static void main(String[] args) {
        float width,height;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the width of the rectangle: ");
        width = input.nextFloat();
        System.out.print("Enter the height of the rectangle: ");
        height = input.nextFloat();
        float area = width * height;
        float perimeter = 2 * (width + height);
        System.out.println("The area of the rectangle is " + area);
        System.out.println("The perimeter of the rectangle is " + perimeter);
    }
}
