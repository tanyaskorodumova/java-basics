package ru.itmo.java.basics.multithreading;

public class Counter {
    int count = 0;

    public void increment() {
        count = count + 1;
    }

    public int getCount() {
        return count;
    }

}
