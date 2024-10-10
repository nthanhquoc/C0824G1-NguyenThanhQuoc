package bai_tap;

import java.util.Scanner;

public class Geometry {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int width;
        int height;
        int choice;
        System.out.println("Menu: ");
        System.out.println("1.Print the rectangle");
        System.out.println("2.Print the square triangle");
        System.out.println("3.Print isosceles triangle");
        System.out.println("4. Exit");
        try {
            System.out.println("Enter your choice: ");
            choice = sc.nextInt();
            if (choice > 4 || choice <= 0) {
                System.out.println("Invalid choice");
                return;
            }
        } catch (Exception e) {
            System.out.println("Invalid choice");
            return;
        }
        switch (choice) {
            case 1:
                System.out.println("Enter width: ");
                width = sc.nextInt();
                System.out.println("Enter height: ");
                height = sc.nextInt();
                for (int i = 0; i < height; i++) {
                    String x = " ";
                    for (int j = 0; j < width; j++) {
                        x += "*";
                    }
                    System.out.println(x);
                }
                break;
            case 2:
                System.out.println("Do You Want to Print the square triangle");
                System.out.println("1.Print the rectangle Top-left");
                System.out.println("2.Print the rectangle Top-right");
                System.out.println("3.Print the rectangle Bottom-Left");
                System.out.println("4.Print the rectangle Bottom-Right");
                System.out.println("5. Exit");
                int chooseRectangle;
                try {
                    System.out.println("Enter your choice: ");
                    chooseRectangle = sc.nextInt();
                    if (chooseRectangle > 5 || chooseRectangle <= 0) {
                        System.out.println("Invalid choice");
                        return;
                    }
                } catch (Exception e) {
                    System.out.println("Invalid choice");
                    return;
                }
                switch (chooseRectangle) {
                    case 1:
                        System.out.println("Enter Height:");
                        height = sc.nextInt();
                        for (int i = 0; i < height; i++) {
                            String x = " ";
                            for (int j = 0; j <= i; j++) {
                                x += "*";
                            }
                            System.out.println(x);
                        }
                        break;
                    case 2:
                        System.out.println("Enter Height:");
                        height = sc.nextInt();
                        for (int i = 1; i <= height; i++) {
                            String count = "";
                            for (int z = 1; z <= height - i; z++) {
                                count += " ";
                            }
                            for (int j = 1; j <= i; j++) {
                                count += '*';
                            }
                            System.out.println(count);
                        }
                    case 3:
                        System.out.println("Enter Height: ");
                        height = sc.nextInt();
                        for (int i = 0; i < height; i++) {
                            String x = " ";
                            for (int j = i; j < height; j++) {
                                x += "*";
                            }
                            System.out.println(x);
                        }
                        break;
                    case 4:
                        System.out.println("Enter Height:");
                        height = sc.nextInt();
                        for (int i = height; i >= 1; i--) {
                            String count = "";
                            for (int z = 1; z <= height - i; z++) {
                                count += " ";
                            }
                            for (int j = 1; j <= i; j++) {
                                count += '*';
                            }
                            System.out.println(count);
                        }
                    case 5:
                        break;
                }
                break;
            case 3:
                System.out.println("Enter Height:");
                height = sc.nextInt();
                for (int i = 1; i <= height; i++) {
                    String x = "";
                    for (int j = 1; j <= height - i; j++)
                        x += " ";
                    for (int j = 1; j <= 2 * i - 1; j++)
                        x += "*";
                    System.out.println(x);
                }
                break;
            case 4:
                break;
        }
    }
}
