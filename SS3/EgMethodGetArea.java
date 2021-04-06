package SS3;

public class EgMethodGetArea {
    public static void main(String[] args) {
        double r = 1.1, area, area2;

        area = getArea(r);
        System.out.println("area is " + area);

        area2 = getArea(2.2);
        System.out.println("area 2 is " + area2);

        System.out.println("area 3 is " + getArea(3.3));
    }

    public static double getArea(double radius) {
        return radius * radius * Math.PI;
    }
    public  static returnValueType methodName(arg-1-type arg-1, arg-1-type arg-1, ...){
        body;
    }
    public static double getArea(double radius) {
        return radius * radius * Math.PI;
    }
    public static int max(int numberl, int number2) {
        if (numberl > number2) {
            return numberl;
        } else {
            return number2;
        }
    }
    double areal = getArea(1.1);
    double r2 = 2.2;
    double area2 = getArea(r2);
    System.out.println("Area is: " + area(r3));

    int resultl = max(5, 8);
    int il = 7, i2 = 9;
    int result2 = max(il, i2);
    System.out.println("Max is: " + max(15, 16));

}
