package bai_tap.java_collection_framework.bt1.service;

import bai_tap.java_collection_framework.bt1.enity.Product;

import java.util.ArrayList;

public interface IProductService {
    void sortProduct();
    void addProduct(Product product);
    void editProduct(int id, String name, double price);
    void deleteProduct(int id);
    Product searchProduct(int id);
    ArrayList<Product> getAllProducts();

}
