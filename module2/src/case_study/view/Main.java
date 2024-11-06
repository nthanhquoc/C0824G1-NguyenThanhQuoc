package case_study.view;

import case_study.controller.BookController;
import case_study.entity.Book;

import java.util.List;
import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);
    private static final BookController bookController = new BookController();

    public static void main(String[] args) {
        while (true) {
            System.out.println("------MENU------");
            System.out.println("1. BOOK");
            System.out.println("2. MEMBER");
            System.out.println("3. EXIT");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    bookMenu();
                    break;
                case 2:
                    memberMenu();
                    break;
                case 3:
                    System.out.println("Exiting program...");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void bookMenu() {
        while (true) {
            System.out.println("------MENU BOOK------");
            System.out.println("1. Display Books");
            System.out.println("2. Add Book");
            System.out.println("3. Edit Book");
            System.out.println("4. Delete Book");
            System.out.println("5. Find Book By ID");
            System.out.println("6. Sort Books By ID or Title");
            System.out.println("7. Back to Main Menu");
            System.out.print("Enter your choice: ");
            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    displayBooks();
                    break;
                case 2:
                    addBook();
                    break;
                case 3:
                    editBook();
                    break;
                case 4:
                    deleteBook();
                    break;
                case 5:
                    findBookById();
                    break;
                case 6:
                    sortBooks();
                    break;
                case 7:
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }

    private static void displayBooks() {
        List<Book> books = bookController.getBooks();
        books.forEach(System.out::println);
    }

    private static void addBook() {
        System.out.print("Input Book ID: ");
        int id = scanner.nextInt();
        System.out.print("Input Book Title: ");
        String title = scanner.next();
        System.out.print("Input Book Author: ");
        String author = scanner.next();

        Book newBook = new Book(id, title, author);
        bookController.addBook(newBook);
        System.out.println("Book added successfully.");
        displayBooks();
    }

    private static void editBook() {
        System.out.print("Input Book ID: ");
        int id = scanner.nextInt();
        System.out.print("Input Book Title: ");
        String title = scanner.next();
        System.out.print("Input Book Author: ");
        String author = scanner.next();

        Book updatedBook = new Book(id, title, author);
        if (bookController.editBook(updatedBook)) {
            System.out.println("Book edited successfully.");
            displayBooks();
        } else {
            System.out.println("Book not found.");
        }
    }

    private static void deleteBook() {
        System.out.print("Input Book ID to delete: ");
        int id = scanner.nextInt();

        if (bookController.deleteBook(id)) {
            System.out.println("Book deleted successfully.");
            displayBooks();
        } else {
            System.out.println("Book not found.");
        }
    }

    private static void findBookById() {
        System.out.print("Input Book ID to find: ");
        int id = scanner.nextInt();

        Book book = bookController.findBookById(id);
        if (book != null) {
            System.out.println(book);
        } else {
            System.out.println("Book not found.");
        }
    }

    private static void sortBooks() {
        System.out.println("Choose sorting option:");
        System.out.println("1. Sort By ID");
        System.out.println("2. Sort By Title");
        System.out.print("Enter your choice: ");
        int sortChoice = scanner.nextInt();

        List<Book> books;
        if (sortChoice == 1) {
            books = bookController.displayAllBookSortById();
        } else if (sortChoice == 2) {
            books = bookController.displayAllBookSortByName();
        } else {
            System.out.println("Invalid choice.");
            return;
        }

        books.forEach(System.out::println);
    }

    private static void memberMenu() {
        System.out.println("Member functionality is under construction.");
    }
}
