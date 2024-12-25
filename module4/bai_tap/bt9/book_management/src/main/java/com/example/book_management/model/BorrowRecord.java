package com.example.book_management.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@Entity(name = "borrow_records")
public class BorrowRecord {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "book_id",referencedColumnName ="id")
    private Book book;

    @Column(name = "borrow_code", columnDefinition = "VARCHAR(10)", nullable = false)
    private String borrowCode;

    @Column(name = "borrow_date", nullable = false)
    private LocalDate borrowDate;

    @Column(name = "returned", columnDefinition = "BOOLEAN DEFAULT false")
    private Boolean returned;
}
