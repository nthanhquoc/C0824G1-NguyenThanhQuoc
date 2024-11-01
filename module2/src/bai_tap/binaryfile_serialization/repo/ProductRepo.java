package bai_tap.binaryfile_serialization.repo;

import bai_tap.binaryfile_serialization.entity.Product;
import thuc_hanh.Student;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ProductRepo {
    private static List<Product> products = new ArrayList<>();

    static {
        products.add(new Product(1, "Dien Thoai Nokia", 300000, "Nokia", "abc"));
        products.add(new Product(2, "Dien Thoai SamSung", 300000, "Samsung", "abc"));
        products.add(new Product(3, "Dien Thoai Iphone", 300000, "IPhone", "abc"));
        File file = new File("module2/src/bai_tap/binaryfile_serialization/data/product.dat");
        try {
            FileOutputStream out = new FileOutputStream(file);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(out);
            objectOutputStream.writeObject(products);
            objectOutputStream.close();
            out.close();
        } catch (Exception e) {
            System.out.println("Lỗi");
        }
    }

    public static List<Product> getProducts() {
        List<Product> products = new ArrayList<>();
        File file = new File("module2/src/bai_tap/binaryfile_serialization/data/product.dat");
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            products = (List<Product>) objectInputStream.readObject();
            objectInputStream.close();
            fileInputStream.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return products;
    }

    public static void addProduct(Product product) {
        File file = new File("module2/src/bai_tap/binaryfile_serialization/data/product.dat");
        List<Product> products = getProducts();
        for (Product p : products) {
            if (p.getId() == product.getId()) {
                System.out.println("ID is in the list");
                return;
            }
        }
        products.add(product);
        try (FileOutputStream out = new FileOutputStream(file);
             ObjectOutputStream objectOutputStream = new ObjectOutputStream(out)) {
            objectOutputStream.writeObject(products);
            System.out.println("File updated successfully.");
        } catch (Exception e) {
            System.out.println("Error updating file: " + e.getMessage());
            e.printStackTrace();
        }
    }
    public static boolean editProduct(Product product) {
        List<Product> products1 = getProducts();
        boolean found=false;
        for (int i = 0; i < products1.size(); i++) {
            if (products1.get(i).getId() == product.getId()) {
                products1.set(i, product);
                found = true;
                break;
            }
        }
        if (found) {
            saveProducts(products1);
        }
        return found;
    }
    public static boolean deleteProduct(int productID){
        List<Product> products1 = getProducts();
        boolean found=false;
        for (int i = 0; i < products1.size(); i++) {
            if (products1.get(i).getId() == productID) {
                products1.remove(i);
                found=true;
                break;
            }
        }
        if (found) {
            saveProducts(products1);
        }
        return found;
    }
    private static void saveProducts(List<Product> products) {
        File file = new File("module2/src/bai_tap/binaryfile_serialization/data/product.dat");
        try (FileOutputStream out = new FileOutputStream(file);
             ObjectOutputStream objectOutputStream = new ObjectOutputStream(out)) {
            objectOutputStream.writeObject(products);
        } catch (Exception e) {
            System.out.println("Error saving products: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
