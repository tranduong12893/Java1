package SS4;

public class customer {
    int customerId;
    String customerName;
    String customerAddress;
    int customerAge;

    public static void main(String[] args) {
        customer objcustomer1 = new customer();

        objcustomer1.customerId= 100;
        objcustomer1.customerName="Tran van Thai";
        objcustomer1.customerAddress="40 tran phu";
        objcustomer1.customerAge=30;

        System.out.println("Customer Identification Number: "+ objcustomer1.customerId);
        System.out.println("Customer Name is: "+ objcustomer1.customerName);
        System.out.println("Customer Address is: "+ objcustomer1.customerAddress);
        System.out.println("Customer Age is: "+ objcustomer1.customerAge);
    }
    void changeCustomerAddress(String address){
        customerAddress = address;
    }
    void displayCustomerInformation(){
        System.out.println("Customer Identification Number: "+ customerId);
        System.out.println("Customer Name is: "+ customerName);
        System.out.println("Customer Address is: "+ customerAddress);
        System.out.println("Customer Age is: "+ customerAge);
    }
}
