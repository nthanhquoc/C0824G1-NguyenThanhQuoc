package com.example.book_management.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "books")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id",columnDefinition = "INT")
    private Integer id;
    @Column(name = "title",columnDefinition = "VARCHAR(50)")
    private String title;
    @Column(name = "description",columnDefinition = "TEXT")
    private String description;
    @Column(name = "number",columnDefinition = "INT")
    private Integer number;

    @Transient
    private String borrowCode;
}
