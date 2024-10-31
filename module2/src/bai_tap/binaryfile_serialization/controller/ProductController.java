package bai_tap.binaryfile_serialization.controller;

import bai_tap.binaryfile_serialization.entity.Product;
import bai_tap.binaryfile_serialization.service.IProductService;
import bai_tap.binaryfile_serialization.service.ProductService;

import java.util.List;

public class ProductController {
    private static IProductService productService= new ProductService();
    public List<Product> getProducts() {
        List<Product> products = productService.getProducts();
        return products;
    }
    public void addProduct(Product product) {
        productService.addProduct(product);
    }
}
