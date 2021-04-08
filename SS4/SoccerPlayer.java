package SS4;

import java.util.Scanner;

public class SoccerPlayer {
    private String Name;
    private int number, xLocation, yLocation;

    void run() {
        System.out.println("Chay:");
        System.out.print("Ten cau thu:");
        Scanner scan = new Scanner(System.in);
        Name = scan.nextLine();
        System.out.print("Mang ao so:");
        number = scan.nextInt();
        System.out.print("toa do X:");
        xLocation = scan.nextInt();
        System.out.print("toa do Y:");
        yLocation = scan.nextInt();
    }

    void jump(){
        System.out.println("Nhay:");
        System.out.print("Ten cau thu:");
        Scanner scan = new Scanner(System.in);
        Name = scan.nextLine();
        System.out.print("Mang ao so:");
        number = scan.nextInt();
        System.out.print("toa do X:");
        xLocation = scan.nextInt();
        System.out.print("toa do Y:");
        yLocation = scan.nextInt();
    }
    void kickBall(){
        System.out.println("Chay:");
        System.out.print("Ten cau thu:");
        Scanner scan = new Scanner(System.in);
        Name = scan.nextLine();
        System.out.print("Mang ao so:");
        number = scan.nextInt();
        System.out.print("toa do X:");
        xLocation = scan.nextInt();
        System.out.print("toa do Y:");
        yLocation = scan.nextInt();
    }
    void display(){
        System.out.println("Van Dong vien: "+Name+"\nmang ao so "+number+" \no vi tri:("+xLocation+","+yLocation+")");
    }
}