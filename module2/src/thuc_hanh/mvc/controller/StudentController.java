package thuc_hanh.mvc.controller;

import thuc_hanh.mvc.entity.Student;
import thuc_hanh.mvc.service.IStudentService;
import thuc_hanh.mvc.service.impl.StudentService;

import java.util.List;

public class StudentController {
    //    DI nguyên lý D trong SOLID
    private static IStudentService studentService = new StudentService();

    public List<Student> getAll() {
        List<Student> students = studentService.getAll();
        return students;
    }

    public List<Student> displayAllStudentSortById() {
        return studentService.getAllSortById();
    }

    public void addStudent(Student student) {
        studentService.addStudent(student);
    }
    public boolean editStudent(Student student) {
        return studentService.editStudent(student);
    }
}

