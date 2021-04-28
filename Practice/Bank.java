package Practice;

public class Bank {
    private double balance, rate;

    public Bank(double balance, double rate) {
        this.balance = balance;
        this.rate = rate;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }
    public double calculateInterrest(){
        return balance*(rate/1200);
    }

    public String toString() {
        return "Ban muon vay la: " + balance +"VND voi lai suat "+
                rate+"%/ nam"+
                "\nLai hang thang la: " + calculateInterrest() + "VND";
    }
}
