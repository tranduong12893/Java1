package SS4.bt11;

public class Account {
    private String id;
    private String name;
    private int balance=0;

    public Account(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public Account(String id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public String getId(){
        return id;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }

    public void credit(int amount) {
        this.balance += amount;
    }

    public void debit(int amount) {
        if (amount > this.balance) {
            System.out.println("Amount Exceeded");
        } else {
            this.balance -= amount;
        }
    }
    public void tranferTo(Account account, int amount) {
        if (amount > this.balance) {
            System.out.println("Amount Exceeded");
        } else {
            this.balance -= amount;
            account.credit(amount);
        }
    }

    public String toString(){
        return "ID: "+this.getId()+"-Name: "+this.getName()+"-Amount: "+this.balance;
    }
}
