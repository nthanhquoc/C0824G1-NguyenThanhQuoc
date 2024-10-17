package bai_tap.abstract_interface.bt2;

import bai_tap.inheritance.bt4.Triangle;

public class Main {
    public static void main(String[] args) {
        Geometric[]shapes = new Geometric[3];
        shapes[0] = new Circle(3);
        shapes[1] = new Rectangle(3, 5);
        shapes[2] = new Square(5);
        for(Geometric shape:shapes){
            System.out.println("Area: "+shape.getArea());
            if(shape instanceof Colorable){
                ((Colorable) shape).howToColor();
            }
        }
    }
}
