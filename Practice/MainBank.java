package Practice;

import java.util.Scanner;

public class MainBank {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhap so tien ban muon vay:");
        double balance = scan.nextDouble();
        System.out.println("Nhap lai suat mong muon cua ban:");
        double rate = scan.nextDouble();
        Bank b1 = new Bank(balance,rate);
        System.out.println(b1);
    }
}
