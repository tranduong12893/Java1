package SS1;

import java.util.Scanner;

public class Account1 {
    public static void main(String[] args) {
        double accountBalance = 10000.00;
        double withdraw = 0.00;
        boolean possible = false;
        String cusname;

        System.out.printf("Available account blance: $%.2f \n", accountBalance);
        System.out.println("Enter the amount to withdraw: $");
        Scanner scan = new Scanner(System.in);

        withdraw = Double.parseDouble(scan.nextLine());
        System.out.println("Enter the Customer Name: ");
        cusname = scan.nextLine();

        possible = (accountBalance > withdraw);
        accountBalance = possible? accountBalance - withdraw : accountBalance;
        System.out.println("welcome" + cusname);
        System.out.printf("\nCurrent account balance: $%.2f" , accountBalance);
        System.out.println("\nTransaction Successful: " + possible);
    }
}

