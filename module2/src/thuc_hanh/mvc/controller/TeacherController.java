package thuc_hanh.mvc.controller;

import thuc_hanh.mvc.entity.Teacher;
import thuc_hanh.mvc.service.ITeacherService;
import thuc_hanh.mvc.service.impl.TeacherService;

import java.util.List;

public class TeacherController {
    private static ITeacherService teacherService =new TeacherService();
    public List<Teacher> getAll(){
        List<Teacher> teachers = teacherService.getAll();
        return teachers;
    }
}
