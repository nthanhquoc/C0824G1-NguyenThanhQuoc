package case_study.entity;

import java.time.LocalDateTime;

public class BorrowReCord {
    private int memberId;
    private Book book;
    private LocalDateTime borrowDate;

    public BorrowReCord(int memberId, Book book) {
        this.memberId = memberId;
        this.book = book;
        this.borrowDate = LocalDateTime.now();
    }

    public int getMemberId() {
        return memberId;
    }

    public Book getBook() {
        return book;
    }

    public LocalDateTime getBorrowDate() {
        return borrowDate;
    }

    @Override
    public String toString() {
        return "BorrowReCord{" +
                "memberId= " + memberId +
                ", " + book +
                ", borrowDate=" + borrowDate +
                '}';
    }

}
