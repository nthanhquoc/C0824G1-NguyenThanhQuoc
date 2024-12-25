package com.example.book_management.service;

import com.example.book_management.model.Book;

import java.util.List;

public interface IBookService {
    List<Book> findAll();
    void save(Book book);
    void update(int id,Book book);
    Book findById(int id);
}
