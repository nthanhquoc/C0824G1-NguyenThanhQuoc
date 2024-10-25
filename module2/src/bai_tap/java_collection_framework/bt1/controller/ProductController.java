package bai_tap.java_collection_framework.bt1.controller;

import bai_tap.java_collection_framework.bt1.enity.Product;
import bai_tap.java_collection_framework.bt1.service.ProductService;

import java.util.ArrayList;
import java.util.List;

public class ProductController {
    private ProductService productService;

    public ProductController() {
        productService = new ProductService();
    }

    public void addProduct(Product product) {
        productService.addProduct(product);
    }

    public boolean editProduct(int id, String newName, double newPrice) {
        return productService.editProduct(id, newName, newPrice);
    }

    public boolean deleteProduct(int id) {
        return productService.deleteProduct(id);
    }

    public void sortProducts() {
        productService.sortProduct();
    }
    public List<Product> getAllProducts(){
        return productService.getAllProducts();
    }
    public Product searchProduct(int id) {
        return productService.searchProduct(id);
    }
}
