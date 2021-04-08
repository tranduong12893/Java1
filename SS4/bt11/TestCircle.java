package SS4.bt11;

public class TestCircle {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        System.out.println("The cirle has radius of"+c1.getRadius()+" and area of "+c1.getArea());
        Circle c2 = new Circle();
        System.out.println("The cirle has radius of"+c2.getRadius()+" and area of "+c2.getArea());

        Circle c4=new Circle();
        c4.setRadius(5.0);
        System.out.println("radius is: "+c4.getRadius());
        c4.setColor("blue");
        System.out.println("Color is: "+c4.getColor());

        Circle c3=new Circle(5.0);
        System.out.println(c3.toString());

    }
}
