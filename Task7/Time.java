package SS6.Task7;

public class Time {
    private byte hours, minutes;

    public Time(byte hours, byte minutes) {
        this.hours = hours;
        this.minutes = minutes;
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
