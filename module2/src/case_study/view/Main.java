package case_study.view;

import case_study.controller.BookController;
import case_study.controller.MemberController;
import case_study.entity.Book;
import case_study.entity.BorrowReCord;
import case_study.entity.Member;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);
    private static final BookController bookController = new BookController();
    private static final MemberController memberController = new MemberController();

    public static void main(String[] args) {
        while (true) {
            try {
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
            } catch (Exception e) {
                System.out.println("Invalid Value");
                scanner.nextLine();
            }
        }
    }

    private static void bookMenu() {
        while (true) {
            try {
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
            } catch (Exception e) {
                System.out.println("Invalid Value");
                scanner.nextLine();
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
        int id = 0;
        String title = "";
        String author = "";
        while (true) {
            try {
                System.out.print("Input Book ID: ");
                id = scanner.nextInt();
                scanner.nextLine();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Invalid Book ID. Please enter a valid integer.");
                scanner.nextLine();
            }
        }
        if (isBookExist(id)) {
            System.out.println("Book already exists.");
            return;
        }
        while (true) {
            try {
                System.out.print("Input Book Title: ");
                title = scanner.nextLine();
                if (title.trim().isEmpty()) {
                    throw new IllegalArgumentException("Title cannot be empty.");
                }
                break;
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
        while (true) {
            try {
                System.out.print("Input Book Author: ");
                author = scanner.nextLine();
                if (author.trim().isEmpty()) {
                    throw new IllegalArgumentException("Author cannot be empty.");
                }
                break;
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
        try {
            Book newBook = new Book(id, title, author);
            bookController.addBook(newBook);
            System.out.println("Book added successfully.");
            displayBooks();
        } catch (Exception e) {
            System.out.println("An unexpected error occurred while adding the book: " + e.getMessage());
        }
    }

    private static void editBook() {
        int id = 0;
        String title = "";
        String author = "";
        while (true) {
            try {
                System.out.print("Input Book ID: ");
                id = scanner.nextInt();
                scanner.nextLine();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Invalid Book ID. Please enter a valid integer.");
                scanner.nextLine();
            }
        }
        while (true) {
            try {
                System.out.print("Input Book Title: ");
                title = scanner.nextLine();
                if (title.trim().isEmpty()) {
                    throw new IllegalArgumentException("Title cannot be empty.");
                }
                break;
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
        while (true) {
            try {
                System.out.print("Input Book Author: ");
                author = scanner.nextLine();
                if (author.trim().isEmpty()) {
                    throw new IllegalArgumentException("Author cannot be empty.");
                }
                break;
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
        try {
            Book updatedBook = new Book(id, title, author);
            if (bookController.editBook(updatedBook)) {
                System.out.println("Book edited successfully.");
                displayBooks();
            } else {
                System.out.println("Book not found.");
            }
        } catch (Exception e) {
            System.out.println("An unexpected error occurred while editing the book: " + e.getMessage());
        }
    }

    private static void deleteBook() {
        int id = 0;
        while (true) {
            try {
                System.out.print("Input Book ID to delete: ");
                id = scanner.nextInt();
                scanner.nextLine();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Invalid Book ID. Please enter a valid integer.");
                scanner.nextLine();
            }
        }
        try {
            if (bookController.deleteBook(id)) {
                System.out.println("Book deleted successfully.");
                displayBooks();
            } else {
                System.out.println("Book not found.");
            }
        } catch (Exception e) {
            System.out.println("An unexpected error occurred while deleting the book: " + e.getMessage());
        }
    }

    private static void findBookById() {
        int id = 0;
        while (true) {
            try {
                System.out.print("Input Book ID to find: ");
                id = scanner.nextInt();
                scanner.nextLine();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Invalid Book ID. Please enter a valid integer.");
                scanner.nextLine();
            }
        }
        try {
            Book book = bookController.findBookById(id);
            if (book != null) {
                System.out.println(book);
            } else {
                System.out.println("Book not found.");
            }
        } catch (Exception e) {
            System.out.println("An unexpected error occurred while finding the book: " + e.getMessage());
        }
    }

    private static void sortBooks() {
        int sortChoice = 0;
        while (true) {
            try {
                System.out.println("Choose sorting option:");
                System.out.println("1. Sort By ID");
                System.out.println("2. Sort By Title");
                System.out.print("Enter your choice: ");
                sortChoice = scanner.nextInt();
                scanner.nextLine();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid integer.");
                scanner.nextLine();
            }
        }
        try {
            List<Book> books = null;
            if (sortChoice == 1) {
                books = bookController.displayAllBookSortById();
            } else if (sortChoice == 2) {
                books = bookController.displayAllBookSortByName();
            } else {
                System.out.println("Invalid choice.");
                return;
            }
            if (books != null && !books.isEmpty()) {
                books.forEach(System.out::println);
            } else {
                System.out.println("No books found.");
            }
        } catch (Exception e) {
            System.out.println("An unexpected error occurred while sorting the books: " + e.getMessage());
        }
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
            System.out.println("9. Back to Main Menu");
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
        int id = 0;
        String memberName = "";
        while (true) {
            try {
                System.out.println("Input Member ID: ");
                id = scanner.nextInt();
                scanner.nextLine();
                if (isMemberExist(id)) {
                    System.out.println("Member already exists.");
                    return;
                }
                break;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input for Member ID. Please enter a valid integer.");
                scanner.nextLine();
            }
        }
        while (true) {
            try {
                System.out.println("Input Member Name: ");
                memberName = scanner.nextLine();
                if (memberName.trim().isEmpty()) {
                    throw new IllegalArgumentException("Member name cannot be empty.");
                }
                break;
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
        try {
            Member newMember = new Member(id, memberName);
            memberController.addMember(newMember);
            System.out.println("Member added successfully.");
            displayMembers();
        } catch (Exception e) {
            System.out.println("An unexpected error occurred while adding the member: " + e.getMessage());
        }
    }

    private static void sortMember() {
        int sortChoice = 0;
        while (true) {
            try {
                System.out.println("Choose sorting option:");
                System.out.println("1. Sort By ID");
                System.out.println("2. Sort By Name");
                System.out.print("Enter your choice: ");
                sortChoice = scanner.nextInt();
                scanner.nextLine();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid integer.");
                scanner.nextLine();
            }
        }
        List<Member> members = null;
        try {
            if (sortChoice == 1) {
                members = memberController.displayAllMembersById();
            } else if (sortChoice == 2) {
                members = memberController.displayAllMembersByName();
            } else {
                System.out.println("Invalid choice.");
                return;
            }
            if (members != null && !members.isEmpty()) {
                for (Member member : members) {
                    System.out.println(member);
                }
            } else {
                System.out.println("No members found.");
            }
        } catch (Exception e) {
            System.out.println("An unexpected error occurred while sorting members: " + e.getMessage());
        }
    }

    private static void editMember() {
        try {
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
        } catch (InputMismatchException e) {
            System.out.println("Error: Invalid input type. Please enter correct values.");
            scanner.nextLine();
        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        }
    }
    private static void deleteMember() {
        int id;
        while (true) {
            try {
                System.out.print("Input Member ID to delete: ");
                id = scanner.nextInt();
                break;
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter a valid integer for Member ID.");
                scanner.nextLine();
            }
        }
        try {
            if (memberController.deleteMember(id)) {
                System.out.println("Member deleted successfully.");
                displayMembers();
            } else {
                System.out.println("Member not found.");
            }
        } catch (Exception e) {
            System.out.println("An error occurred while trying to delete the member: " + e.getMessage());
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
        int id;
        while (true) {
            try {
                System.out.print("Input Member ID to find: ");
                id = scanner.nextInt();
                break;
            } catch (Exception e) {
                System.out.println("Invalid Value");
                scanner.nextLine();
            }
        }
        try {
            Member member = memberController.findMemberById(id);
            if (member != null) {
                System.out.println(member);
            } else {
                System.out.println("Member not found.");
            }
        } catch (Exception e) {
            System.out.println("An error occurred while trying to find the member: " + e.getMessage());
        }
    }

    private static void borrowBook() {
        int memberId = -1;
        int bookId = -1;
        while (true) {
            try {
                System.out.print("Enter Member ID: ");
                memberId = scanner.nextInt();
                if (!isMemberExist(memberId)) {
                    System.out.println("Member not found.");
                    return;
                }
                break;
            } catch (Exception e) {
                System.out.println("Invalid Member ID. Please enter a valid integer.");
                scanner.nextLine();
            }
        }
        while (true) {
            try {
                System.out.print("Enter Book ID to borrow: ");
                bookId = scanner.nextInt();
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
                break;
            } catch (Exception e) {
                System.out.println("Invalid Book ID. Please enter a valid integer.");
                scanner.nextLine();
            }
        }
    }

    private static void returnBook() {
        int memberId = -1;
        int bookId = -1;
        while (true) {
            try {
                System.out.print("Enter Member ID: ");
                memberId = scanner.nextInt();
                if (!isMemberExist(memberId)) {
                    System.out.println("Member not found.");
                    return;
                }
                break;
            } catch (Exception e) {
                System.out.println("Invalid Member ID. Please enter a valid integer.");
                scanner.nextLine();
            }
        }
        while (true) {
            try {
                System.out.print("Enter Book ID: ");
                bookId = scanner.nextInt();
                Book book = bookController.findBookById(bookId);
                if (book == null) {
                    System.out.println("Book not found.");
                    return;
                }
                if (memberController.returnBook(memberId, book)) {
                    System.out.println("Book returned successfully.");
                } else {
                    System.out.println("Failed to return book. It might already be returned.");
                }
                break;
            } catch (Exception e) {
                System.out.println("Invalid Book ID. Please enter a valid integer.");
                scanner.nextLine();
            }
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
