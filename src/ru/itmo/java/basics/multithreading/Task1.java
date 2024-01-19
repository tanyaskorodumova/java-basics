package ru.itmo.java.basics.multithreading;

import static ru.itmo.java.basics.multithreading.CommonMain.joinAllThreads;

//1. Напишите программу, в которой запускается 10 потоков и каждый из них выводит
//числа от 0 до 100.
public class Task1 {
    public static void main(String[] args) {
        startRunnableThreads(10, new CounterPrintRunnable(100));
    }

    public static void startRunnableThreads(int number, Runnable runnable) {
        for (int i = 0; i < number; i++) {
            Thread newThread = new Thread(runnable);
            newThread.start();
        }
        //Ждем завершения всех созданных потоков
        joinAllThreads();
    }
}
