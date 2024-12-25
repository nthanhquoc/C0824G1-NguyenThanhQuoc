package com.example.book_management.repository;


import com.example.book_management.model.BorrowRecord;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BorrowRecordRepository extends JpaRepository<BorrowRecord, Integer> {
    BorrowRecord findByBorrowCodeAndReturnedFalse(String borrowCode);
}