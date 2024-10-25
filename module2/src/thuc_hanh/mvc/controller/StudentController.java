package thuc_hanh.mvc.controller;

import thuc_hanh.mvc.entity.Student;
import thuc_hanh.mvc.service.IStudentService;
import thuc_hanh.mvc.service.impl.StudentService;

public class StudentController {
    private static IStudentService studentService = new StudentService();

    public Student[] getAll() {
        Student[] students = studentService.getAll();
        return students;
    }
}