package SS2;

import java.util.Scanner;

public class score {
    public static void main(String[] args) {
        int mar1, sci1, eng1, sum1, pt1;
        int mar2, sci2, eng2, sum2, pt2;

        System.out.println("Enter mark obtained in Mark by Toan:");
        Scanner scan = new Scanner(System.in);
        mar1 = scan.nextInt();
        System.out.println("Enter mark obtained in Science by Toan:");
        sci1 = scan.nextInt();
        System.out.println("Enter mark obtained in English by Toan:");
        eng1 = scan.nextInt();
        System.out.println("Enter mark obtained in Mark by Huong:");
        mar2 = scan.nextInt();
        System.out.println("Enter mark obtained in Science by Huong:");
        sci2 = scan.nextInt();
        System.out.println("Enter mark obtained in English by Huong:");
        eng2 = scan.nextInt();
        sum1=mar1+sci1+eng1;
        pt1=sum1/3;
        sum2=mar2+sci2+eng2;
        pt2=sum2/3;

        System.out.println("Total marks score by Toan = "+ sum1);
        System.out.println("Percentage = "+ pt1+"%");
        System.out.println("Total marks score by Huong = "+ sum2);
        System.out.println("Percentage = "+ pt2+"%");
        System.out.println(" ");
        if(pt1>pt2){
            System.out.println("Is Toan's percentage lesser than Huong? No");
            System.out.println("Is Toan's percentage greater than Huong? yes");
            System.out.println("Toan's and Huong's percentage are squal? No");
        }else{
            if (pt1==pt2){
                System.out.println("Is Toan's percentage lesser than Huong? No");
                System.out.println("Is Toan's percentage greater than Huong? No");
                System.out.println("Toan's and Huong's percentage are squal? yes");
            }else{
                System.out.println("Is Toan's percentage lesser than Huong? Yes");
                System.out.println("Is Toan's percentage greater than Huong? No");
                System.out.println("Toan's and Huong's percentage are squal? No");
            }
        }
        System.out.println(" ");
        if(pt1>75){
            System.out.println("Scholarship Amount for Toan= $20000");
        }else {
            if (((75>pt1)||(75==pt1))&&(pt1>60)){
                System.out.println("Scholarship Amount for Toan= $10000");
            }else{
                System.out.println("Scholarship Amount for Toan= $0");
            }
        }
        if(pt2>75){
            System.out.println("Scholarship Amount for Huong= $20000");
        }else {
            if ((75>pt2)&&(pt2>60)){
                System.out.println("Scholarship Amount for Huong= $10000");
            }else{
                System.out.println("Scholarship Amount for Huong= $0");
            }
        }
    }
}
