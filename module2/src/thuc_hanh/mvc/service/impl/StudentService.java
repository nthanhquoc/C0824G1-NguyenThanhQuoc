package thuc_hanh.mvc.service.impl;

import thuc_hanh.mvc.entity.Student;
import thuc_hanh.mvc.repo.StudentRepo;
import thuc_hanh.mvc.service.IStudentService;

public class StudentService implements IStudentService {
    private static StudentRepo studentRepository = new StudentRepo();
    @Override
    public Student[] getAll() {
        Student[] students = studentRepository.getAll();

        return students;
    }
}