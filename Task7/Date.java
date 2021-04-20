package SS6.Task7;

import java.util.Scanner;

public class Date {
    private byte day, month;
    private short year;

    public Date(byte month,byte day,  short year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public Date() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter departure date (mm dd yyyy):");
        this.month = scan.nextByte();
        this.day = scan.nextByte();
        this.year = scan.nextShort();
    }

    public byte getDay() {
        return day;
    }

    public void setDay(byte day) {
        this.day = day;
    }

    public byte getMonth() {
        return month;
    }

    public void setMonth(byte month) {
        this.month = month;
    }

    public short getYear() {
        return year;
    }

    public void setYear(short year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return month + "\\" + day + "\\" + year;
    }
}
