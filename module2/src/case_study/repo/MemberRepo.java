package case_study.repo;

import case_study.entity.Book;
import case_study.entity.BorrowReCord;
import case_study.entity.Member;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class MemberRepo {
    private static List<Member> members = new ArrayList<Member>();
    private static List<BorrowReCord> borrowReCords = new ArrayList<>();

    static {
        members.add(new Member(1, "Thanh Quoc"));
        members.add(new Member(2, "Nguyen Tha"));
        members.add(new Member(3, "Nguyen Hoang"));
        File file = new File("module2/src/case_study/data/Member.dat");
        try {
            FileOutputStream out = new FileOutputStream(file);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(out);
            objectOutputStream.writeObject(members);
            objectOutputStream.close();
            out.close();
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static List<Member> getMembers() {
        List<Member> members = new ArrayList<>();
        File file = new File("module2/src/case_study/data/Member.dat");
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            members = (List<Member>) objectInputStream.readObject();
            objectInputStream.close();
            fileInputStream.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        return members;
    }

    public static void addMember(Member member) {
        File file = new File("module2/src/case_study/data/Member.dat");
        List<Member> members = getMembers();
        for (Member member1 : members) {
            if (member1.getMemberId() == member.getMemberId()) {
                System.out.println("ID is in the list");
                return;
            }
        }
        members.add(member);
        try (FileOutputStream out = new FileOutputStream(file);
             ObjectOutputStream objectOutputStream = new ObjectOutputStream(out)) {
            objectOutputStream.writeObject(members);
            System.out.println("File updated successfully.");
        } catch (Exception e) {
            System.out.println("Error updating file: " + e.getMessage());
            e.printStackTrace();
        }
    }

    public static boolean editMember(Member member) {
        List<Member> members = getMembers();
        boolean found = false;
        for (int i = 0; i < members.size(); i++) {
            if (members.get(i).getMemberId() == member.getMemberId()) {
                members.set(i, member);
                found = true;
                break;
            }
        }
        if (found) {
            saveMember(members);
        }
        return found;
    }

    public static boolean deleteMember(int id) {
        List<Member> members = getMembers();
        boolean found = false;
        for (int i = 0; i < members.size(); i++) {
            if (members.get(i).getMemberId() == id) {
                members.remove(i);
                found = true;
                break;
            }
        }
        if (found) {
            saveMember(members);
        }
        return found;
    }

    public static Member findMemberById(int id) {
        List<Member> members = getMembers();
        for (Member member : members) {
            if (member.getMemberId() == id) {
                return member;
            }
        }
        return null;
    }

    private static void saveMember(List<Member> members) {
        File file = new File("module2/src/case_study/data/Member.dat");
        try (FileOutputStream out = new FileOutputStream(file);
             ObjectOutputStream objectOutputStream = new ObjectOutputStream(out)) {
            objectOutputStream.writeObject(members);
        } catch (Exception e) {
            System.out.println("Error saving products: " + e.getMessage());
            e.printStackTrace();
        }
    }

    public static boolean borrowBook(int id, Book book) {
        if (!book.isStatus()) {
            System.out.println("Book is already borrowed");
            return false;
        }
        BorrowReCord borrowRecord = new BorrowReCord(id, book);
        borrowReCords.add(borrowRecord);
        book.setStatus(false);
        return true;
    }

    public static List<BorrowReCord> getBorrowRecords() {
        return borrowReCords;
    }

    public static boolean returnBook(int id, Book book) {
        for (BorrowReCord borrowRecord : borrowReCords) {
            if (borrowRecord.getMemberId() == id && borrowRecord.getBook().getId() == book.getId()) {
                borrowReCords.remove(borrowRecord);
                book.setStatus(true);
                return true;
            }
        }
        return false;
    }


}
