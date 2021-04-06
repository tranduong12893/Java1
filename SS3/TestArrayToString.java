package SS3;

import java.util.Arrays;

public class TestArrayToString {
    public static void main(String[] args) {
        int[] al = {6 ,1, 3, 4, 5};
        int[] a2 = {};
        double[] a3 = new double[1];
        System.out.println(Arrays.toString(al)); //[6, 1, 3, 4, 5]
        System.out.println(Arrays.toString(a2)); //[]
        System.out.println(Arrays.toString(a3)); //[0.0]
        a3[0] = 2.2;
        System.out.println(Arrays.toString(a3)); //[2.2]
    }
}
