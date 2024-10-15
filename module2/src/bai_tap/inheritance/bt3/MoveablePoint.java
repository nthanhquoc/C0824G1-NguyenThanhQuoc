package bai_tap.inheritance.bt3;

public class MoveablePoint extends Point {
    private float xSpeed;
    private float ySpeed;
    public MoveablePoint(){
        super();
        this.xSpeed = 0.0f;
        this.ySpeed = 0.0f;
    }
    public MoveablePoint(float xSpeed,float ySpeed){
        super();
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public MoveablePoint(float x,float y,float xSpeed,float ySpeed){
        super(x,y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public float getXSpeed() {
        return this.xSpeed;
    }
    public void setXSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }
    public float getYSpeed() {
        return this.ySpeed;
    }
    public void setYSpeed(float ySpeed) {
        this.ySpeed=ySpeed;
    }
    public void setSpeed(float xSpeed,float ySpeed){
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public float[] getSpeed(){
        return new float[]{this.xSpeed,this.ySpeed};
    }
    @Override
    public String toString() {
        return super.toString()+",Speed = ("+xSpeed+","+ySpeed+")";
    }

}
