package bai_tap.binaryfile_serialization.service;

import bai_tap.binaryfile_serialization.entity.Product;

import java.util.List;

public interface IProductService<E> {
   List<E> getProducts();
   void addProduct(Product product);
   boolean editProduct(Product product);
   boolean deleteProduct(int productId);
}
