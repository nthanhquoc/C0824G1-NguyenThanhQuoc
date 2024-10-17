package bai_tap.abstract_interface.bt2;

public class Rectangle extends Geometric {
    private double width;
    private double height;
    public Rectangle(){
        this.width=1.0;
        this.height=1.0;
    }
    public Rectangle(double width, double height){
        this.width=width;
        this.height=height;
    }
    public double getWidth() {
        return width;
    }
    public void setWidth(double width) {
        this.width = width;
    }
    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    @Override
    public double getArea() {
        return width * height;
    }
    @Override
    public double getPerimeter() {
        return 2 * (width + height);
    }
}
