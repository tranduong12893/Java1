package SS3;

public class SumArrayMethodOverloading {
    public static void main(String[] args) {
        int[] al = {9, 1, 2, 6, 5};
        System.out.println(sum(al));
        double[] a2 = {1.1, 2.2, 3.3};
        System.out.println(sum(a2));
        float[] a3 = {1.1f, 2.2f, 3.3f};
        //System.out.println(sum(a3));
    }
    public static int sum(int[] array) {
        System.out.println("version 1");
        int sum = 0;
        for (int item : array) sum += item;
        return sum;
    }
    public static double sum(double[] array) {
        System.out.println("version 2");
        double sum = 0.0;
        for (double item : array) sum += item;
        return sum;
    }

}
