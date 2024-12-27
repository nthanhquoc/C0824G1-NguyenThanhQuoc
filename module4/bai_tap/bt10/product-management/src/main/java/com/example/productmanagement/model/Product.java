package com.example.productmanagement.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id",columnDefinition = "INT")
    private Integer id;
    @Column(name = "name",columnDefinition = "VARCHAR(55)")
    private String name;
    @Column(name = "description",columnDefinition = "TEXT")
    private String description;
    @Column(name = "price",columnDefinition = "DOUBLE")
    private Double price;
    @Column(name = "image",columnDefinition = "TEXT")
    private String image;

}
