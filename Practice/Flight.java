package Practice;

public class Flight {
    private int number;
    private String destination;

    public Flight() {
        this.number = 0;
    }

    public Flight(int number, String desrination) {
        this.number = number;
        this.destination = desrination;
    }

    public int getNumber() {
        return number;
    }

    public String getDestination() {
        return destination;
    }

    public  void display(){
        System.out.println(getNumber()+","+getDestination());
    }
}
