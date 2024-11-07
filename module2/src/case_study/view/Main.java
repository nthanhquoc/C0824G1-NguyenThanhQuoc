package case_study.view;

import case_study.controller.BookController;
import case_study.controller.MemberController;
import case_study.entity.Book;
import case_study.entity.BorrowReCord;
import case_study.entity.Member;

import java.util.List;
import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);
    private static final BookController bookController = new BookController();
    private static final MemberController memberController = new MemberController();

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
        for (Book book : books) {
            System.out.println(book);
        }
    }

    private static void addBook() {
        System.out.print("Input Book ID: ");
        int id = scanner.nextInt();
        System.out.print("Input Book Title: ");
        String title = scanner.next();
        if (isBookExist(id)) {
            System.out.println("Book already exists.");
            return;
        }
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

    private static boolean isBookExist(int id) {
        for (Book book : bookController.getBooks()) {
            if (book.getId() == id) {
                return true;
            }
        }
        return false;
    }

    private static void memberMenu() {
        while (true) {
            System.out.println("-----Member Menu------");
            System.out.println("1. Display Members");
            System.out.println("2. Add Member");
            System.out.println("3. Edit Member");
            System.out.println("4. Delete Member");
            System.out.println("5. Find Member");
            System.out.println("6. Sort Members");
            System.out.println("7. Borrow Books");
            System.out.println("8. Return Books");
            System.out.println("9. See Members Borrowed Books");
            System.out.println("10. Back to Main Menu");
            System.out.print("Enter your choice: ");
            int option = scanner.nextInt();
            switch (option) {
                case 1:
                    displayMembers();
                    break;
                case 2:
                    addMember();
                    break;
                case 3:
                    editMember();
                    break;
                case 4:
                    deleteMember();
                    break;
                case 5:
                    findMemberById();
                    break;
                case 6:
                    sortMember();
                    break;
                case 7:
                    borrowBook();
                    break;
                case 8:
                    returnBook();
                    break;
                case 9:
                    break;
                case 10:
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
                    break;
            }
        }
    }

    private static void displayMembers() {
        List<Member> members = memberController.getMembers();
        for (Member member : members) {
            System.out.println(member);
        }
    }

    private static void addMember() {
        System.out.println("Input Member ID: ");
        int id = scanner.nextInt();
        if (isMemberExist(id)) {
            System.out.println("Member already exists.");
            return;
        }
        System.out.println("Input Member Name: ");
        String memberName = scanner.next();
        Member newMember = new Member(id, memberName);
        memberController.addMember(newMember);
        System.out.println("Member added successfully.");
        displayMembers();
    }

    private static void sortMember() {
        System.out.println("Choose sorting option:");
        System.out.println("1. Sort By ID");
        System.out.println("2. Sort By Name");
        System.out.print("Enter your choice: ");
        int sortChoice = scanner.nextInt();
        List<Member> members;
        if (sortChoice == 1) {
            members = memberController.displayAllMembersById();
        } else if (sortChoice == 2) {
            members = memberController.displayAllMembersByName();
        } else {
            System.out.println("Invalid choice.");
            return;
        }

        for (Member member : members) {
            System.out.println(member);
        }
    }

    private static void editMember() {
        System.out.println("Input Member ID: ");
        if (scanner.hasNextInt()) {
            int id = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Input Member Name: ");
            String memberName = scanner.nextLine();
            Member updatedMember = new Member(id, memberName);
            if (memberController.editMember(updatedMember)) {
                System.out.println("Member edited successfully.");
                displayMembers();
            } else {
                System.out.println("Member not found.");
            }
        } else {
            System.out.println("Invalid input. Please enter a valid integer for Member ID.");
            scanner.next();
        }
    }

    private static void deleteMember() {
        System.out.print("Input Member ID to delete: ");
        int id = scanner.nextInt();

        if (memberController.deleteMember(id)) {
            System.out.println("Member deleted successfully.");
            displayMembers();
        } else {
            System.out.println("Member not found.");
        }
    }

    public static boolean isMemberExist(int id) {
        for (Member member : memberController.getMembers()) {
            if (member.getMemberId() == id) {
                return true;
            }
        }
        return false;
    }

    private static void findMemberById() {
        System.out.print("Input Member ID to find: ");
        int id = scanner.nextInt();
        Member member = memberController.findMemberById(id);
        if (member != null) {
            System.out.println(member);
        } else {
            System.out.println("Book not found.");
        }
    }

    private static void borrowBook() {
        System.out.print("Enter Member ID: ");
        int memberId = scanner.nextInt();
        if (!isMemberExist(memberId)) {
            System.out.println("Member not found.");
            return;
        }
        System.out.print("Enter Book ID to borrow: ");
        int bookId = scanner.nextInt();
        Book book = bookController.findBookById(bookId);
        if (book == null) {
            System.out.println("Book not found.");
            return;
        }
        if (memberController.borrowBook(memberId, book)) {
            System.out.println("Book borrowed successfully.");
            displayBorrowedBooks();
        } else {
            System.out.println("Failed to borrow book. It might already be borrowed.");
        }
    }

    private static void returnBook() {
        System.out.println("Enter Member ID :");
        int memberId = scanner.nextInt();
        if (!isMemberExist(memberId)) {
            System.out.println("Member not found.");
            return;
        }
        System.out.print("Enter Book ID :");
        int bookId = scanner.nextInt();
        Book book = bookController.findBookById(bookId);
        if (book == null) {
            System.out.println("Book not found.");
            return;
        }
        if (memberController.returnBook(memberId, book)) {
            System.out.println("Book returned successfully.");
        } else {
            System.out.println("Failed to borrow book. It might already be returned.");
        }
    }

    private static void displayBorrowedBooks() {
        List<BorrowReCord> borrowRecords = memberController.getBorrowRecords();
        if (borrowRecords.isEmpty()) {
            System.out.println("No borrowed books found.");
        } else {
            for (BorrowReCord record : borrowRecords) {
                System.out.println(record);
            }
        }
    }
}
