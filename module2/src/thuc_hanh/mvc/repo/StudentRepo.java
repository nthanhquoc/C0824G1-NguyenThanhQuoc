package thuc_hanh.mvc.repo;

import thuc_hanh.mvc.entity.Student;

public class StudentRepo {
    private static Student[] students = new Student[5];

    static {
        students[0] = new Student(1, "Nguyễn Văn A", "Hà Nội", 10, "C0724G1");
        students[1] = new Student(1, "Nguyễn Văn A", "Hà Nội", 10, "C0724G1");
        students[2] = new Student(1, "Nguyễn Văn A", "Hà Nội", 10, "C0724G1");
        students[3] = new Student(1, "Nguyễn Văn A", "Hà Nội", 10, "C0724G1");
        students[4] = new Student(1, "Nguyễn Văn A", "Hà Nội", 10, "C0724G1");
    }

    public Student[] getAll() {
        return students;
    }
}
