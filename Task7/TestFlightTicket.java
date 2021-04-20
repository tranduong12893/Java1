package SS6.Task7;

import java.util.Scanner;

public class TestFlightTicket {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Date d1 = new Date();
        Time t1 = new Time();
        System.out.println("Enter the type of cabin:");
        System.out.println("1. Business");
        System.out.println("2. First");
        System.out.println("3. Economy");
        byte typeOfCabin = scan.nextByte();
        System.out.println("Enter the number of tickets:");
        byte noOfTicket = scan.nextByte();
        FlightTicket f1 = new FlightTicket(d1,t1,noOfTicket,typeOfCabin);
        f1.displayTicketInformation();
    }
}
