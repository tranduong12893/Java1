package SS8;

public class TestShape2 {
    public static void main(String[] args) {
        Shape2 s1 = new Recrangle2(3,5);
        System.out.println(s1);
        System.out.println("Area is: "+ s1.getArea());

        Shape2 s2 = new Triangle2(3,5);
        System.out.println(s2);
        System.out.println("Area is: "+ s2.getArea());
    }
}
