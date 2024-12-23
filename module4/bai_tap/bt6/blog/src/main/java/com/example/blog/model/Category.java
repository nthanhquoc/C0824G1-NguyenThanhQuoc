package com.example.blog.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "categorys")
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_category",columnDefinition = "INT")
    private Integer idCategory;
    @Column(name = "name_category",columnDefinition = "VARCHAR(50)")
    private String nameCategory;
}
