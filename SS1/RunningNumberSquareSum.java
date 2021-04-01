package SS1;

public class RunningNumberSquareSum {
    public static void main(String[] args) {
        int lowerbound = 1;
        int upperbound = 100;
        int sum = 0;
        int number = lowerbound;
        while (number <= upperbound) {
            sum = sum + number*number;
            number=number+1;
        }
        System.out.println("The sum from " + lowerbound + " to " + upperbound + " is " + sum);
    }
}
