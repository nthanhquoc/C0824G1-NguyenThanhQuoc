package bai_tap.class_practice.ex3;

public class Fan {
    final int SLOW=1;
    final int MEDIUM=2;
    final int FAST=3;
    private int speed;
    private boolean status;
    private double radius;
    private String color;
    public  void setSpeed(int speed) {
        if(speed==SLOW||speed==MEDIUM||speed==FAST){
            this.speed=speed;
        }
        else{
            System.out.println("Invalid speed. Setting to default speed");
            this.speed=SLOW;
        }
    }
    public int getSpeed() {
        return this.speed;
    }
    public void setStatus(boolean status) {
        this.status = status;
    }
    public boolean getStatus() {
        return this.status;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }
    public double getRadius() {
        return this.radius;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String getColor(){
        return this.color;
    }
    public Fan(){
        this.speed=SLOW;
        this.status=false;
        this.radius=5;
        this.color="Blue";
    }

    @Override
    public String toString() {
        if(this.status){
            return "Speed = "+this.speed+", Color = "+this.color+", Fan is on";
        }
        else{
            return "Speed = "+this.speed+", Color = "+this.color+", Fan is off";
        }
    }

    public static void main(String[] args) {
        Fan fan1=new Fan();
        fan1.setStatus(true);
        fan1.setSpeed(3);
        fan1.setColor("Blue");
        System.out.println(fan1.toString());

        Fan fan2=new Fan();
        fan2.setStatus(false);
        fan2.setSpeed(5);
        fan2.setColor("Red");
        System.out.println(fan2.toString());
    }
}
