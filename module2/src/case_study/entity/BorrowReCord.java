package case_study.entity;

public class BorrowReCord {
    private int memberId;
    private Book book;
    public BorrowReCord(int memberId, Book book) {
        this.memberId = memberId;
        this.book = book;
    }
    public int getMemberId() {
        return memberId;
    }
    public Book getBook() {
        return book;
    }
}
