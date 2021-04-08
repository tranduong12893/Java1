package SS4;

import java.util.Scanner;

public class Car {
    private String plaeNumber;
    private int xLocation, yLocation, speed;

    void move(){
        System.out.println("Xe di chuyen:");
        System.out.print("Bien so xe:");
        Scanner scan = new Scanner(System.in);
        plaeNumber = scan.nextLine();
        System.out.print("Toc do:");
        speed = scan.nextInt();
    }
    void park(){
        System.out.println("Vi Tri do xe");
        System.out.print("Bien so xe:");
        Scanner scan = new Scanner(System.in);
        plaeNumber = scan.nextLine();
        System.out.print("toa do X:");
        xLocation = scan.nextInt();
        System.out.print("toa do Y:");
        yLocation = scan.nextInt();
    }
    void accelerate(){
        System.out.println("Xe di chuyen:");
        System.out.print("Bien so xe:");
        Scanner scan = new Scanner(System.in);
        plaeNumber = scan.nextLine();
        System.out.print("toa do X:");
        xLocation = scan.nextInt();
        System.out.print("toa do Y:");
        yLocation = scan.nextInt();
        System.out.print("Toc do can dat den:");
        speed = scan.nextInt();
    }
    void display1(){
        System.out.println("Xe: "+plaeNumber+"\n do o vi tri:("+xLocation+","+yLocation+")");
    }
    void display2(){
        System.out.println("Xe: "+plaeNumber+"\n co toc do:"+speed+"Km/h");
    }
    void display3(){
        System.out.println("Xe: "+plaeNumber+"\n o vi tri(:"+xLocation+","+yLocation+")\nTang toc len:"+speed+"km/h");
    }
}
