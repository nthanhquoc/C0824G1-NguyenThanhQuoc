package thuc_hanh.mvc.service.impl;

import bai_tap.java_collection_framework.bt1.enity.Product;
import bai_tap.java_collection_framework.bt1.repo.ProductRepo;
import thuc_hanh.mvc.entity.Student;
import thuc_hanh.mvc.repository.StudentRepository;
import thuc_hanh.mvc.service.IStudentService;
import thuc_hanh.mvc.utils.sort.ComparatorStudentById;

import java.util.List;

public class StudentService implements IStudentService {
    private static StudentRepository studentRepository = new StudentRepository();
    @Override
    public List<Student> getAll() {
        List<Student> students = studentRepository.getAll();
        return students;
    }

    @Override
    public List<Student> getAllSortById() {
        List<Student> students = studentRepository.getAll();
        students.sort(new ComparatorStudentById());
        return students;
    }
    public void addStudent(Student student) {
        studentRepository.getAll().add(student);
    }
}

