package bai_tap.java_collection_framework.bt1.repo;

import bai_tap.java_collection_framework.bt1.enity.Product;

import java.util.ArrayList;

public class ProductRepo {
    public static  ArrayList<Product> products = new ArrayList<>();
    static {
        products.add(new Product(1,"Laptop",30000));
        products.add(new Product(2,"Tivi",40000));
        products.add(new Product(3,"Phone",50000));
    }
}
