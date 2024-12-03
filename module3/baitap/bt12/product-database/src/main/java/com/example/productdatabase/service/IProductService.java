package com.example.productdatabase.service;

import com.example.productdatabase.model.Product;

import java.util.List;

public interface IProductService {
    public List<Product> getAllProducts();
    public void addProduct(Product product);
    public void deleteProduct(Integer id);
    public void updateProduct(Product product);
    public Product getProductById(Integer id) ;

}
