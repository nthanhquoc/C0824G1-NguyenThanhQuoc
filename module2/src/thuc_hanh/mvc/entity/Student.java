package thuc_hanh.mvc.entity;

public class Student extends Person implements Comparable<Student> {
    private double point;
    private String className;

    public Student() {
    }


    public Student(int id, String name, String address, double point, String className) {
        super(id, name, address);
        this.point = point;
        this.className = className;
    }

    public double getPoint() {
        return point;
    }

    public void setPoint(double point) {
        this.point = point;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id="+super.getCode()+
                ", name="+super.getName()+
                ", address="+super.getAddress()+
                "point=" + point +
                ", className='" + className + '\'' +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        if(this.getCode() > o.getCode()) {
            return 1;
        } else if (this.getCode() == o.getCode()) {
            return 0;
        } else {
            return -1;
        }

    }
}