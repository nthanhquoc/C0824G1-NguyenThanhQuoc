package com.example.productdatabase.service.implement;

import com.example.productdatabase.model.Product;
import com.example.productdatabase.repo.ProductRepository;
import com.example.productdatabase.service.IProductService;

import java.util.List;

public class ProductService implements IProductService {
    private static final ProductRepository productRepository = new ProductRepository();

    public List<Product>getAllProducts(){
        return productRepository.findAll();
    }
    public void addProduct(Product product){
        productRepository.addProduct(product);
    }
    public void deleteProduct(Integer productId){
        productRepository.deleteProduct(productId);
    }
    public void updateProduct(Product product){
        productRepository.updateProduct(product);
    }
    public Product getProductById(Integer id) {
        return productRepository.findProductById(id);
    }
    public List<Product> searchProductsByName(String query) {
        return productRepository.findProductsByName(query);
    }
}
