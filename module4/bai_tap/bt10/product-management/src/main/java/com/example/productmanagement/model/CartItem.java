package com.example.productmanagement.model;

import jakarta.persistence.Entity;

import java.util.HashMap;
import java.util.Map;

public class CartItem {
    private Map<Product, Integer> products = new HashMap<>();

    public CartItem() {

    }

    public CartItem(Map<Product, Integer> products) {
        this.products = products;
    }

    public Map<Product, Integer> getProducts() {
        return products;
    }

    private Map.Entry<Product, Integer> findItemInCart(Product product) {
        return products.entrySet()
                .stream()
                .filter(entry -> entry.getKey().getId().equals(product.getId()))
                .findFirst()
                .orElse(null);
    }

    public void addProduct(Product product) {
        Map.Entry<Product, Integer> itemEntry = findItemInCart(product);
        if (itemEntry == null) {
            products.put(product, 1);
        } else {
            products.replace(itemEntry.getKey(), itemEntry.getValue() + 1);
        }
    }

    public Integer countProductQuantity() {
        Integer productQuantity = 0;
        for (Map.Entry<Product, Integer> entry : products.entrySet()) {
            productQuantity += entry.getValue();
        }
        return productQuantity;
    }

    public Integer countItemQuantity() {
        return products.size();
    }

    public void incrementProductQuantity(Product product) {
        Map.Entry<Product, Integer> itemEntry = findItemInCart(product);
        if (itemEntry != null) {
            products.replace(itemEntry.getKey(), itemEntry.getValue() + 1);
        } else {
            products.put(product, 1);
        }
    }

    public void decrementProductQuantity(Product product) {
        Map.Entry<Product, Integer> itemEntry = findItemInCart(product);
        if (itemEntry != null) {
            if (itemEntry.getValue() > 1) {
                products.replace(itemEntry.getKey(), itemEntry.getValue() - 1);
            } else {
                products.remove(itemEntry.getKey());
            }
        }
    }

    public Float countTotalPayment() {
        float payment = 0;
        for (Map.Entry<Product, Integer> entry : products.entrySet()) {
            payment += entry.getKey().getPrice() * (float) entry.getValue();
        }
        return payment;
    }

    public void removeProduct(Product product) {
        Map.Entry<Product, Integer> itemEntry = findItemInCart(product);
        if (itemEntry != null) {
            products.remove(itemEntry.getKey());
        }
    }
}
