package case_study.repo;

import bai_tap.binaryfile_serialization.entity.Product;
import case_study.entity.Book;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class BookRepo {
    private static List<Book> books = new ArrayList<>();

    static {
        books.add(new Book(1, "Onepiece", "Oda", true));
        books.add(new Book(2, "Twopiece", "James", true));
        books.add(new Book(3, "Threepiece", "John", true));
        File file = new File("module2/src/case_study/data/Book.dat");
        try {
            FileOutputStream out = new FileOutputStream(file);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(out);
            objectOutputStream.writeObject(books);
            objectOutputStream.close();
            out.close();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static List<Book> getBooks() {
        List<Book> books = new ArrayList<>();
        File file = new File("module2/src/case_study/data/Book.dat");
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            books = (List<Book>) objectInputStream.readObject();
            objectInputStream.close();
            fileInputStream.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return books;
    }

    public static void addBook(Book book) {
        File file = new File("module2/src/case_study/data/Book.dat");
        List<Book> books = getBooks();
        for (Book book1 : books) {
            if (book1.getId() == book.getId()) {
                System.out.println("ID is in the list");
                return;
            }
        }
        books.add(book);
        try (FileOutputStream out = new FileOutputStream(file);
             ObjectOutputStream objectOutputStream = new ObjectOutputStream(out)) {
            objectOutputStream.writeObject(books);
            System.out.println("File updated successfully.");
        } catch (Exception e) {
            System.out.println("Error updating file: " + e.getMessage());
            e.printStackTrace();
        }
    }

    public static boolean editBook(Book book) {
        List<Book> books = getBooks();
        boolean found = false;
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getId() == book.getId()) {
                books.set(i, book);
                found = true;
                break;
            }
        }
        if (found) {
            saveBooks(books);
        }
        return found;
    }

    public static boolean deleteBook(int id) {
        List<Book> books = getBooks();
        boolean found = false;
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getId() == id) {
                books.remove(i);
                found = true;
                break;
            }
        }
        if (found) {
            saveBooks(books);
        }
        return found;
    }

    private static void saveBooks(List<Book> books) {
        File file = new File("module2/src/case_study/data/Book.dat");
        try (FileOutputStream out = new FileOutputStream(file);
             ObjectOutputStream objectOutputStream = new ObjectOutputStream(out)) {
            objectOutputStream.writeObject(books);
        } catch (Exception e) {
            System.out.println("Error saving products: " + e.getMessage());
            e.printStackTrace();
        }
    }

    public static Book findBookById(int id) {
        List<Book> books = getBooks();
        for (Book book : books) {
            if (book.getId() == id) {
                return book;
            }
        }
        return null;
    }
}
