package thuc_hanh.mvc.repository;

import thuc_hanh.mvc.entity.Student;

import java.io.*;
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

    public static List<Student> getAll() {
        List<Student> students = new ArrayList<>();
        File file = new File("module2/src/thuc_hanh/mvc/data/student.csv");
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            String data[];
            while ((line = bufferedReader.readLine()) != null) {
                data = line.split(",");
                students.add(new Student(Integer.parseInt(data[0]), data[1], data[2], Double.parseDouble(data[3]), data[4]));
            }
        } catch (FileNotFoundException e) {
            System.out.println("Lỗi");
        } catch (IOException e) {
            System.out.println("Lỗi");
        }
        return students;
    }
    public static void addStudent(Student student) {
        File file = new File("module2/src/thuc_hanh/mvc/data/student.csv");
        try(BufferedWriter bufferedWriter =new BufferedWriter(new FileWriter(file,true))){
            bufferedWriter.write(String.format("%d,%s,%s,%.1f,%s%n", student.getCode(), student.getName(), student.getAddress(), student.getPoint(), student.getClassName()));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static void editStudent(Student updatedStudent) {
        List<Student> students = getAll();
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getCode() == updatedStudent.getCode()) {
                students.set(i, updatedStudent);
                break;
            }
        }
        writeStudentsToFile(students);

    }
    private static void writeStudentsToFile(List<Student> students) {
        File file = new File("module2/src/thuc_hanh/mvc/data/student.csv");
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file))) {
            for (Student student : students) {
                bufferedWriter.write(String.format("%d,%s,%s,%.1f,%s%n", student.getCode(), student.getName(), student.getAddress(), student.getPoint(), student.getClassName()));
            }
        } catch (IOException e) {
            System.out.println("Lỗi: Không thể ghi vào file.");
        }
    }
public void remove() {
//        students.remove();
}
}
