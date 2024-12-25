package com.example.book_management.service;

import com.example.book_management.model.Book;
import com.example.book_management.model.BorrowRecord;
import com.example.book_management.repository.BookRepository;
import com.example.book_management.repository.BorrowRecordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class BorrowRecordService implements IBorrowRecordService{
    @Autowired
    private BorrowRecordRepository borrowRecordRepository;
    @Autowired
    private BookRepository bookRepository;
    public List<BorrowRecord> getAll(){
        return borrowRecordRepository.findAll();
    }
    public void save(BorrowRecord blog){
        borrowRecordRepository.save(blog);
    }
    public void update(int id, BorrowRecord blog){
        borrowRecordRepository.save(blog);
    }
    public void remove(int id){
        borrowRecordRepository.deleteById(id);
    }
    public BorrowRecord findById(int id){
        return borrowRecordRepository.findById(id).orElse(null);
    }
    public BorrowRecord findByBorrowCodeAndReturnedFalse(String borrowCode){
        return borrowRecordRepository.findByBorrowCodeAndReturnedFalse(borrowCode);
    }

    public String borrowBook(Integer bookId) {
        Book book = bookRepository.findById(bookId).orElse(null);
        if (book == null || book.getNumber() <= 0) {
            throw new RuntimeException("Book is not available for borrowing!");
        }

        book.setNumber(book.getNumber() - 1);
        bookRepository.save(book);

        BorrowRecord record = new BorrowRecord();
        record.setBook(book);
        record.setBorrowCode(String.valueOf((int) (Math.random() * 90000 + 10000)));
        record.setBorrowDate(LocalDate.now());
        record.setReturned(false);

        borrowRecordRepository.save(record);
        return record.getBorrowCode();
    }

    public void returnBook(String borrowCode) {
        BorrowRecord record = borrowRecordRepository.findByBorrowCodeAndReturnedFalse(borrowCode);
        if (record == null) {
            throw new RuntimeException("Invalid borrow code!");
        }

        record.setReturned(true);
        borrowRecordRepository.save(record);

        Book book = record.getBook();
        book.setNumber(book.getNumber() + 1);
        bookRepository.save(book);
    }
}
