package Practice;

import java.util.Scanner;

public class MainFlight {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number;
        System.out.println("Moi ban nhap so chuyen bay(0-99):");
        number = scan.nextInt();
        do {
            System.out.println("So chuyen bay sai!");
            System.out.println("Moi ban nhap lai so chuyen bay:");
            number = scan.nextInt();
        }
        while (number<0);
        System.out.println("Nhap diem den cua ban:");
        String destination = scan.next();
        Flight f1 = new Flight(number,destination);
        f1.display();
    }
}
