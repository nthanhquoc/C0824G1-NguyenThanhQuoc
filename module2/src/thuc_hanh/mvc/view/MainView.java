package thuc_hanh.mvc.view;

import thuc_hanh.mvc.controller.StudentController;
import thuc_hanh.mvc.controller.TeacherController;
import thuc_hanh.mvc.entity.Student;
import thuc_hanh.mvc.entity.Teacher;

import java.util.List;
import java.util.Scanner;

public class MainView {
    public static void main(String[] args) {
        while (true) {
            System.out.println("--------- Quản lý CodeGym ------------");
            System.out.println("1. Quản lý học sinh");
            System.out.println("2. Quản lý giảng viên");
            System.out.println("3. Thoát");
            int choice = inputPropertyNumberInteger("lựa chọn");
            switch (choice) {
                case 1:
                    menuStudent();
                    break;
                case 2:
                    menuTeacher();
                    break;
                case 3:
                    return;
                default:
                    System.out.println("Bạn nhập không đúng lựa chọn. Vui lòng nhập lại.");
            }
        }

    }
    public static void menuTeacher(){
        TeacherController teacherController = new TeacherController();
        while (true){
            System.out.println("Menu quản lý giáo viên");
            System.out.println("1. Hiển thị danh sách giáo viên");
            System.out.println("2. Thêm mới Giáo Viên");
            System.out.println("3. Sửa Thông tin Giáo viên");
            System.out.println("4. Xóa Giáo Viên");
            Scanner scanner = new Scanner(System.in);
            int choice = inputPropertyNumberInteger("Lựa Chọn");
            List<Teacher> teachers;
            switch (choice) {
                case 1:
                    System.out.println("Danh Sách Giáo Viên");
                    teachers=teacherController.getAll();
                    for(Teacher teacher : teachers){
                        System.out.println(teacher);
                    }
                    break;
            }
        }
    }
    public static void menuStudent() {
        StudentController studentController = new StudentController();
        while (true) {
            System.out.println("Menu quản lý học sinh");
            System.out.println("1. Hiển thị danh sách học sinh");
            System.out.println("2. Thêm mới học sinh");
            System.out.println("3. Sửa thông tin học sinh");
            System.out.println("4. Xóa học sinh");
            System.out.println("5. Tìm kiếm học sinh theo tên hoặc id");
            System.out.println("6. Sắp xếp học sinh theo tên hoặc id");
            System.out.println("7. Quay lại menu chính");
            Scanner scanner = new Scanner(System.in);
            int choice = inputPropertyNumberInteger("lựa chọn");
            List<Student> students;
            switch (choice) {
                case 1:
                    System.out.println("Hiển thị danh sách học sinh");
                    students = studentController.getAll();
                    for (int i = 0; i < students.size(); i++) {
                        System.out.println(students.get(i));
                    }
                    break;
                case 2:
                    System.out.println("Thêm Mới Học Sinh");
                    Student newStudent = inputStudent();
                    studentController.addStudent(newStudent);
                    System.out.println("Học sinh mới đã được thêm thành công!");
                    break;
                case 3:
                    break;
                case 4:
                    System.out.println("Xóa học sinh");
                    break;
                case 5:
                    System.out.println("Tìm kiếm học sinh theo tên hoặc id");
                    break;
                case 6:
                    sortStudent(scanner, studentController);
                    break;
                case 7:
                    return;
            }
        }

    }

    public static void sortStudent(Scanner scanner, StudentController studentController) {
        List<Student> students;
        int subChoice;
        System.out.println("Bạn muốn sắp xếp theo:");
        System.out.println("1. Theo tên");
        System.out.println("2. Theo id");
        subChoice = Integer.parseInt(scanner.nextLine());
        if (subChoice == 1) {
            students = studentController.displayAllStudentSortById();
            for (int i = 0; i < students.size(); i++) {
                System.out.println(students.get(i));
            }

        } else if (subChoice == 2) {

        } else {
            System.out.println("Invalid");
        }
    }

    public static int inputPropertyNumberInteger(String key) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Mời bạn nhập " + key + ":");
        int value;
        while (true) {
            try {
                value = Integer.parseInt(scanner.nextLine());
                if (value < 0) {
                    System.out.print("Số phải là nguyên dương. Mời bạn nhập lại: ");
                    continue;
                }
                break;
            } catch (NumberFormatException e) {
                System.out.print("Bạn cần nhập định dạng số: ");
            } catch (Exception e) {
                System.out.println("Lỗi");
            }
        }
        return value;
    }

    public static Student inputStudent() {
        Scanner scanner = new Scanner(System.in);
        int id;
        String name;
        String address;
        double points;
        String className;
        // Lấy ID
        while (true) {
            try {
                System.out.print("Nhập ID học sinh: ");
                id = Integer.parseInt(scanner.nextLine());
                if (id < 0) {
                    System.out.println("ID phải là một số nguyên dương. Vui lòng nhập lại.");
                    continue;
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("ID phải là số nguyên. Vui lòng nhập lại.");
            }
        }
        System.out.println("Nhap Ten");
        name = scanner.nextLine();
        System.out.println("Nhap Dia Chi");
        address = scanner.nextLine();
        while (true) {
            try {
                System.out.println("Nhap Diem");
                points = Double.parseDouble(scanner.nextLine());
                if (points < 0 || points > 10) {
                    System.out.println("Điểm phải trong khoảng từ 0 đến 10. Vui lòng nhập lại.");
                    continue;
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("Điểm phải là một số thực. Vui lòng nhập lại.");
            }
        }
        System.out.print("Nhập tên lớp: ");
        className = scanner.nextLine();
        return new Student(id, name, address, points, className);
    }
}