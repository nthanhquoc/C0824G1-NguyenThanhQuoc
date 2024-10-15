package bai_tap.inheritance.bt2;

public class TestPoint2D {
    public static void main(String[] args) {
        Point2D point1 = new Point2D();
        System.out.println("Default Point2D: " + point1);
        Point2D point2 = new Point2D(3.5f, 4.8f);
        System.out.println("Point2D with parameters: " + point2);
        point1.setX(1.2f);
        point1.setY(2.3f);
        System.out.println("After setting x and y: " + point1);
        point1.setXY(5.5f, 6.6f);
        System.out.println("After setXY: " + point1);
        System.out.println("Get X: " + point1.getX());
        System.out.println("Get Y: " + point1.getY());
        float[] xy = point1.getXY();
        System.out.println("Get XY: (" + xy[0] + ", " + xy[1] + ")");
    }
}
