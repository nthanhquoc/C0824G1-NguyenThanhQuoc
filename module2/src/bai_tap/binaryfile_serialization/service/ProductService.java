package bai_tap.binaryfile_serialization.service;

import bai_tap.binaryfile_serialization.entity.Product;
import bai_tap.binaryfile_serialization.repo.ProductRepo;

import java.util.List;

public class ProductService implements IProductService {
    private static ProductRepo productRepo = new ProductRepo();
    @Override
    public List<Product>getProducts(){
        List<Product> products = productRepo.getProducts();
        return products;
    }

    public void addProduct(Product product){
        productRepo.addProduct(product);
    }
}
