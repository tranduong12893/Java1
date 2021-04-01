package SS1;
import java.util.Scanner;
public class Avg {
    public static void main(String[] args) {
        int Toan, Ly, Hoa;
        float Avg;

        System.out.println("Dien diem 3 mon:");
        System.out.println("Toan:");
        Scanner scan = new Scanner(System.in);
        Toan = scan.nextInt();
        System.out.println("Ly:");
        Ly = scan.nextInt();
        System.out.println("Hoa:");
        Hoa = scan.nextInt();
        Avg= (Toan+Ly+Hoa)/3;
        System.out.printf("Diem trung binh:%f",Avg);

    }
}
