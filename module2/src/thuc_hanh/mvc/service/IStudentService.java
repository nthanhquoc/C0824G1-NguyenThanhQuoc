package thuc_hanh.mvc.service;

import thuc_hanh.mvc.entity.Student;

public interface IStudentService extends IPersonService<Student> {
    void addStudent(Student student);
    boolean editStudent(Student student);
}
