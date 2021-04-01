package SS1;

import java.util.Scanner;

public class rectangleComputation {
    public static void main(String[] args) {
        double length, width, area, perimeter;
        System.out.println("Enter the length of a rectangle:");
        Scanner scan = new Scanner(System.in);
        length = scan.nextInt();
        System.out.println("Enter the width of a rectangle:");
        width = scan.nextDouble();
        perimeter = (width+length)*2;
        area = width*length;
        System.out.printf("The area of a rectangle is:%f",area);
        System.out.println();
        System.out.printf("The perimeter of a rectangle is:%f",perimeter);
    }
}
