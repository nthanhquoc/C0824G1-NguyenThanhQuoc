package com.example.blog.model;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@Entity(name ="blogs")
public class Blog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id",columnDefinition = "INT")
    private Integer id;
    @Column(name="title",columnDefinition = "VARCHAR(50)")
    private String title;
    @Column(name="content",columnDefinition = "TEXT")
    private String content;
    @Column(name = "author",columnDefinition = "VARCHAR(50)")
    private String author;
    @ManyToOne
    @JoinColumn(name = "id_category",referencedColumnName = "id_category")
    private Category category;
}
