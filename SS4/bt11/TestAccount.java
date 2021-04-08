package SS4.bt11;


import java.util.Scanner;

public class TestAccount {

    public static void main(String[] args) {
        Account a = new Account("1", "A", 50);
        Account b = new Account("1", "B");
        System.out.println("Balance A: " + a.getBalance());
        System.out.println("Balance B: " + b.getBalance());
        System.out.println();
        // Cong tien vao tai khoan
        System.out.println("cong vao tai khoan A:30");
        a.credit(30);
        System.out.println("Balance A: " + a.getBalance());
        System.out.println("Balance B: " + b.getBalance());
        System.out.println();
        // Tru tien vao tai khoan
        System.out.println("tru vao tai khoan A:20");
        a.debit(20);
        System.out.println("Balance A: " + a.getBalance());
        System.out.println("Balance B: " + b.getBalance());
        System.out.println();
        // Tru tien vao tai khoan khong hop le
        System.out.println("chuyen tien vao tai khoan B:1000");
        a.debit(1000);
        System.out.println("Balance A: " + a.getBalance());
        System.out.println("Balance B: " + b.getBalance());
        System.out.println();
        // Chuyen tien cho b
        System.out.println("chuyen tien vao tai khoan B:10");
        a.tranferTo(b, 10);
        System.out.println("Balance A: " + a.getBalance());
        System.out.println("Balance B: " + b.getBalance());
        System.out.println();
        System.out.println(a.toString());
        System.out.println(b.toString());
    }
}
