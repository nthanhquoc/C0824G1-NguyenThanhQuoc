package bai_tap.inheritance.bt2;

public class TestPoint3D {
    public static void main(String[] args) {
        Point3D point1 = new Point3D();
        System.out.println("Default Point3D: " + point1);
        Point3D point2 = new Point3D(1.1f, 2.2f, 3.3f);
        System.out.println("Point3D with parameters: " + point2);
        point1.setX(4.4f);
        point1.setY(5.5f);
        point1.setZ(6.6f);
        System.out.println("After setting x, y, and z: " + point1);
        point1.setXYZ(7.7f, 8.8f, 9.9f);
        System.out.println("After setXYZ: " + point1);
        System.out.println("Get X: " + point1.getX());
        System.out.println("Get Y: " + point1.getY());
        System.out.println("Get Z: " + point1.getZ());
        float[] xyz = point1.getXYZ();
        System.out.println("Get XYZ: (" + xyz[0] + ", " + xyz[1] + ", " + xyz[2] + ")");
    }
}

