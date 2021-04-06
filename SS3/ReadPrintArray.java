package SS3;

import java.util.Scanner;

public class ReadPrintArray {
    public static void main(String[] args) {

        int numitems;
        int[] items;
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the number of items: ");
        numitems = in.nextInt();
        items = new int[numitems];
        if (items.length > 0) {
            System.out.print("Enter the value of all items (separated by space): ");
            for (int i = 0; i < items.length; ++i) {
                items[i] = in.nextInt();
            }
        }
        for (int i = 0; i < items.length; ++i) {
            if (i == 0) {
                System.out.print(items[0]);
            } else {
                System.out.print(", " + items[i]);
            }
        }
        System.out.println("]");
        in.close();
    }

}
