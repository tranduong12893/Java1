package SS1;

public class SaleProducts {
    public static void main(String[] args) {
        int number1 = 50, Qty1 = 5;
        int number2 = 60, Qty2 = 7;
        int number3 = 25, Qty3 = 9;
        int number4 = 45, Qty4 = 3;
        int number5 = 96, Qty5 = 4;
        int total = ((number1*Qty1)+(number2*Qty2)+(number3*Qty3)+(number4*Qty4)+(number5*Qty5));
        System.out.printf("Co %d san pham 1 voi gia ban: %d",Qty1, number1);
        System.out.println();
        System.out.printf("Co %d san pham 1 voi gia ban: %d",Qty2, number2);
        System.out.println();
        System.out.printf("Co %d san pham 1 voi gia ban: %d",Qty3, number3);
        System.out.println();
        System.out.printf("Co %d san pham 1 voi gia ban: %d",Qty4, number4);
        System.out.println();
        System.out.printf("Co %d san pham 1 voi gia ban: %d",Qty5, number5);
        System.out.println();
        System.out.printf("Tong gia tri hang hoa la:%d", total);
    }
}
