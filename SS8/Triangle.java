package SS8;

import SS5.Product;

public class Triangle extends Shape{
    private int base, height;

    public Triangle(String color, int base, int height) {
        super(color);
        this.base = base;
        this.height = height;
    }

    @Override
    public String toString() {
        return "Triangle:"+
                "\nBase= "+ base+
                "\nHeight= "+ height+
                super.toString();
    }

    @Override
    public double getArea() {
        return 0.5*base*height;
    }
}
