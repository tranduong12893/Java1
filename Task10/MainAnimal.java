package Task10;

import java.util.Scanner;

public class MainAnimal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Bird b1 = new Bird("yen");
        b1.toString();
        Fish f1 = new Fish("sau");
        f1.toString();
        Tiger t1 = new Tiger("cop");
        t1.toString();
        b1.fly();
        f1.swim();
        f1.dive();
        t1.run(30);
        System.out.println("Nhap tong khoi luong thuc an:");
        int mass = scan.nextInt();
        Food m1 = new Food(mass);
        Animal a1 = new Animal(m1);
        System.out.println("luong thuc an cho 1 lan la:");
        int m = scan.nextInt();
        a1.eat(m1,m);
        a1.HaveBaby("hihi");
    }
}
