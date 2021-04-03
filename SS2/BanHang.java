package SS2;

import java.net.SocketOption;
import java.util.Scanner;

public class BanHang {
    public static void main(String[] args) {
        int QtyShirts, QtyTrousers, totalShi,totalTro;
        double discount=0,net,point=0;
        int priShirts=300, priTrousers= 700;

        System.out.println("Enter the number of Shirts of order:");
        Scanner scan = new Scanner(System.in);
        QtyShirts = scan.nextInt();
        System.out.println("Enter the number of Trousers of order:");
        QtyTrousers = scan.nextInt();

        totalShi=QtyShirts*priShirts;
        totalTro=QtyTrousers*priTrousers;
        System.out.println("Item"+"        "+"Quantity"+"     "+"Price"+"     "+"Total");
        System.out.println("---------------------------------------------------------");
        System.out.println("Shirts"+"       "+QtyShirts+"            "+"300"+"       "+totalShi);
        System.out.println("Trousers"+"     "+QtyTrousers+"            "+"700"+"       "+totalTro);
        System.out.print("Discount"+"                            ");
        System.out.println((totalShi+totalTro)>3000 ? (discount=(totalShi+totalTro)/10) : 0);
        System.out.println("---------------------------------------------------------");
        net = totalShi+totalTro-discount;
        System.out.println("Net Total"+"                           "+net);
        System.out.println("---------------------------------------------------------");
        System.out.print("points Earnet"+"       ");
        System.out.println(net>3000? point=(net/100) : point);
        System.out.println("Thank You!-");
    }
}
