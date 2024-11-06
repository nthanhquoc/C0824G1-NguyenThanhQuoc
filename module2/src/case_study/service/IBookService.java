package case_study.service;

import case_study.entity.Book;

import java.util.List;

public interface IBookService<E> {
    List<Book> getBooks();

    void addBook(Book book);

    boolean editBook(Book book);

    boolean deleteBook(int id);

    List<Book> getAllSortById();

    List<Book> getAllSortByName();

    Book findBookById(int id);

}
