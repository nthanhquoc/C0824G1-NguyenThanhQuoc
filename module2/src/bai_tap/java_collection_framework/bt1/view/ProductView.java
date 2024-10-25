package bai_tap.java_collection_framework.bt1.view;

import bai_tap.java_collection_framework.bt1.controller.ProductController;
import bai_tap.java_collection_framework.bt1.enity.Product;

import java.util.ArrayList;
import java.util.Scanner;

public class ProductView {
    public static void main(String[] args) {
        ProductController controller = new ProductController();
        Scanner sc = new Scanner(System.in);
        int choice;
        int id;
        double price;
        String name;
        do {
            displayMenu();
            choice = inputValidation("choice", Integer.class, sc);
            switch (choice) {
                case 1:
                    controller.getAllProducts().forEach(System.out::println);
                    break;
                case 2:
                    controller.addProduct(new Product(inputValidation("id", Integer.class, sc),
                            inputValidation("name", String.class, sc),
                            inputValidation("price", Double.class, sc)));
                    controller.getAllProducts().forEach(System.out::println);
                    break;
                case 3:
                    id = inputValidation("id", Integer.class, sc);
                    Product product = controller.searchProduct(id);
                    if (product != null) {
                        System.out.println(product);
                    } else {
                        System.out.println("Product with id " + id + " not found.");
                    }
                    break;
                case 4:
                    System.out.println("Sort Products To Prices");
                    controller.sortProducts();
                    controller.getAllProducts().forEach(System.out::println);
                    break;
                case 5:
                    id = inputValidation("id", Integer.class, sc);
                    name = inputValidation("name", String.class, sc);
                    price = inputValidation("price", Double.class, sc);

                    if (!controller.editProduct(id, name, price)) {
                        System.out.println("Product with id " + id + " not found.");
                    } else {
                        controller.getAllProducts().forEach(System.out::println);
                    }
                    break;
                case 6:
                    id = inputValidation("id", Integer.class, sc);
                    if (!controller.deleteProduct(id)) {
                        System.out.println("Product with id " + id + " not found.");
                    } else {
                        System.out.println("Delete Success");
                        controller.getAllProducts().forEach(System.out::println);
                    }
                    break;
                case 7:
                    break;
            }
        } while (choice != 7);
    }

    private static void displayMenu() {
        System.out.println("1.Display Products");
        System.out.println("2.Add Product");
        System.out.println("3.Search Product");
        System.out.println("4.Sort Products");
        System.out.println("5.Edit Product");
        System.out.println("6.Delete Product");
        System.out.println("7.Exit");
    }

    public static <T> T inputValidation(String field, Class<T> type, Scanner sc) {
        while (true) {
            try {
                System.out.println("Input " + field + ":");
                if (type == Integer.class) {
                    return type.cast(sc.nextInt());
                } else if (type == Double.class) {
                    return type.cast(sc.nextDouble());
                } else if (type == String.class) {
                    return type.cast(sc.next());
                }
            } catch (Exception e) {
                System.out.println("Invalid input. Try again.");
                sc.nextLine();
            }
        }
    }
}
