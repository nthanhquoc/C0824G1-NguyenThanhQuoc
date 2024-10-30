package thuc_hanh.mvc.entity;

import bai_tap.io_file.bt2.Country;

import java.util.List;

public class Student extends Person implements Comparable<Student> {
    private double point;
    private String className;

    public Student() {
    }
    public Student(int id, String name, String address, double point, String className) {
        super(id, name, address);
        this.point = point;
        this.className = className;
    }

    public double getPoint() {
        return point;
    }

    public void setPoint(double point) {
        this.point = point;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    @Override
    public String toString() {
        return String.format("│ %-10d │ %-14s │ %-19s │ %-13s│ %-15s │%n", super.getCode(),super.getName(), super.getAddress(),point,className);
    }

    public static String printStudents(List<Student> students) {
        StringBuilder sb = new StringBuilder();
        sb.append("Danh sách các sinh viên:\n");
        sb.append(
                "┌────────────┬────────────────┬─────────────────────┬──────────────┬─────────────────┐\n" +
                        "│    ID      │      Name      │      Address        │     Point    │      Class      │\n" +
                        "├────────────┼────────────────┼─────────────────────┼──────────────┼─────────────────┤\n"
        );
        for (Student student : students) {
            sb.append(student.toString());
        }
        sb.append("└────────────┴────────────────┴─────────────────────┴──────────────┴─────────────────┘");
        return sb.toString();
    }

    @Override
    public int compareTo(Student o) {
        if (this.getCode() > o.getCode()) {
            return 1;
        } else if (this.getCode() == o.getCode()) {
            return 0;
        } else {
            return -1;
        }

    }
}