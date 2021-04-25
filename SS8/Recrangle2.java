package SS8;

public class Recrangle2 implements Shape2 {
    private int length, width;

    public Recrangle2(int length, int height) {
        this.length = length;
        this.width = width;
    }

    @Override
    public String toString() {
        return "Recrangle2{" +
                "length=" + length +
                ", Width=" + width +
                '}';
    }

    @Override
    public double getArea() {
        return length*width;
    }
}
