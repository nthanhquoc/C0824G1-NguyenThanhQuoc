package bai_tap.abstract_interface.bt1;

public class Rectangle extends Shape implements Resizeable {
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
        return this.width;
    }
    public void setWidth(double width) {
        this.width = width;
    }
    public double getHeight() {
        return this.height;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    @Override
    public double getArea() {
        return this.width * this.height;
    }
    @Override
    public double getPerimeter() {
        return 2 * (this.width + this.height);
    }
    @Override
    public void resize(double percent) {
        this.width += this.width * percent / 100;
        this.height += this.height * percent / 100;
    }
}
