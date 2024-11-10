package case_study.service;

import case_study.entity.Book;
import case_study.entity.BorrowReCord;
import case_study.entity.Member;
import case_study.repo.MemberRepo;
import case_study.utils.sort_book.ComparatorMemberById;
import case_study.utils.sort_book.ComparatorMemberByName;

import java.util.Comparator;
import java.util.List;

public class MemberService implements IMemberService {
    private static final MemberRepo memberRepo = new MemberRepo();
    private static MemberService instance;

    private MemberService() {
    }
    public static synchronized MemberService getInstance() {
        if (instance == null) {
            instance = new MemberService();
        }
        return instance;
    }
    @Override
    public List<Member> getMembers() {
        List<Member> members = memberRepo.getMembers();
        return members;
    }

    @Override
    public void addMember(Member member) {
        memberRepo.addMember(member);
    }

    @Override
    public boolean editMember(Member member) {
        return memberRepo.editMember(member);
    }

    @Override
    public boolean deleteMember(int id) {
        return memberRepo.deleteMember(id);
    }

    @Override
    public Member findMemberById(int id) {
        return memberRepo.findMemberById(id);
    }

    public List<Member> getAllSortMemberById() {
        List<Member> members = memberRepo.getMembers();
        members.sort(new ComparatorMemberById());
        return members;
    }

    public List<Member> getAllSortMemberByName() {
        List<Member> members = memberRepo.getMembers();
        members.sort(new ComparatorMemberByName());
        return members;
    }

    @Override
    public boolean borrowBook(int id, Book book) {
        return memberRepo.borrowBook(id, book);
    }

    @Override
    public List<BorrowReCord> getBorrowRecords() {
        return memberRepo.getBorrowRecords();
    }

    @Override
    public boolean returnBook(int id, Book book) {
        return memberRepo.returnBook(id, book);
    }
}
