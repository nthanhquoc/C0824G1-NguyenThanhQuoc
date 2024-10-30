package thuc_hanh.mvc.service.impl;

import thuc_hanh.mvc.entity.Teacher;
import thuc_hanh.mvc.repository.TeacherRepository;
import thuc_hanh.mvc.service.ITeacherService;

import java.util.List;

public class    TeacherService implements ITeacherService {
    private static TeacherRepository teacherRepository = new TeacherRepository();
    @Override
    public List<Teacher> getAll() {
        List<Teacher>teachers=teacherRepository.getAll();
        return teachers;
    }

    @Override
    public List<Teacher> getAllSortById() {
        return List.of();
    }
}