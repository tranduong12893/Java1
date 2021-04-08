package SS4.bt11;

public class Employee {
    private int id;
    private String lastName;
    private String firstName;
    private int salary;

    public Employee(int id, String lastName, String firstName, int salary) {
        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String  getName(){
        return this.firstName+" "+ this.lastName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }


    public int getAnnualSalary() {
        return this.salary * 12;
    }

    public int raiseSalary(int percent) {
        return this.salary +  (this.salary * percent)/100;
    }

    public String toString() {
        return this.getName() + " - " + "salary: " + this.salary;
    }

}
