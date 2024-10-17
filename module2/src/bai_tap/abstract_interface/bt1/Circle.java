package bai_tap.abstract_interface.bt1;

public class Circle extends Shape implements IResizeable {
    private double radius;

    public Circle() {
        this.radius = 1.0;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return this.radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public void resize(double percent) {
        this.radius += this.radius * percent / 100;
    }
    @Override
    public String toString() {
        return "Circle [radius=" + radius + "]";
    }
}
