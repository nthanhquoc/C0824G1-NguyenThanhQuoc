package bai_tap.binaryfile_serialization.view;

import bai_tap.binaryfile_serialization.controller.ProductController;
import bai_tap.binaryfile_serialization.entity.Product;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while (true) {
            System.out.println("-----Menu Product-----");
            System.out.println("1. Display Product");
            System.out.println("2. Add Product");
            System.out.println("3. Find Product");
            System.out.println("4. Exit");
            Scanner sc = new Scanner(System.in);
            int choice = 0;
            while(true) {
                try {
                    System.out.print("Enter your choice: ");
                    choice = Integer.parseInt(sc.nextLine());
                    if(choice > 4 || choice < 1) {
                        System.out.println("Invalid choice, please enter between 1 and 4.");
                        continue;
                    }
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input. Please enter a number between 1 and 4.");
                }
            }
            List<Product> products;
            ProductController productController = new ProductController();
            switch (choice) {
                case 1:
                    products = productController.getProducts();
                    for (Product product : products) {
                        System.out.println(product);
                    }
                    break;
                case 2:
                    Product newProduct = inputProduct();
                    productController.addProduct(newProduct);
                    System.out.println("Product added successfully.");
                    products = productController.getProducts();
                    for (Product product : products) {
                        System.out.println(product);
                    }
                    break;
                case 3:
                    System.out.print("Enter product ID: ");
                    int productID;
                    try {
                        productID = Integer.parseInt(sc.nextLine());
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid product ID.");
                        continue;
                    }

                    products = productController.getProducts();
                    boolean foundProduct = false;
                    for (Product product : products) {
                        if(product.getId() == productID) {
                            System.out.println(product);
                            foundProduct = true;
                            break;
                        }
                    }
                    if(!foundProduct) {
                        System.out.println("Product not found.");
                    }
                    break;
                case 4:
                    return;
            }
        }
    }
    public static Product inputProduct(){
        Scanner sc = new Scanner(System.in);
        int id;
        String name;
        double price;
        String manufacturer;
        String description;
        while(true){
            try{
                System.out.print("Input Product ID: ");
                id = Integer.parseInt(sc.nextLine());
                if (id < 0) {
                    System.out.println("ID Must be a positive integer.");
                    continue;
                }
                break;
            } catch (Exception e) {
                System.out.println("Invalid input. Try again.");
            }

        }
        while(true){
            try{
                System.out.print("Input Product Name: ");
                name = sc.nextLine();
                break;
            } catch (Exception e) {
                System.out.println("Invalid input. Try again.");
            }
        }
        while(true){
            try{
                System.out.print("Input Product Price: ");
                price = Double.parseDouble(sc.nextLine());
                break;
            } catch (Exception e) {
                System.out.println("Invalid input. Try again.");
            }
        }
        while(true){
            try{
                System.out.print("Input Product Manufacturer: ");
                manufacturer = sc.nextLine();
                break;
            }
            catch(Exception e){
                System.out.println("Invalid input. Try again.");
            }
        }
        while(true){
            try{
                System.out.print("Input Product Description: ");
                description = sc.nextLine();
                break;
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
        return new Product(id, name, price, manufacturer, description);
    }
}
