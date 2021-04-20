package SS6.Task7;

import java.util.Scanner;

public class TestFlightTicket2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter departure date (mm dd yyyy):");
        byte month = scan.nextByte();
         byte day = scan.nextByte();
         short year = scan.nextShort();
        Date d1 = new Date(month,day,year);
        System.out.println("Enter departure time (hh mm):");
        byte hours = scan.nextByte();
        byte minutes = scan.nextByte();
        Time t1 = new Time(hours,minutes);
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
