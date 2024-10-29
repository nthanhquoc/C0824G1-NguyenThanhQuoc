package thuc_hanh.mvc.repository;

import thuc_hanh.mvc.entity.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentRepository {
    //    wrapper class , <> generic
    private static List<Student> students = new ArrayList<>();

    static {
        students.add(new Student(1, "Nguyễn Văn A", "Hà Nội", 10, "C0724G1"));
        students.add(new Student(1, "Nguyễn Văn A", "Hà Nội", 10, "C0724G1"));
        students.add(new Student(1, "Nguyễn Văn A", "Hà Nội", 10, "C0724G1"));
    }

    public List<Student> getAll() {
        return students;
    }

    public void remove() {
//        students.remove();
    }
}
