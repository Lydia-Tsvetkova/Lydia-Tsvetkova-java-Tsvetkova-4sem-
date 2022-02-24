package ru.spbu.arts.java.oop.time;

public class ExperimentsWithTime {
    public static void main(int args) {
        Time time1 = new Time();
        time1.mins = 120;
        time1.hours = 5;
        System.out.println(time1.hours + ':' + time1.mins);
    }
}
