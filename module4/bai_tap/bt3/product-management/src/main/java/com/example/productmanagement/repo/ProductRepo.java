package com.example.productmanagement.repo;

import com.example.productmanagement.model.Product;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityTransaction;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class ProductRepo {
    private static List<Product> products = new ArrayList<>();


    public List<Product> findAll() {
//        return new ArrayList<>(products.values());
        List<Product>products =BaseRepository.entityManager.createQuery("from product ", Product.class).getResultList();
        return products;
    }


    public void save(Product product) {
//        products.add(product);
        EntityTransaction transaction  = BaseRepository.entityManager.getTransaction();
        transaction.begin();
        BaseRepository.entityManager.persist(product);
        transaction.commit();
    }


    public Product findById(int id) {
//        return products.get(id);
        return BaseRepository.entityManager.find(Product.class, id);
    }

    public void update(int id, Product product) {
//        products.add(id, customer);
        EntityTransaction transaction = BaseRepository.entityManager.getTransaction();
        transaction.begin();

        Product existingProduct = BaseRepository.entityManager.find(Product.class, id);
        if (existingProduct != null) {
            product.setId(id);
            BaseRepository.entityManager.merge(product);
        }

        transaction.commit();
    }

    public void remove(int id) {
        EntityTransaction transaction = BaseRepository.entityManager.getTransaction();
        transaction.begin();
        Product product = BaseRepository.entityManager.find(Product.class, id);
        if (product != null) {
            BaseRepository.entityManager.remove(product);
        }
        transaction.commit();
    }
}
