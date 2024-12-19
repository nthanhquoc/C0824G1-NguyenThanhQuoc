package com.example.productmanagement.service;


import com.example.productmanagement.model.Product;
import com.example.productmanagement.repo.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.annotation.AliasFor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService implements IProductService {
    @Autowired
    private ProductRepo productRepo;

    public List<Product>findAll() {
        return productRepo.findAll();
    }
    public void save(Product product) {
        productRepo.save(product);
    }
    public Product findById(int id) {
        return productRepo.findById(id);
    }
    public void update(int id, Product product) {
        productRepo.update(id, product);
    }
    public void remove(int id) {
        productRepo.remove(id);
    }

}
