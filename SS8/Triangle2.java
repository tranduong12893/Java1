package SS8;

public class Triangle2 implements Shape2{
    private double base, heightl;

    public Triangle2(double base, double heightl) {
        this.base = base;
        this.heightl = heightl;
    }

    @Override
    public String toString() {
        return "Triangle2{" +
                "base=" + base +
                ", heightl=" + heightl +
                '}';
    }

    @Override
    public double getArea() {
        return 0.5*base*heightl;
    }
}
