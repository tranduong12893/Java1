package Java117;

public class Point2D {
    private float x, y;

    public Point2D() {
        this.x = 0.0f;
        this.y = 0.0f;
    }

    public Point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setXY(float x,float y){
        this.x=x;
        this.y=y;
    }

    public float[] getXY(){
        float[] pointXY = new float[2];
        pointXY[0]= this.x;
        pointXY[1]= this.y;
        return pointXY;
    }

    @Override
    public String toString() {
        return "Point2D[" +
                "x=" + x +
                ",y=" + y +
                ']';
    }
}
