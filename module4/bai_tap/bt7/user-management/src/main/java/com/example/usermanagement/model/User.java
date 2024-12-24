package com.example.usermanagement.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
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
    @Column(name = "id", columnDefinition = "INT")
    private Integer id;

    @NotEmpty(message = "First name not must be empty")
    @Size(min = 5, max = 45, message = "First name must be between 5 and 45 Character")
    @Column(name = "first_name", columnDefinition = "VARCHAR(50)")
    private String firstName;

    @NotEmpty(message = "Last Name not must be empty")
    @Size(min = 5, max = 45, message = "Last name must be between 5 and 45 Character")
    @Column(name = "last_name", columnDefinition = "VARCHAR(50)")
    private String lastName;

    @NotNull(message = "Phone number must not be null")
    @Pattern(regexp = "^(\\+?[0-9]{1,4})?[0-9]{7,15}$", message = "Phone number is invalid")
    @Column(name = "number", columnDefinition = "VARCHAR(15)")
    private String number;

    @NotNull(message = "Age must not be null")
    @Min(value = 18,message ="Age must be at least 18")
    @Column(name = "age",columnDefinition = "INT")
    private Integer age;

    @NotEmpty(message = "Email must not be empty")
    @Pattern(regexp = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}$", message = "Email should be valid")
    @Column(name = "email", columnDefinition = "VARCHAR(50)")
    private String email;
}
