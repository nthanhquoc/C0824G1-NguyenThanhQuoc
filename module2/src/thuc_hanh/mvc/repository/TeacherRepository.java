package thuc_hanh.mvc.repository;

import thuc_hanh.mvc.entity.Teacher;

import java.util.ArrayList;
import java.util.List;

public class TeacherRepository {
    private static List<Teacher> teachers=new ArrayList<>();
    static {
        teachers.add(new Teacher(1,"Nguyen Van A","Hà Nội","1"));
        teachers.add(new Teacher(1,"Nguyen Van A","Hà Nội","2"));
        teachers.add(new Teacher(1,"Nguyen Van A","Hà Nội","3"));
    }
    public List<Teacher> getAll(){return teachers;}

}
