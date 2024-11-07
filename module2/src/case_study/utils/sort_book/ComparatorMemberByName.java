package case_study.utils.sort_book;

import case_study.entity.Member;

import java.util.Comparator;

public class ComparatorMemberByName implements Comparator<Member> {
    @Override
    public int compare(Member o1, Member o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
