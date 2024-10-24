package thuc_hanh.map.bt2;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Student st1= new Student("Nam",20,"HN");
        Student st2= new Student("Hung",21,"HN");
        Student st3= new Student("Ha",22,"HN");
        Map<Integer,Student> studentMap = new HashMap<>();
        studentMap.put(1,st1);
        studentMap.put(2,st2);
        studentMap.put(3,st3);
        studentMap.put(4,st1);
        for(Map.Entry<Integer,Student> entry:studentMap.entrySet()){
            System.out.println(entry.toString());
        }
        System.out.println("...........Set");
        Set<Student>students = new HashSet<>();
        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st1);
        for(Student student:students){
            System.out.println(student.toString());
        }
    }
}
