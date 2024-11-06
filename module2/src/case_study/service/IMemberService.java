package case_study.service;

import case_study.entity.Member;

import java.util.List;

public interface IMemberService<E> {
    List<Member> getMembers();
}
