package SS6.Task7;

import java.util.Scanner;

public class Time {
    private byte hours, minutes;

    public Time(byte hours, byte minutes) {
        this.hours = hours;
        this.minutes = minutes;
    }

    public Time() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter departure time (hh mm):");
        this.hours = scan.nextByte();
        this.minutes = scan.nextByte();
    }

    public byte getHours() {
        return hours;
    }

    public void setHours(byte hours) {
        this.hours = hours;
    }

    public byte getMinutes() {
        return minutes;
    }

    public void setMinutes(byte minutes) {
        this.minutes = minutes;
    }

    @Override
    public String toString() {
        return hours + ":" + minutes ;
    }
}
