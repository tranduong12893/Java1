package SS4.bt11;

public class TestEmployee {
    public static void main(String[] args) {
        Employee emp = new Employee(1, "Nguyen", "Sin", 100000);
        System.out.println(emp.getName());
        System.out.println(emp.getAnnualSalary());
        System.out.println(emp.toString());
        System.out.println("Salary up to: " + emp.raiseSalary(10));
    }

}
