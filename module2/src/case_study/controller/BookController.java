package case_study.controller;

import case_study.entity.Book;
import case_study.service.BookService;
import case_study.service.IBookService;

import java.util.List;

public class BookController {
    private static IBookService bookService = new BookService();

    public List<Book> getBooks() {
        List<Book> products = bookService.getBooks();
        return products;
    }
    public void addBook(Book book) {
        bookService.addBook(book);
    }
    public boolean editBook(Book book) {
        return bookService.editBook(book);
    }
    public boolean deleteBook(int id){
        return bookService.deleteBook(id);
    }
    public List<Book> displayAllBookSortById(){
        return bookService.getAllSortById();
    }
    public List<Book> displayAllBookSortByName(){
        return bookService.getAllSortByName();
    }
    public Book findBookById(int id) {
        return bookService.findBookById(id);
    }
}
