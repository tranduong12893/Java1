package SS8;

public class Triangle1 extends Shape1{
    private double base, height;

    public Triangle1(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public String toString() {
        return "Triangle1{" +
                "base=" + base +
                ", height=" + height +
                '}';
    }

    @Override
    public double getArea() {
        return 0.5*base*height;
    }
}
