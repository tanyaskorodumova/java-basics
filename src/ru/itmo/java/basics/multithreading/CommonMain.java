package ru.itmo.java.basics.multithreading;

import static ru.itmo.java.basics.multithreading.Task1.startRunnableThreads;
import static ru.itmo.java.basics.multithreading.Task2.startAndGetState;
import static ru.itmo.java.basics.multithreading.Task3.threadCounter;
import static ru.itmo.java.basics.multithreading.Task4.pingPong;

//Общий метод для возможности единовременной проверки методов из всех заданий.
//Для удобстава чтения методы реализованы в отдельных классах, где есть также вызов этих методов.
public class CommonMain {
    public static void main(String[] args) {
        //Вызов метода из задания 1
        startRunnableThreads(10, new CounterPrintRunnable(100));

        System.out.println();

        //Вызов метода из задания 2
        startAndGetState(new Thread(new CounterPrintRunnable(20)));

        System.out.println();

        //Вызов метода из задания 3
        threadCounter(100, 1000);

        System.out.println();

        //Вызов метода из задания 4
        pingPong(1000);
    }

    //Метод для ожидания завершения всех "безымянных" потоков
    public static void joinAllThreads() {
        for (Thread curThread : Thread.getAllStackTraces().keySet()) {
            try {
                if (curThread.getName().contains("Thread-")) {
                    curThread.join();
                }
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
