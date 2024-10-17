package bai_tap.abstract_interface.bt1;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(5.0);
        shapes[1] = new Rectangle(5.0, 5.0);
        shapes[2] = new Square(5.0);
        for (Shape shape : shapes) {
            if (shape != null) {
                double initialArea = shape.getArea();
                double randomArea = 1 + rand.nextInt(100);
                System.out.println("Loại hình: " + shape.toString());
                System.out.println("Diện tích ban đầu: " + initialArea);
                if (shape instanceof IResizeable) {
                    ((IResizeable) shape).resize(randomArea);
                    double newArea = shape.getArea();
                    System.out.println("Tăng Kích Thước Lên :" + randomArea + " ");
                    System.out.println("Dien Tich Sau Khi Tang Kich Thuoc " + newArea);
                }

            }else {
                System.out.println("Một phần tử trong mảng là null.");
            }
        }
    }
}
