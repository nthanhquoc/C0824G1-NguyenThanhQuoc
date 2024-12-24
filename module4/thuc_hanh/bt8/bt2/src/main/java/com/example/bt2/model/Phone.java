package com.example.bt2.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "phones")
public class Phone {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id",columnDefinition = "INT")
    private Integer id;

    @NotEmpty(message = "Phone number cannot be empty") // Không được để trống
    @Pattern(regexp = "^0[0-9]{9,10}$", message = "Phone number must start with 0, contain only numbers, and be 10-11 digits long")
    @Size(min = 10, max = 11, message = "Phone number must be between 10 and 11 characters") // Độ dài từ 10-11 ký tự
    @Column(name = "phone",columnDefinition = "VARCHAR(12)")
    private String number;
}
