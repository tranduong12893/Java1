package Java117;

public class MovablePoint extends Point{
    private float xSpeed, ySpeed;

    public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint() {
        this.xSpeed=0.0f;
        this.ySpeed=0.0f;
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }
    public void getSpeed(){
        float[] getSpeed = new float[2];
        getSpeed[0]= this.xSpeed;
        getSpeed[1]= this.ySpeed;
    }
    public void setSpeed(float xSpeed,float ySpeed){
        this.xSpeed=xSpeed;
        this.ySpeed=ySpeed;
    }

    @Override
    public String toString() {
        return "(" + super.getX() + "," + super.getY() + ")"+
                "\nSpeed=("+super.getX()*xSpeed+","+super.getY()*ySpeed+")";
    }
    public void move(){

    }
}
