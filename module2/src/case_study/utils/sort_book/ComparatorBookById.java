package case_study.utils.sort_book;

import case_study.entity.Book;

import java.util.Comparator;

public class ComparatorBookById implements Comparator<Book> {
    @Override
    public int compare(Book o1, Book o2) {
        if (o1.getId() > o2.getId()) {
            return 1;
        } else if (o1.getId() == o2.getId()) {
            return 0;
        } else {
            return -1;
        }
    }
}
