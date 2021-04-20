package SS6.Task7;

public class FlightTicket {
    private Date departureDate;
    private Time departureTIme;
    private byte noOfTickets, typeOfCabin;
    private double price=1000, totalPrice;

    public FlightTicket(Date departureDate, Time departureTIme, byte noOfTickets, byte typeOfCabin) {
        this.departureDate = departureDate;
        this.departureTIme = departureTIme;
        this.noOfTickets = noOfTickets;
        this.typeOfCabin = typeOfCabin;
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
        return totalPrice=noOfTickets*price;
    }

    public void setNoOfTickets(byte noOfTickets) {
        this.noOfTickets = noOfTickets;
    }

    public void displayTicketInformation(){
        System.out.println("Following is the information about the ticket(s) booked:");
        System.out.println("--------------------------------------------------------");
        System.out.println("Departure Date:" + departureDate);
        System.out.println("Departure time:"+ departureTIme);
        System.out.println("Number of tickets: "+noOfTickets);
        if(typeOfCabin==1){
            System.out.println("Type of cabin: Business class");
            this.price=3000;
        }else if (typeOfCabin==2){
            System.out.println("Type of cabin: First class");
            this.price=2000;
        }else {
            System.out.println("Type of cabin: Economy class");
        }
        System.out.println("Total cost of the ticket: $"+ getTotalPrice());
    }
}
