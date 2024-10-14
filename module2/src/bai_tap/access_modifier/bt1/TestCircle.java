package bai_tap.access_modifier.bt1;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle1 = new Circle();
        System.out.println("Circle 1 radius: " + circle1.getRadius());
        System.out.println("Circle 1 area: " + circle1.getArea());

        Circle circle2 = new Circle(5.0);
        System.out.println("Circle 2 radius: " + circle2.getRadius());
        System.out.println("Circle 2 area: " + circle2.getArea());
    }
}
