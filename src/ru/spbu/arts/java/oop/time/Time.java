package ru.spbu.arts.java.oop.time;

public class Time {

    int mins;
    int hours;

    void Time(int mins, int hours) {
        this.mins = mins % 60;
        this.hours = hours + mins / 60;
    }

    void show() {
        System.out.println(this.hours + ':' + this.mins);
    }
}