package SS8;

public class Rectangle1 extends Shape1{
    private double length, width;

    public Rectangle1(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public String toString() {
        return "Rectangle1{" +
                "length=" + length +
                ", width=" + width +
                '}';
    }

    @Override
    public double getArea() {
        return length*width;
    }
}
