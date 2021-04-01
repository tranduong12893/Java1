package SS1;

public class Circlecomputation {
    public static void main(String[] args) {
        double radius, area, circumference;
        final double PI = 3.14159265;
        radius = 1.2;
        area = radius * radius * PI;
        circumference = 2.0 * radius * PI;
        System.out.print("The radius is ");
        System.out.println(radius);
        System.out.print("The area is ");
        System.out.println(area);
        System.out.print("The circumference is ");
        System.out.println(circumference);
    }
}
