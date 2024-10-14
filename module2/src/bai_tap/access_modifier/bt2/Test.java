package bai_tap.access_modifier.bt2;

public class Test {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.setName("Alex");
        student1.setClasses("C03");
        System.out.println("Name: "+student1.getName());
        System.out.println("Class: "+student1.getClasses());
    }
}
