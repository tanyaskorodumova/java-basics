package ru.itmo.java.basics.multithreading;

import static ru.itmo.java.basics.multithreading.CommonMain.joinAllThreads;

//2. Выведете состояние потока перед его запуском, после запуска и во время
//выполнения.
public class Task2 {
    public static void main(String[] args) {
        startAndGetState(new Thread(new CounterPrintRunnable(20)));
    }

    public static void startAndGetState(Thread thread) {
        System.out.println("State before start: " + thread.getState());
        thread.start();
        System.out.println("State in process: " + thread.getState());
        try {
            thread.join();
            System.out.println("State after completion: " + thread.getState());
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }
}
