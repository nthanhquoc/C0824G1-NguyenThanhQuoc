package com.example.productmanagement.service;

import com.example.productmanagement.model.Product;

import java.util.List;

public interface IProductService {
     List<Product> findAll();
    void save(Product product);
    Product findById(int id);
    boolean update(int id, Product customer);
    boolean remove(int id);
}
