package case_study.utils.sort_book;

import case_study.entity.Member;

import java.util.Comparator;

public class ComparatorMemberById implements Comparator<Member> {
    @Override
    public int compare(Member o1, Member o2) {
        if (o1.getMemberId() > o2.getMemberId()) {
            return 1;
        } else if (o1.getMemberId() == o2.getMemberId()) {
            return 0;
        } else {
            return -1;
        }
    }
}
