package bai_tap.java_collection_framework.bt1.enity;

public class Product implements Comparable<Product> {
    private int id;
    private String name;
    private double price;

    public Product() {
        this.id = 1;
        this.name = "";
        this.price = 0;
    }

    public Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return this.id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return this.price;
    }

    @Override
    public String toString() {
        return "Product [id=" + id + ", name=" + name + ", price=" + price + "]";
    }
    @Override
    public int compareTo(Product o) {
        return Double.compare(this.price, o.price);
    }
}
