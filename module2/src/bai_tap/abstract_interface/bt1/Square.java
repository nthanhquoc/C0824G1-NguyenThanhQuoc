package bai_tap.abstract_interface.bt1;

public class Square extends Shape implements Resizeable{
    private double side;
    public Square(){
        this.side = 1.0;
    }
    public Square(double side){
        this.side = side;
    }
    public double getSide(){
        return side;
    }
    public void setSide(double side){
        this.side = side;
    }
    @Override
    public double getArea() {
        return side * side;
    }
    @Override
    public double getPerimeter() {
        return side * 4;
    }
    @Override
    public void resize(double percent) {
        this.side += this.side * percent / 100;
    }
    @Override
    public String toString() {
        return "Square [side=" + side + "]";
    }
}
