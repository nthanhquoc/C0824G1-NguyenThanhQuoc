package bai_tap.java_collection_framework.bt1.service;

import bai_tap.java_collection_framework.bt1.enity.Product;
import bai_tap.java_collection_framework.bt1.repo.ProductRepo;

import java.util.ArrayList;
import java.util.Collections;

public class ProductService {
    public void sortProduct() {
        Collections.sort(ProductRepo.products);
    }

    public void addProduct(Product product) {
        ProductRepo.products.add(product);
    }

    public void editProduct(int id, String name, double price) {
        for (Product product : ProductRepo.products) {
            if (product.getId() == id) {
                product.setName(name);
                product.setPrice(price);
                return;
            }
            System.out.println("Product with id " + id + " not found.");
        }
    }

    public void deleteProduct(int id) {
        ProductRepo.products.removeIf(product -> product.getId() == id);
    }
    public Product searchProduct(String name) {
        for(Product product : ProductRepo.products){
            if(product.getName().equals(name)){
                System.out.println(product);
                return product;
            }

        }
        System.out.println("Product with name " + name + " not found.");
        return null;
    }
    public ArrayList<Product> getAllProducts() {
        return ProductRepo.products;
    }
}

