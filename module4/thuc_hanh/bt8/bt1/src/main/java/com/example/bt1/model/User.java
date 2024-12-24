package com.example.bt1.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id",columnDefinition = "INT")
    private Integer id;
    @NotEmpty
    @Size(min = 2, max = 50)
    @Column(name = "name",columnDefinition = "VARCHAR(50)")
    private String name;
    @Min(18)
    @Column(name = "age",columnDefinition ="INT")
    private int age;
}
