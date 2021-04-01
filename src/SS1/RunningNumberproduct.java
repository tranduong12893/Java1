package SS1;

public class RunningNumberproduct {
    public static void main(String[] args) {
        int lowerbound = 1;
        int upperbound = 10;
        int product = 1;
        int number = lowerbound;
        while (number <= upperbound) {
            product = product * number;
            number=number+1;
        }
        System.out.println("The product from " + lowerbound + " to " + upperbound + " is " + product);
    }
}
