package bai_tap.abstract_interface.bt2;

public class Circle extends Geometric {
    private double radius;
    public Circle() {
        this.radius = 1.0;
    }
    public Circle(double radius){
        this.radius = radius;
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }
    @Override
    public double getArea() {
        return 0;
    }

    @Override
    public double getPerimeter() {
        return 0;
    }
}
