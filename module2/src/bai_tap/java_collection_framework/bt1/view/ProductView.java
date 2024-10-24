package bai_tap.java_collection_framework.bt1.view;

import bai_tap.java_collection_framework.bt1.controller.ProductController;
import bai_tap.java_collection_framework.bt1.enity.Product;

import java.util.ArrayList;
import java.util.Scanner;

public class ProductView {
    public static void main(String[] args) {
        ProductController controller = new ProductController();
        int choice;
        int id;
        double price;
        String name;
        System.out.println("1.Display Products");
        System.out.println("2.Add Product");
        System.out.println("3.Search Product");
        System.out.println("4.Sort Products");
        System.out.println("5.Edit Product");
        System.out.println("6.Delete Product");
        System.out.println("7.Exit");
        Scanner sc = new Scanner(System.in);
        while (true) {
            try {
                System.out.println("Nhap Choice");
                choice = sc.nextInt();
            } catch (Exception e) {
                System.out.println("Invalid input. Try again.");
                sc.nextLine();
                continue;
            }
            if (choice < 1 || choice > 7) {
                System.out.println("Invalid input. Try again.");
                continue;
            }
            break;
        }
        switch (choice) {
            case 1:
                controller.displayProducts();
                break;
            case 2:
                while (true) {
                    try {
                        System.out.println("Input Id : ");
                        id = sc.nextInt();
                    } catch (Exception e) {
                        System.out.println("Invalid input. Try again.");
                        sc.nextLine();
                        continue;
                    }
                    break;
                }
                while (true) {
                    try {
                        System.out.println("Input Name:");
                        name = sc.next();
                    } catch (Exception e) {
                        System.out.println("Invalid input. Try again.");
                        sc.nextLine();
                        continue;
                    }
                    break;
                }
                while (true) {
                    try {
                        System.out.println("Input Price:");
                        price = sc.nextDouble();
                    } catch (Exception e) {
                        System.out.println("Invalid input. Try again.");
                        sc.nextLine();
                        continue;
                    }
                    break;
                }
                controller.addProduct(new Product(id, name, price));
                break;
            case 3:
                while (true) {
                    try {
                        System.out.println("Input Name to Search: ");
                        name = sc.next();
                    } catch (Exception e) {
                        System.out.println("Invalid input. Try again.");
                        sc.nextLine();
                        continue;
                    }
                    break;
                }
                controller.searchProduct(name);
                break;
            case 4:
                System.out.println("Sort Products To Prices");
                controller.sortProducts();
                break;
            case 5:
                while(true){
                    try{
                        System.out.println("Input Id to Edit: ");
                         id=sc.nextInt();
                    }catch (Exception e){
                        System.out.println("Invalid input. Try again.");
                        sc.nextLine();
                        continue;
                    }
                    break;
                }
                while(true){
                    try{
                        System.out.println("Input Name to Edit: ");
                        name=sc.next();
                    }catch (Exception e){
                        System.out.println("Invalid input. Try again.");
                        sc.nextLine();
                        continue;
                    }
                    break;
                }
                while (true) {
                    try {
                        System.out.println("Input Price:");
                        price = sc.nextDouble();
                    } catch (Exception e) {
                        System.out.println("Invalid input. Try again.");
                        sc.nextLine();
                        continue;
                    }
                    break;
                }
                controller.editProduct(id,name,price);
                break;
            case 6:
                while(true){
                    try{
                        System.out.println("Input Id to Delete: ");
                         id=sc.nextInt();
                    }catch (Exception e){
                        System.out.println("Invalid input. Try again.");
                        sc.nextLine();
                        continue;
                    }
                    break;
                }
                controller.deleteProduct(id);
                break;
            case 7:
                break;
        }
    }
}
