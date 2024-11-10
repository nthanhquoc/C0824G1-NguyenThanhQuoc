package case_study.service;

import case_study.controller.BookController;
import case_study.entity.Book;
import case_study.repo.BookRepo;
import case_study.utils.sort_book.ComparatorBookById;
import case_study.utils.sort_book.ComparatorBookByName;

import java.util.List;

public class BookService implements IBookService {
    private static BookRepo bookRepo = new BookRepo();

    private static BookService instance;
    private BookService() {}

    public static synchronized BookService getInstance() {
        if (instance == null) {
            instance = new BookService();
        }
        return instance;
    }
    @Override
    public List<Book> getBooks() {
        List<Book> products = bookRepo.getBooks();
        return products;
    }

    @Override
    public void addBook(Book book) {
        bookRepo.addBook(book);
    }

    @Override
    public boolean editBook(Book book) {
        return bookRepo.editBook(book);
    }

    public boolean deleteBook(int id) {
        return bookRepo.deleteBook(id);
    }

    public List<Book> getAllSortById() {
        List<Book> books = bookRepo.getBooks();
        books.sort(new ComparatorBookById());
        return books;
    }

    public List<Book> getAllSortByName() {
        List<Book> books = bookRepo.getBooks();
        books.sort(new ComparatorBookByName());
        return books;
    }

    public Book findBookById(int id) {
        return bookRepo.findBookById(id);
    }
}
