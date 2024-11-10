package case_study.controller;

import case_study.entity.Book;
import case_study.entity.BorrowReCord;
import case_study.entity.Member;
import case_study.service.IMemberService;
import case_study.service.MemberService;

import java.util.List;

public class MemberController {
    private static IMemberService memberService = MemberService.getInstance();

    public List<Member> getMembers() {
        List<Member> members = memberService.getMembers();
        return members;
    }

    public void addMember(Member member) {
        memberService.addMember(member);
    }

    public boolean editMember(Member member) {
        return memberService.editMember(member);
    }

    public boolean deleteMember(int id) {
        return memberService.deleteMember(id);
    }

    public Member findMemberById(int id) {
        return memberService.findMemberById(id);
    }

    public List<Member> displayAllMembersById() {
        return memberService.getAllSortMemberById();
    }

    public List<Member> displayAllMembersByName() {
        return memberService.getAllSortMemberByName();
    }

    public boolean borrowBook(int id, Book book) {
        return memberService.borrowBook(id, book);
    }

    public List<BorrowReCord> getBorrowRecords() {
        return memberService.getBorrowRecords();
    }
    public boolean returnBook(int id, Book book) {
        return memberService.returnBook(id, book);
    }
}
