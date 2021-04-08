package SS4;

public class Employee {
    String employeeName;
    int employeeAge;
    double employeeSalary;
    boolean MaritalStartus;

    void displayEmployeeDetails(){
        System.out.println("EmployeeDetails");
        System.out.println("===============");
        System.out.println("EmployeeName: "+ employeeName);
        System.out.println("EmployeeAge: "+ employeeAge);
        System.out.println("EmployeeSalary: "+ employeeSalary);
        System.out.println("EmployeeMaritalStatus: "+ MaritalStartus);
    }
}
