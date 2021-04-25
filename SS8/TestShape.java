package SS8;

public class TestShape {
    public static void main(String[] args) {
        Shape s1 = new Rectangle("red", 4, 5);
        System.out.println("area is:" + s1.getArea());
        Shape s2 = new Triangle("red", 4, 5);
        System.out.println("area is:" + s2.getArea());
    }
}
