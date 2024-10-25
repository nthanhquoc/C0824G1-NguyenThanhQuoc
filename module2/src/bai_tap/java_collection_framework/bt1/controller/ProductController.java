package bai_tap.java_collection_framework.bt1.controller;

import bai_tap.java_collection_framework.bt1.enity.Product;
import bai_tap.java_collection_framework.bt1.service.ProductService;

import java.util.ArrayList;

public class ProductController {
    private ProductService productService;

    public ProductController() {
        productService = new ProductService();
    }

    public void addProduct(Product product) {
        productService.addProduct(product);
        displayProducts();
    }

    public void editProduct(int id, String newName, double newPrice) {
        productService.editProduct(id, newName, newPrice);
        displayProducts();
    }

    public void deleteProduct(int id) {
        productService.deleteProduct(id);
        displayProducts();
    }

    public void displayProducts() {
        ArrayList<Product> products = productService.getAllProducts();
        for (Product product : products) {
            System.out.println(product);
        }
    }

    public void displayProduct(Product product) {
        if (product != null) {
            System.out.println(product);
        } else {
            System.out.println("Product not found.");
        }
    }
    public void sortProducts() {
        productService.sortProduct();
        displayProducts();
    }

    public void searchProduct(int id) {
        Product product = productService.searchProduct(id);
    }
}
