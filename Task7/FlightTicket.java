package SS6.Task7;

public class FlightTicket {
    private Date departureDate;
    private Time departureTIme;
    private byte noOfTickets, typeOfCabin;
    private double price=1000, totalPrice;

    public FlightTicket() {
    }

    public Date getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(byte month,byte day,short year) {
        this.departureDate = departureDate;
    }

    public Time getDepartureTIme() {
        return departureTIme;
    }

    public void setDepartureTIme(Time departureTIme) {
        this.departureTIme = departureTIme;
    }

    public double getTotalPrice() {
        return totalPrice=noOfTickets*typeOfCabin;
    }
    public void displayTicketInformation(){
        System.out.println("Following is the information about the ticket(s) booked:");
        System.out.println("--------------------------------------------------------");
        System.out.println("Departure Date:" + departureDate);
        System.out.println("Departure time:"+ departureTIme);
        System.out.println("Number of tickets: "+noOfTickets);
        System.out.println("Type of cabin: "+typeOfCabin);
        System.out.println("Total cost of the ticket: "+ totalPrice);
    }
}
