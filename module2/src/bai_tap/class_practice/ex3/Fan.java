package bai_tap.class_practice.ex3;

public class Fan {
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;
    private int speed;
    private boolean status;
    private double radius;
    private String color;

    public void setSpeed(int speed) {
        if (speed == SLOW || speed == MEDIUM || speed == FAST) {
            this.speed = speed;
        } else {
            System.out.println("Invalid speed: " + speed + ". Setting to default speed (SLOW).");
            this.speed = SLOW;
        }
    }

    public int getSpeed() {
        return this.speed;
    }

    public void setStatus(boolean status) {
        this.status = status;
        if (!status) {
            System.out.println("Fan is off. Resetting speed to SLOW.");
            this.speed = SLOW;
        }
    }

    public boolean getStatus() {
        return this.status;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return this.radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return this.color;
    }

    public Fan() {
        this.speed = SLOW;
        this.status = false;
        this.radius = 5;
        this.color = "Blue";
    }

    @Override
    public String toString() {
        if (this.status) {
            return "Speed = " + this.speed + ", Color = " + this.color + ", Fan is on";
        } else {
            return "Speed = " + SLOW + ", Color = " + this.color + ", Fan is off";
        }
    }

    public static void main(String[] args) {
        Fan fan1 = new Fan();
        fan1.setStatus(true);
        fan1.setSpeed(Fan.FAST);
        fan1.setColor("Blue");
        System.out.println(fan1);

        Fan fan2 = new Fan();
        fan2.setStatus(false);
        fan2.setSpeed(Fan.FAST);
        fan2.setColor("Red");
        System.out.println(fan2);
    }
}
