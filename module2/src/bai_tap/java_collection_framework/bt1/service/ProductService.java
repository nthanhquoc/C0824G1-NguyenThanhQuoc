package bai_tap.java_collection_framework.bt1.service;

import bai_tap.java_collection_framework.bt1.enity.Product;
import bai_tap.java_collection_framework.bt1.repo.ProductRepo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProductService implements IProductService {
    @Override
    public void sortProduct() {
        Collections.sort(ProductRepo.getProducts());
    }
    @Override
    public void addProduct(Product product) {
        ProductRepo.getProducts().add(product);
    }
    @Override
    public boolean editProduct(int id, String name, double price) {
        for (Product product : ProductRepo.getProducts()) {
            if (product.getId() == id) {
                product.setName(name);
                product.setPrice(price);
                return true;
            }
        }
        return false;
    }
    @Override
    public boolean deleteProduct(int id) {
        return ProductRepo.getProducts().removeIf(product -> product.getId() == id);
    }

    @Override
    public Product searchProduct(int id) {
        for(Product product : ProductRepo.getProducts()){
            if(product.getId()==id){
                return product;
            }
        }
        return null;
    }

    @Override
    public List<Product> getAllProducts() {
        return new ArrayList<>(ProductRepo.getProducts());
    }
}

