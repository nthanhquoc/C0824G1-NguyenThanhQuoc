package com.example.productdatabase.model;

public class Product {
    private Integer idProduct;
    private String productName;
    private Double price;
    private String description;
    public Product() {
    }
    public Product(Integer idProduct, String productName, Double price, String description) {
        this.idProduct = idProduct;
        this.productName = productName;
        this.price = price;
        this.description = description;
    }
    public Integer getIdProduct() {
        return idProduct;
    }
    public void setIdProduct(Integer idProduct) {
        this.idProduct = idProduct;
    }
    public String getProductName() {
        return productName;
    }
    public void setProductName(String productName) {
        this.productName = productName;
    }
    public Double getPrice() {
        return price;
    }
    public void setPrice(Double price) {
        this.price = price;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
}
