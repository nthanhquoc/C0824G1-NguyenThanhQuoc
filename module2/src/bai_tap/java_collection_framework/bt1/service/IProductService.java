package bai_tap.java_collection_framework.bt1.service;

import bai_tap.java_collection_framework.bt1.enity.Product;

import java.util.ArrayList;
import java.util.List;

public interface IProductService {
    void sortProduct();
    void addProduct(Product product);
    boolean editProduct(int id, String name, double price);
    boolean deleteProduct(int id);
    Product searchProduct(int id);
    List<Product> getAllProducts();

}
