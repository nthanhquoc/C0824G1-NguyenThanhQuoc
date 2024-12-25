package com.example.book_management.controller;

import com.example.book_management.model.Book;
import com.example.book_management.service.IBookService;
import com.example.book_management.service.IBorrowRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;


@Controller
@RequestMapping("/books")
public class BookController {
    @Autowired
    private IBookService bookService;
    @Autowired
    private IBorrowRecordService borrowRecordService;
    @GetMapping
    public String showInfoBook(Model model) {
        model.addAttribute("books", bookService.findAll());
        return "books";
    }

    @GetMapping("/add")
    public String showAddForm(Model model){
        model.addAttribute("book", new Book());
        return "add";
    }
    @PostMapping("/add")
    public String addBook(@Validated @ModelAttribute("book") Book book, BindingResult bindingResult){
        if(bindingResult.hasErrors()){
            return "add";
        }
        bookService.save(book);
        return "redirect:/books";
    }

    @GetMapping("/borrow/{id}")
    public String showBorrowPage(@PathVariable("id") Integer id, Model model) {
        Book book = bookService.findById(id);
        if (book == null || book.getNumber() <= 0) {
            model.addAttribute("message", "Book is not available for borrowing!");
            return "borrow";
        }
        model.addAttribute("book", book);
        return "borrow";
    }

    @PostMapping("/borrow/{id}")
    public String borrowBook(@PathVariable("id") Integer id, Model model) {
        try {
            String borrowCode = borrowRecordService.borrowBook(id);
            model.addAttribute("borrowCode", borrowCode);
        } catch (RuntimeException e) {
            model.addAttribute("message", e.getMessage());
        }
        model.addAttribute("book", bookService.findById(id));
        return "borrow";
    }

    @GetMapping("/return")
    public String returnBookForm() {
        return "return";
    }

    @PostMapping("/return")
    public String returnBook(@RequestParam("borrowCode") String borrowCode, Model model) {
        try {
            borrowRecordService.returnBook(borrowCode);
            model.addAttribute("message", "Return successful!");
        } catch (RuntimeException e) {
            model.addAttribute("message", e.getMessage());
        }
        return "return";
    }
}
