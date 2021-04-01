package SS1;

public class RunningNumberMod7Sum {
    public static void main(String[] args) {
        int lowerbound = 7;
        int upperbound = 1000;
        int sum = 0;
        int number = lowerbound;
        while (number <= upperbound) {
            sum = sum + number;
            number=number+7;
        }
        System.out.println("The sum from " + lowerbound + " to " + upperbound + " is " + sum);
    }
}
