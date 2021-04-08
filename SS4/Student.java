package SS4;

import java.util.Scanner;

public class Student {
    String studName;
    int studAge;

    void initialize(){
        studName = "tran duong";
        studAge = 26;
    }
    void input(){
        System.out.println("Enter the Student name:");
        Scanner scan = new Scanner(System.in);
        studName = scan.nextLine();
        System.out.println("Enter the Student Age:");
        studAge = scan.nextInt();
    }
    void display(){
        System.out.println("Students Name: "+studName);
        System.out.println("Students Age: "+studAge);
    }

    /*public static void main(String[] args) {
        Student objStudent = new Student();
        objStudent.initialize();
        objStudent.display();
        System.out.println();
        Student objStudent1 = new Student();
        objStudent1.input();
        objStudent1.display();
    }*/

    public static void main(String[] args) {
        String ques;
        do{
            Student objStudent2 = new Student();
            objStudent2.input();
            objStudent2.display();
            System.out.println("Do you want continue?('y' to Continue,'n' to the End");
            Scanner scan = new Scanner(System.in);
            ques = scan.nextLine();
        }
        while (ques != "y");
        System.out.println("The End!");
    }
}
