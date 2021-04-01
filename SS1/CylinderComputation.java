package SS1;
import java.util.Scanner;
public class CylinderComputation {
    public static void main(String[] args) {
        double length, radius, surfaceArea,baseArea, volume;
        final double PI = 3.14159265;
        System.out.println("Enter the length of a Cylinder:");
        Scanner scan = new Scanner(System.in);
        length = scan.nextInt();
        System.out.println("Enter the radius of a Cylinder:");
        radius = scan.nextDouble();
        surfaceArea = 2*PI*length*radius;
        baseArea = (2*PI*radius*radius)+(2*PI*length*radius);
        volume = PI*radius*radius*length;
        System.out.printf("The surfaceArea of a Cylinder is:%f",surfaceArea);
        System.out.println();
        System.out.printf("The baseArea of a Cylinder is:%f",baseArea);
        System.out.println();
        System.out.printf("The volume of a Cylinder is:%f",volume);
    }
}
