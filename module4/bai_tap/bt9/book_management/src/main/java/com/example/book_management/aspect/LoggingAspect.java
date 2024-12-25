package com.example.book_management.aspect;

import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    private int visitCount = 0;

    @Before("execution(* com.example.book_management.controller.BookController.*(..))")
    public void logVisit() {
        visitCount++;
        System.out.println("Total visits: " + visitCount);
    }

    @AfterReturning(pointcut = "execution(* com.example.book_management.service.IBorrowRecordService.borrowBook(..))", returning = "borrowCode")
    public void logBorrowAction(String borrowCode) {
        System.out.println("Book borrowed successfully. Borrow code: " + borrowCode);
    }

    @AfterReturning("execution(* com.example.book_management.service.IBorrowRecordService.returnBook(..))")
    public void logReturnAction() {
        System.out.println("Book returned successfully.");
    }

    @AfterThrowing(pointcut = "execution(* com.example.book_management.controller.BookController.*(..))", throwing = "ex")
    public void logError(Exception ex) {
        System.out.println("Error occurred: " + ex.getMessage());
    }
}
