package ru.itmo.java.basics.multithreading;

import java.util.Collection;

//1. Напишите программу, в которой запускается 10 потоков и каждый из них выводит
//числа от 0 до 100.
public class CounterPrintRunnable implements Runnable{
    private int count;

    public CounterPrintRunnable(int count) {
        this.count = count;
    }

    @Override
    public void run() {
        for (int i = 0; i <= count; i++) {
            System.out.println("I'm " + Thread.currentThread().getName() + ". This is my number " + i);
        }
    }
}
