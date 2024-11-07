package case_study.service;

import case_study.entity.Book;
import case_study.entity.BorrowReCord;
import case_study.entity.Member;

import java.util.List;

public interface IMemberService<E> {
    List<Member> getMembers();

    void addMember(Member member);

    boolean editMember(Member member);

    boolean deleteMember(int id);

    Member findMemberById(int id);

    List<Member> getAllSortMemberById();

    List<Member> getAllSortMemberByName();

    boolean borrowBook(int id, Book book);

    List<BorrowReCord> getBorrowRecords();

    boolean returnBook(int id, Book book);
}
