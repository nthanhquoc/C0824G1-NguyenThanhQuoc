package com.example.productdatabase.repo;

import com.example.productdatabase.model.Product;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProductRepository {
    public List<Product> findAll() {
        List<Product> products = new ArrayList<>();
        try {
            PreparedStatement statement = BaseRepository.getConnection().prepareStatement("select * from products");
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                Integer idProduct = resultSet.getInt("id");
                String productName = resultSet.getString("name");
                Double price = resultSet.getDouble("price");
                String description = resultSet.getString("description");
                products.add(new Product(idProduct, productName, price, description));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return products;
    }

    public void addProduct(Product product) {
        try {
            PreparedStatement statement = BaseRepository.getConnection().prepareStatement("insert into products(id,name,price,description) values (?,?,?,?)");
            statement.setInt(1, product.getIdProduct());
            statement.setString(2, product.getProductName());
            statement.setDouble(3, product.getPrice());
            statement.setString(4, product.getDescription());
            statement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void updateProduct(Product product) {
        try {
            PreparedStatement statement = BaseRepository.getConnection().prepareStatement("UPDATE products SET name = ?, price = ?, description = ? WHERE id = ?");
            statement.setString(1, product.getProductName());
            statement.setDouble(2, product.getPrice());
            statement.setString(3, product.getDescription());
            statement.setInt(4, product.getIdProduct());
            statement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public Product findProductById(Integer id) {
        try {
            PreparedStatement statement = BaseRepository.getConnection().prepareStatement("SELECT * FROM products WHERE id = ?");
            statement.setInt(1, id);
            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()) {
                Integer productId = resultSet.getInt("id");
                String productName = resultSet.getString("name");
                Double price = resultSet.getDouble("price");
                String description = resultSet.getString("description");
                return new Product(productId, productName, price, description);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return null;
    }

    public void deleteProduct(Integer ProductId) {
        try {
            PreparedStatement statement = BaseRepository.getConnection().prepareStatement("delete from products where id = ?");
            statement.setInt(1, ProductId);
            statement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
