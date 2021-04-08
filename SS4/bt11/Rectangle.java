package SS4.bt11;

public class Rectangle {
    private float length;
    private float width;

    public Rectangle() {
        length=1.0f;
        width=1.0f;
    }

    public Rectangle(float length, float width) {
        this.length = length;
        this.width = width;
    }

    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public double getArea() {
        return this.length * this.width;
    }

    public double getPerimeter(){
        return (this.width+this.length)*2;
    }
    public String toString() {
        return "Length: " + this.length + " - Width: " + this.width;
    }

}
