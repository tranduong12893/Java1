package SS3;

public class MeanSDArray {
    public static void main(String[] args) {

        int[] marks = {74, 43, 58, 60, 90, 64, 70};
        int sum = 0;
        int sumSq = 0;
        double mean, stdDev;

        for (int i = 0; i < marks.length; ++i) { sum += marks[i];
            sumSq += marks[i] * marks[i];
        }
        mean = (double)sum / marks.length;
        stdDev = Math.sqrt((double)sumSq / marks.length - mean * mean);

        System.out.printf("Mean is: %.2f%n", mean);
        System.out.printf("Standard deviation is: %.2f%n", stdDev);
        //10.4
        int[] numbers = {8, 2,	4, 3};
        for (int number : numbers) {
            sum += number;
            sumSq += number * number;
        }
        System.out.println("The sum is: " + sum);
        System.out.println("The square sum is: " + sumSq);
        //10.5

    }
}
