package thuc_hanh.static_method;

public class Student {
    private String name;
    private int rollno;
    private static String collage ="BBDIT";
    Student(int r, String n) {
        rollno=r;
        name=n;
    }
    static void change(){
        collage="CODEGYM";

    }
    void display(){
        System.out.println(rollno+" "+name+" "+collage);
    }

    public static void main(String[] args) {
        Student.change();
        Student st1=new Student(1,"Hoang");

        st1.display();
    }
}
