package case_study.utils.sort_book;

import case_study.entity.Book;

import java.util.Comparator;

public class ComparatorBookByName implements Comparator<Book> {
    @Override
    public int compare(Book o1, Book o2) {
        return o1.getTitle().compareTo(o2.getTitle());
    }
}
