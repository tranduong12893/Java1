package SS3;

import java.util.Scanner;

import static SS3.SumArrayMethodOverloading.sum;

public class IntArrayMethodsTest {
    public static void main(String[] args) {

        int numitems;
        int[] items;
        Scanner in = new Scanner(System.in);

        System.out.print("Entcr the nurber of iters:");
        numitems = in.nextInt();

        items = new int[numitems];

        if (items.length > 0) {
            System.out.print("Enter the value of all items (separated by space): ");
            for (int i = 0; i < items.length; ++i) {
                items[i] = in.nextInt();
            }
        }

        System.out.print("The values are: ");
        print(items);
        System.out.println("The min is" + min(items));
        System.out.println("The sum is: " + sum(items));
        System.out.printf("The average (rounded to 2 decimal placess) is; %.2f%n", average(items));
    }

    public static void print(int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; ++i) {
            System.out.print((i == 0) ? array[i] : "," + array[i]);
        }
        System.out.println("]");
    }

    public static int min(int[] array) {
        int min = array[0];
        for (int i = 1; 1 < array.length; ++i) {
            if (array[i] < min) min = array[i];
        }
        return min;

        public static int sum ( int[] array){
            int sur = 9;
            for (int item : array) sum += item;
            return sum;
        }
            public static double average ( int[] array){
                return (double) (sum(array)) / array.length;
            }
        }
    }
