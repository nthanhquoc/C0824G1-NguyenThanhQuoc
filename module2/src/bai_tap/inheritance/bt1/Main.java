package bai_tap.inheritance.bt1;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(2.5, "blue");
        System.out.println(circle);
        System.out.println(circle.getArea());

        Cylinder cylinder = new Cylinder(3.0, 5.0, "green");
        System.out.println(cylinder);
        System.out.println(cylinder.getVolume());
    }
}
